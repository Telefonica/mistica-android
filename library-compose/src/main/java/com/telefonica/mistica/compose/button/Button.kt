package com.telefonica.mistica.compose.button

import android.view.LayoutInflater
import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.compose.R

@Composable
fun Button(
    text: String,
    loadingText: String = "",
    buttonStyle: ButtonStyle = ButtonStyle.PRIMARY,
    isLoading: Boolean = false,
    onClickListener: () -> Unit,
) {
    fun View.updateButton() {
        findViewById<com.telefonica.mistica.button.ProgressButton>(R.id.button).apply {
            setText(text)
            setLoadingText(loadingText)
            setIsLoading(isLoading)
            setOnClickListener { onClickListener() }
        }
    }

    AndroidView(
        factory = { context ->
            val view = LayoutInflater.from(context).inflate(getButtonStyle(buttonStyle), null)
            view.updateButton()
            view
        },
        update = { view -> view.updateButton() }
    )
}

private fun getButtonStyle(style: ButtonStyle) = when (style) {
    ButtonStyle.DANGER -> R.layout.button_danger_wrapper
    ButtonStyle.DANGER_SMALL -> R.layout.button_danger_small_wrapper
    ButtonStyle.LINK_INVERSE -> R.layout.button_link_inverse_wrapper
    ButtonStyle.LINK -> R.layout.button_link_wrapper
    ButtonStyle.PRIMARY_INVERSE -> R.layout.button_primary_inverse_wrapper
    ButtonStyle.PRIMARY_SMALL_INVERSE -> R.layout.button_primary_small_inverse_wrapper
    ButtonStyle.PRIMARY_SMALL -> R.layout.button_primary_small_wrapper
    ButtonStyle.PRIMARY -> R.layout.button_primary_wrapper
    ButtonStyle.SECONDARY_INVERSE -> R.layout.button_secondary_inverse_wrapper
    ButtonStyle.SECONDARY_SMALL_INVERSE -> R.layout.button_secondary_small_inverse_wrapper
    ButtonStyle.SECONDARY_SMALL -> R.layout.button_secondary_small_wrapper
    ButtonStyle.SECONDARY -> R.layout.button_secondary_wrapper
}

enum class ButtonStyle {
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
