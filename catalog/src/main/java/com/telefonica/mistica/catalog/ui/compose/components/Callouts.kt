package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.callout.CalloutViewImageConfig
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.compose.common.DropDown
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.callout.Callout
import com.telefonica.mistica.compose.callout.CalloutButtonConfig
import com.telefonica.mistica.compose.input.DropDownInput
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Callouts() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp)
            .background(MisticaTheme.colors.background),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        var inverse by remember { mutableStateOf(false) }
        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = inverse, onCheckedChange = { inverse = !inverse })
            Text("Inverse variant")
        }

        var iconType: CalloutViewImageConfig by remember { mutableStateOf(CalloutViewImageConfig.ICON) }
        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp, 8.dp),
            items = CalloutViewImageConfig.values().map { it.name },
            currentItemIndex = CalloutViewImageConfig.values().indexOf(iconType),
            onItemSelected = { index -> iconType = CalloutViewImageConfig.values()[index] },
            hint = "Icon type",
        )

        var dismissable by remember { mutableStateOf(false) }
        Row(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = dismissable, onCheckedChange = { dismissable = !dismissable })
            Text("Is dismissable")
        }

        var title by remember { mutableStateOf("Callout sample title") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") }
        )

        var description by remember { mutableStateOf("Callout sample description") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = description,
            onValueChange = { description = it },
            label = { Text("Description") }
        )

        var buttonConfig by remember { mutableStateOf(CalloutButtonConfig.PRIMARY) }
        DropDown(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            selectedValue = buttonConfig,
            onValueChanged = { buttonConfig = it }
        )

        var primaryButtonText by remember { mutableStateOf("Primary Action") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = primaryButtonText,
            onValueChange = { primaryButtonText = it },
            label = { Text("Primary Button text") }
        )

        var secondaryButtonText by remember { mutableStateOf("Secondary Action") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = secondaryButtonText,
            onValueChange = { secondaryButtonText = it },
            label = { Text("Secondary Button text") }
        )

        var linkText by remember { mutableStateOf("Link Action") }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = linkText,
            onValueChange = { linkText = it },
            label = { Text("Link Button text") }
        )

        var isShown by remember { mutableStateOf(true) }

        if (isShown) {
            Box(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth()
                    .let {
                        if (inverse) {
                            it.background(MisticaTheme.brushes.backgroundBrand)
                        } else {
                            it.background(MisticaTheme.colors.background)
                        }
                    },
            ) {
                Callout(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    title = title.takeIf { it.isNotBlank() },
                    description = description.takeIf { it.isNotBlank() },
                    buttonConfig = buttonConfig,
                    imageConfig = iconType,
                    iconRes = when (iconType) {
                        CalloutViewImageConfig.NONE -> null
                        CalloutViewImageConfig.ICON -> R.drawable.ic_callout
                        CalloutViewImageConfig.CIRCULAR_IMAGE -> R.drawable.media_card_sample_image
                        CalloutViewImageConfig.SQUARE_IMAGE -> R.drawable.card_image_sample
                    },
                    dismissable = dismissable,
                    inverse = inverse,
                    onDismiss = { isShown = false },
                    primaryButtonText = primaryButtonText.takeIf { it.isNotBlank() },
                    secondaryButtonText = secondaryButtonText.takeIf { it.isNotBlank() },
                    linkText = linkText.takeIf { it.isNotBlank() },
                )
            }
        } else {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp),
                text = "Show callout again",
                onClickListener = {
                    isShown = true
                }
            )
        }
    }
}
