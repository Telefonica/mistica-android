package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.compose.common.DropDown
import com.telefonica.mistica.catalog.ui.compose.common.OnBackPressedHandler
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.emptystate.screen.EmptyStateScreen
import com.telefonica.mistica.compose.theme.MisticaTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun EmptyStateScreens() {

    var shouldShowEmptyStateScreen by remember { mutableStateOf(false) }
    OnBackPressedHandler(
        shouldHandleBack = shouldShowEmptyStateScreen,
        onBackPressed = {
            shouldShowEmptyStateScreen = false
        }
    )
    val retryDelay = 2000L
    val coroutineScope = rememberCoroutineScope()
    var imageSize by remember { mutableStateOf(EmptyStateScreen.ImageSize.ICON) }
    var title: String by remember { mutableStateOf("title") }
    var subtitle: String by remember { mutableStateOf("subtitle") }
    var buttonConfig by remember { mutableStateOf(EmptyStateScreen.ButtonConfig.PRIMARY) }
    var primaryButtonText: String by remember { mutableStateOf("Explore Marketplace") }
    var primaryButtonTextLoading: String by remember { mutableStateOf("") }
    var secondaryButtonText: String by remember { mutableStateOf("Secondary Action") }
    var linkButtonText: String by remember { mutableStateOf("More info") }
    var isPrimaryButtonLoading: Boolean by remember { mutableStateOf(false) }

    if (shouldShowEmptyStateScreen) {
        EmptyStateScreen(
            modifier = Modifier.fillMaxSize(),
            imageResId = R.drawable.empty_state_screen_image,
            imageSize = imageSize,
            title = title,
            subtitle = subtitle,
            buttonConfig = buttonConfig,
            primaryButtonText = primaryButtonText,
            primaryButtonLoadingText = primaryButtonTextLoading,
            onPrimaryButtonClickListener = {
                if (primaryButtonTextLoading.isNotEmpty()) {
                    isPrimaryButtonLoading = true
                    coroutineScope.launch {
                        delay(retryDelay)
                        isPrimaryButtonLoading = false
                    }
                }
            },
            secondaryButtonText = secondaryButtonText,
            linkButtonText = linkButtonText,
            isPrimaryButtonLoading = isPrimaryButtonLoading
        )
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            Text(
                text = "EMPTY STATES TESTER",
                style = MisticaTheme.typography.preset1Medium,
                color = MisticaTheme.colors.textSecondary,
            )

            DropDown(
                modifier = Modifier.padding(top = 8.dp),
                selectedValue = imageSize,
                onValueChanged = { imageSize = it }
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = title,
                onValueChange = { title = it },
                label = { Text("Title") }
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = subtitle,
                onValueChange = { subtitle = it },
                label = { Text("Subtitle") }
            )
            DropDown(
                modifier = Modifier.padding(top = 8.dp),
                selectedValue = buttonConfig,
                onValueChanged = { buttonConfig = it }
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = primaryButtonText,
                onValueChange = { primaryButtonText = it },
                label = { Text("Primary Button Text") }
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = primaryButtonTextLoading,
                onValueChange = { primaryButtonTextLoading = it },
                label = { Text("Primary Button Loading Text") }
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = secondaryButtonText,
                onValueChange = { secondaryButtonText = it },
                label = { Text("Secondary Button Text") }
            )
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = linkButtonText,
                onValueChange = { linkButtonText = it },
                label = { Text("Link Button Text") }
            )
            Button(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                text = "Show",
                onClickListener = {
                    shouldShowEmptyStateScreen = true
                }
            )
        }
    }
}
