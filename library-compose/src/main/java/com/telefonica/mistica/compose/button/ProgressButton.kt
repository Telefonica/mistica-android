package com.telefonica.mistica.compose.button

import android.view.LayoutInflater
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.compose.R

@Composable
fun ProgressButton(
    text: String,
    loadingText: String,
    buttonStyle: ProgressButtonStyle = ProgressButtonStyle.PRIMARY,
    onClickListener: (LoadingControls) -> Unit,

    ) {
    AndroidView(factory = { context ->
        val view = LayoutInflater.from(context).inflate(getButtonStyle(buttonStyle), null)
        val progressButton: com.telefonica.mistica.button.ProgressButton = view.findViewById(R.id.progress_button)
        progressButton.apply {
            setText(text)
            setLoadingText(loadingText)
            val loadingControls = LoadingControls(
                startLoading = { setIsLoading(true) },
                stopLoading = { setIsLoading(false) },
            )
            setOnClickListener { onClickListener(loadingControls) }
        }
        view
    })

}

private fun getButtonStyle(style: ProgressButtonStyle) = when (style) {
    ProgressButtonStyle.DANGER -> R.layout.progress_button_danger_wrapper
    ProgressButtonStyle.DANGER_SMALL -> R.layout.progress_button_danger_small_wrapper
    ProgressButtonStyle.LINK_INVERSE -> R.layout.progress_button_link_inverse_wrapper
    ProgressButtonStyle.LINK -> R.layout.progress_button_link_wrapper
    ProgressButtonStyle.PRIMARY_INVERSE -> R.layout.progress_button_primary_inverse_wrapper
    ProgressButtonStyle.PRIMARY_SMALL_INVERSE -> R.layout.progress_button_primary_small_inverse_wrapper
    ProgressButtonStyle.PRIMARY_SMALL -> R.layout.progress_button_primary_small_wrapper
    ProgressButtonStyle.PRIMARY -> R.layout.progress_button_primary_wrapper
    ProgressButtonStyle.SECONDARY_INVERSE -> R.layout.progress_button_secondary_inverse_wrapper
    ProgressButtonStyle.SECONDARY_SMALL_INVERSE -> R.layout.progress_button_secondary_small_inverse_wrapper
    ProgressButtonStyle.SECONDARY_SMALL -> R.layout.progress_button_secondary_small_wrapper
    ProgressButtonStyle.SECONDARY -> R.layout.progress_button_secondary_wrapper
}

class LoadingControls(val startLoading: () -> Unit, val stopLoading: () -> Unit)


enum class ProgressButtonStyle {
    DANGER,
    DANGER_SMALL,
    LINK_INVERSE,
    LINK,
    PRIMARY_INVERSE,
    PRIMARY_SMALL_INVERSE,
    PRIMARY_SMALL,
    PRIMARY,
    SECONDARY_INVERSE,
    SECONDARY_SMALL_INVERSE,
    SECONDARY_SMALL,
    SECONDARY
}