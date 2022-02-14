package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.catalog.R
import com.telefonica.mistica.compose.catalog.ui.common.DropDown
import com.telefonica.mistica.compose.catalog.ui.common.OnBackPressedHandler
import com.telefonica.mistica.compose.emptystate.screen.EmptyStateScreen
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun EmptyStateScreens() {

    var shouldShowEmptyStateScreen by remember { mutableStateOf(false) }
    OnBackPressedHandler(
        shouldHandleBack = shouldShowEmptyStateScreen,
        onBackPressed = {
            shouldShowEmptyStateScreen = false
        }
    )

    var imageSize by remember { mutableStateOf(EmptyStateScreen.ImageSize.ICON) }
    var title: String by remember { mutableStateOf("title") }
    var subtitle: String by remember { mutableStateOf("subtitle") }
    var buttonConfig by remember { mutableStateOf(EmptyStateScreen.ButtonConfig.PRIMARY) }
    var primaryButtonText: String by remember { mutableStateOf("Explore Marketplace") }
    var secondaryButtonText: String by remember { mutableStateOf("Secondary Action") }
    var linkButtonText: String by remember { mutableStateOf("More info") }

    if (shouldShowEmptyStateScreen) {
        EmptyStateScreen(
            modifier = Modifier.fillMaxSize(),
            imageResId = R.drawable.empty_state_screen_image,
            imageSize = imageSize,
            title = title,
            subtitle = subtitle,
            buttonConfig = buttonConfig,
            primaryButtonText = primaryButtonText,
            secondaryButtonText = secondaryButtonText,
            linkButtonText = linkButtonText
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