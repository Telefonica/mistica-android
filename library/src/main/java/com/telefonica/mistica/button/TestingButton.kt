package com.telefonica.mistica.button

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView

class TestingButton : AbstractMisticaComposeView {

    private var buttonState by mutableStateOf(ButtonState())

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs = attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs = attrs)
    }

    fun init(
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
    ) {
        attrs?.let {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.ProgressButton,
                defStyleAttr,
                0
            )
            try {
                buttonState = ButtonState(
                    text = styledAttrs.getString(R.styleable.ProgressButton_text) ?: "",
                    loadingText = styledAttrs.getString(R.styleable.ProgressButton_loadingText) ?: "",
                    style = styledAttrs.getInt(R.styleable.ProgressButton_style, 0).toButtonStyle(),
                    isLoading = styledAttrs.getBoolean(R.styleable.ProgressButton_isLoading, false),
                    enabled = styledAttrs.getBoolean(R.styleable.ProgressButton_enabled, true),
                    icon = styledAttrs.getResourceId(R.styleable.ProgressButton_icon, 0).takeIf { it != 0 },
                )
            } finally {
                styledAttrs.recycle()
            }
        }
    }

    override fun setEnabled(isEnabled: Boolean) {
        super.setEnabled(isEnabled)
        buttonState = buttonState.copy(enabled = isEnabled)
    }

    fun setText(text: String) {
        buttonState = buttonState.copy(text = text)
    }

    fun setLoadingText(text: String) {
        buttonState = buttonState.copy(loadingText = text)
    }

    fun showLoading() {
        buttonState = buttonState.copy(isLoading = true)
    }

    fun hideLoading() {
        buttonState = buttonState.copy(isLoading = false)
    }

    fun setStyle(style: ButtonStyle) {
        buttonState = buttonState.copy(style = style)
    }

    fun setIcon(@DrawableRes icon: Int) {
        buttonState = buttonState.copy(icon = icon)
    }

    fun setOnClickListener(onClickListener: () -> Unit) {
        buttonState = buttonState.copy(onClickListener = onClickListener)
    }

    @Composable
    override fun Content() {
        Theme {
            Button(
                text = buttonState.text,
                loadingText = buttonState.loadingText,
                buttonStyle = buttonState.style,
                isLoading = buttonState.isLoading,
                enabled = buttonState.enabled,
                icon = buttonState.icon,
                onClickListener = buttonState.onClickListener
            )
        }
    }
}

data class ButtonState(
    val text: String = "",
    val loadingText: String = "",
    val style: ButtonStyle = ButtonStyle.PRIMARY,
    val isLoading: Boolean = false,
    val enabled: Boolean = true,
    @DrawableRes val icon: Int? = null,
    val onClickListener: () -> Unit = {},
)

private fun Int?.toButtonStyle(): ButtonStyle = when (this) {
    0 -> ButtonStyle.PRIMARY
    1 -> ButtonStyle.PRIMARY_SMALL
    2 -> ButtonStyle.SECONDARY
    3 -> ButtonStyle.SECONDARY_SMALL
    4 -> ButtonStyle.DANGER
    5 -> ButtonStyle.DANGER_SMALL
    6 -> ButtonStyle.LINK
    7 -> ButtonStyle.PRIMARY_INVERSE
    8 -> ButtonStyle.PRIMARY_SMALL_INVERSE
    9 -> ButtonStyle.SECONDARY_INVERSE
    10 -> ButtonStyle.SECONDARY_SMALL_INVERSE
    11 -> ButtonStyle.LINK_INVERSE
    else -> ButtonStyle.PRIMARY
}
