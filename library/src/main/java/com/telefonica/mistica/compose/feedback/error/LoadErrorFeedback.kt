package com.telefonica.mistica.compose.feedback

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

@Composable
fun LoadErrorFeedback(
    titleText: String? = null,
    descriptionText: String? = null,
    isLoading: Boolean = false,
    buttonText: String? = null,
    buttonLoadingText: String = "",
    loadingAction: () -> Unit,
) {

    Column(modifier = Modifier.padding(16.dp)) {
        titleText?.let {
            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally),
                text = it,
                textAlign = TextAlign.Center,
                style = MisticaTheme.typography.preset4Light,
                color = MisticaTheme.colors.textPrimary
            )
        }
        descriptionText?.let {
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = it,
                textAlign = TextAlign.Center,
                style = MisticaTheme.typography.preset2,
                color = MisticaTheme.colors.textSecondary
            )
        }
        buttonText?.let {
            Button(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .align(Alignment.CenterHorizontally),
                text = it,
                loadingText = buttonLoadingText,
                onClickListener = loadingAction,
                isLoading = isLoading,
                buttonStyle = ButtonStyle.SECONDARY
            )
        }
    }

}

@Preview
@Composable
fun LoadErrorFeedbackPreview() {
    MisticaTheme(brand = MovistarBrand) {
        LoadErrorFeedback(
            titleText = "Title",
            descriptionText = "Something went wrong, this is the description of the failure. Try to retry if you want.",
            buttonText = "Button text",
            buttonLoadingText = "Loading"
        ) {

        }
    }
}

@Preview
@Composable
fun LoadErrorFeedbackNoButtonPreview() {
    MisticaTheme(brand = MovistarBrand) {
        LoadErrorFeedback(
            titleText = "Title",
            descriptionText = "Something went wrong, this is the description of the failure. Try to retry if you want.",
        ) {

        }
    }
}

