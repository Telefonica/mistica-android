package com.telefonica.mistica.button2

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView

class Button @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractMisticaComposeView(context, attrs, defStyleAttr) {

    var text: String by mutableStateOf("")
    private var loadingText: String by mutableStateOf("")
    private var isLoading: Boolean by mutableStateOf(false)
    private var style: ButtonStyle by mutableStateOf(ButtonStyle.PRIMARY)
    private var icon: Int? by mutableStateOf(null)
    private var isEnable: Boolean by mutableStateOf(true)
    private var withChevron: Boolean by mutableStateOf(true)
    private var onClick: () -> Unit by mutableStateOf({})

     init {
        attrs?.let {
            val textTypedArray = context.obtainStyledAttributes(attrs, intArrayOf(android.R.attr.text))
            val enabledTypedArray = context.obtainStyledAttributes(attrs, intArrayOf(android.R.attr.enabled))
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Button,
                defStyleAttr,
                0
            )
            try {
                text = textTypedArray.getText(0).toString()
                loadingText = styledAttrs.getString(R.styleable.Button_loadingText) ?: ""
                isLoading = styledAttrs.getBoolean(R.styleable.Button_isLoading, false)
                style = styledAttrs.getInt(R.styleable.Button_style, 0).toButtonStyle()
                isEnable = enabledTypedArray.getBoolean(0, true)
                icon = styledAttrs.getResourceId(R.styleable.Button_icon, 0).takeIf { it != 0 }
                withChevron = styledAttrs.getBoolean(R.styleable.Button_withChevron, false)
            } finally {
                enabledTypedArray.recycle()
                textTypedArray.recycle()
                styledAttrs.recycle()
            }
        }
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        isEnable = enabled
    }

    override fun setOnClickListener(listener: OnClickListener?) {
        onClick = { listener?.onClick(this) }
    }

    fun updateLoadingText(text: String) {
        loadingText = text
    }

    fun showLoading() {
        isLoading = true
    }

    fun hideLoading() {
        isLoading = false
    }

    fun showChevron() {
        withChevron = true
    }

    @Composable
    override fun Content() {
        Theme {
            Button(
                text = text,
                loadingText = loadingText,
                buttonStyle = style,
                isLoading = isLoading,
                enabled = isEnable,
                icon = icon,
                withChevron = withChevron,
                onClickListener = onClick
            )
        }
    }
}

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