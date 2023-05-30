package com.telefonica.mistica.catalog.ui.compose.components

import android.content.Context
import android.content.Intent
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.RawRes
import androidx.annotation.StyleRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.classic.activity.FeedbackScreenCatalogActivity
import com.telefonica.mistica.compose.feedback.Feedback
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Feedbacks(
    @StyleRes themeOverride: Int? = null,
) {

    val retryDelay = 2000L
    var showFeedbackClassic by remember { mutableStateOf(false) }
    var showFeedbackCompose by remember { mutableStateOf(false) }

    var feedbackTypeExpanded by remember { mutableStateOf(false) }
    var type by remember { mutableStateOf(Type.INFO) }
    var title: String by remember { mutableStateOf("This is a title") }
    var subtitle: String by remember { mutableStateOf("This is the feedback description") }
    var errorReference: String by remember { mutableStateOf("Error reference: #95001") }
    var firstButtonText: String by remember { mutableStateOf("Feedback First Button Text") }
    var firstButtonLoadingText: String by remember { mutableStateOf("Feedback First Button Loading Text") }
    var secondButtonText: String by remember { mutableStateOf("Feedback Second Button Text") }
    var secondButtonAsLink by remember { mutableStateOf(false) }
    var showFirstButtonLoading: Boolean by remember { mutableStateOf(false) }
    var isFirstButtonLoading: Boolean by remember { mutableStateOf(false) }
    var customAnimationExpanded by remember { mutableStateOf(false) }
    var customAnimation: CustomFeedbackAnimation by remember { mutableStateOf(CustomFeedbackAnimation.NONE) }
    var customIconExpanded by remember { mutableStateOf(false) }
    var customIcon: CustomFeedbackIcon by remember { mutableStateOf(CustomFeedbackIcon.NONE) }
    var shouldAnimateOnAttached: Boolean by remember { mutableStateOf(true) }
    val coroutineScope = rememberCoroutineScope()

    if (showFeedbackClassic) {
        showFeedbackClassic = false
        showFeedbackActivity(
            context = LocalContext.current,
            type = type.type,
            title = title,
            subtitle = subtitle,
            errorReference = errorReference,
            firstButtonText = firstButtonText,
            firstButtonLoadingText = firstButtonLoadingText,
            secondButtonText = secondButtonText,
            showSecondButtonAsLink = secondButtonAsLink,
            customAnimation = customAnimation.resource,
            customIcon = customIcon.resource,
            themeOverride = themeOverride,
            shouldAnimateOnAttached = shouldAnimateOnAttached
        )
    }
    if (showFeedbackCompose) {
        Feedback(
            type = type.type,
            title = title,
            subtitle = subtitle,
            errorReference = errorReference,
            firstButtonText = firstButtonText,
            firstButtonLoadingText = firstButtonLoadingText,
            secondButtonText = secondButtonText,
            firstButtonOnClick = {
                if (showFirstButtonLoading) {
                    isFirstButtonLoading = true
                    coroutineScope.launch {
                        delay(retryDelay)
                        isFirstButtonLoading = false
                    }
                }
            },
            secondButtonOnClick = {},
            secondButtonAsLink = secondButtonAsLink,
            customAnimation = customAnimation.resource,
            customIcon = customIcon.resource,
            isFirstButtonLoading = isFirstButtonLoading,
            onBackPressed = { showFeedbackCompose = false },
            shouldAnimateOnAttached = shouldAnimateOnAttached
        )

    } else {
        ConstraintLayout {
            val (buttonBox, scrollView) = createRefs()
            Column(
                modifier = Modifier
                    .constrainAs(scrollView) {
                        bottom.linkTo(buttonBox.top)
                        top.linkTo(parent.top)
                    }
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(30.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                OutlinedTextField(
                    modifier = Modifier.padding(top = 20.dp).clickable { feedbackTypeExpanded = true },
                    readOnly = true,
                    enabled = false,
                    value = type.name,
                    onValueChange = { },
                    label = { Text("Feedback Type") },
                    trailingIcon = { Icon(Icons.Filled.ArrowDropDown, "contentDescription") }
                )
                Box {
                    DropdownMenu(expanded = feedbackTypeExpanded, onDismissRequest = { feedbackTypeExpanded = false }) {
                        Type.values().forEach {
                            DropdownMenuItem(
                                content = { Text(it.name) },
                                onClick = {
                                    feedbackTypeExpanded = false
                                    type = it
                                }
                            )
                        }
                    }
                }

                OutlinedTextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
                OutlinedTextField(value = subtitle, onValueChange = { subtitle = it }, label = { Text("Subtitle") })
                OutlinedTextField(value = errorReference, onValueChange = { errorReference = it }, label = { Text("Error Reference") })
                OutlinedTextField(value = firstButtonText ?: "", onValueChange = { firstButtonText = it }, label = { Text("First Button") })
                OutlinedTextField(
                    value = firstButtonLoadingText,
                    onValueChange = { firstButtonLoadingText = it },
                    label = { Text("First Button Loading") })
                OutlinedTextField(value = secondButtonText ?: "", onValueChange = { secondButtonText = it }, label = { Text("Second Button") })

                OutlinedTextField(
                    modifier = Modifier.clickable { customAnimationExpanded = true },
                    readOnly = true,
                    enabled = false,
                    value = customAnimation.name,
                    onValueChange = { },
                    label = { Text("Content Animation") },
                    trailingIcon = { Icon(Icons.Filled.ArrowDropDown, "contentDescription") }
                )
                Box {
                    DropdownMenu(expanded = customAnimationExpanded, onDismissRequest = { customAnimationExpanded = false }) {
                        CustomFeedbackAnimation.values().forEach {
                            DropdownMenuItem(
                                content = { Text(it.name) },
                                onClick = {
                                    customAnimationExpanded = false
                                    customAnimation = it
                                }
                            )
                        }
                    }
                }

                OutlinedTextField(
                    modifier = Modifier.clickable { customIconExpanded = true },
                    readOnly = true,
                    enabled = false,
                    value = customIcon.name,
                    onValueChange = { },
                    label = { Text("Content Icon") },
                    trailingIcon = { Icon(Icons.Filled.ArrowDropDown, "contentDescription") }
                )
                Box {
                    DropdownMenu(expanded = customIconExpanded, onDismissRequest = { customIconExpanded = false }) {
                        CustomFeedbackIcon.values().forEach {
                            DropdownMenuItem(
                                content = { Text(it.name) },
                                onClick = {
                                    customIconExpanded = false
                                    customIcon = it
                                }
                            )
                        }
                    }
                }

                Row(verticalAlignment = CenterVertically) {
                    Text("First button loading")
                    Checkbox(checked = showFirstButtonLoading, onCheckedChange = { showFirstButtonLoading = it })
                }
                Row(verticalAlignment = CenterVertically) {
                    Text("Second button as link")
                    Checkbox(checked = secondButtonAsLink, onCheckedChange = { secondButtonAsLink = it })
                }
                Row(verticalAlignment = CenterVertically) {
                    Text("Should animate on attached")
                    Checkbox(checked = shouldAnimateOnAttached, onCheckedChange = { shouldAnimateOnAttached = it })
                }
            }
            CommmonButtonLaunchBlock(
                modifier = Modifier.constrainAs(buttonBox) { bottom.linkTo(parent.bottom) },
                onLaunchClassic = { showFeedbackClassic = true },
                onLaunchCompose = { showFeedbackCompose = true },
            )
        }
    }

}

private enum class Type(@FeedbackScreenView.FeedbackType val type: Int) {
    SUCCESS(FeedbackScreenView.TYPE_SUCCESS),
    ERROR(FeedbackScreenView.TYPE_ERROR),
    INFO(FeedbackScreenView.TYPE_INFO),
}

private enum class CustomFeedbackAnimation(@RawRes val resource: Int?) {
    NONE(null),
    ERROR_O2(R.raw.feedback_error_o2),
    SUCCESS_VIVO(R.raw.feedback_success_vivo),
}

private enum class CustomFeedbackIcon(@DrawableRes val resource: Int?) {
    NONE(null),
    ERROR_LIGHT(R.drawable.feedback_error_light),
    INFO_O2(R.drawable.feedback_info_o2),
}

private fun showFeedbackActivity(
    context: Context,
    @FeedbackScreenView.FeedbackType type: Int,
    title: String?,
    subtitle: String?,
    errorReference: String?,
    @LayoutRes customContentLayout: Int = FeedbackScreenCatalogActivity.INVALID_DEFAULT_VALUE,
    firstButtonText: String?,
    firstButtonLoadingText: String?,
    secondButtonText: String?,
    showSecondButtonAsLink: Boolean = FeedbackScreenCatalogActivity.SHOW_SECOND_BUTTON_AS_LINK_DEFAULT_VALUE,
    showLoadingInButton: Boolean = FeedbackScreenCatalogActivity.SHOW_LOADING_IN_BUTTON_DEFAULT_VALUE,
    customAnimation: Int? = null,
    customIcon: Int? = null,
    shouldAnimateOnAttached: Boolean,
    @StyleRes themeOverride: Int? = null,
) {
    Intent(context, FeedbackScreenCatalogActivity::class.java).apply {
        putExtra(FeedbackScreenCatalogActivity.EXTRA_TYPE, type)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_TITLE, title)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_SUBTITLE, subtitle)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_ERROR_REFERENCE, errorReference)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_FIRST_BUTTON_TEXT, firstButtonText)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_FIRST_BUTTON_LOADING_TEXT, firstButtonLoadingText)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_SECOND_BUTTON_TEXT, secondButtonText)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_CUSTOM_CONTENT, customContentLayout)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_SHOW_SECOND_BUTTON_AS_LINK, showSecondButtonAsLink)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_SHOW_LOADING_IN_BUTTON, showLoadingInButton)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_CUSTOM_ICON, customIcon)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_CUSTOM_ANIMATION, customAnimation)
        putExtra(FeedbackScreenCatalogActivity.EXTRA_SHOULD_ANIMATE_ON_ATTACHED, shouldAnimateOnAttached)
        themeOverride?.let { putExtra(FeedbackScreenCatalogActivity.EXTRA_THEME, it) }
        context.startActivity(this)
    }
}