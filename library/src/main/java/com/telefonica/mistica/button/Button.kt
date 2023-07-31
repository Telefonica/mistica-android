package com.telefonica.mistica.button

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

class Button : AbstractMisticaComposeView {

    var text: String by mutableStateOf("")
    var loadingText: String by mutableStateOf("")
    var isLoading: Boolean by mutableStateOf(false)
    var style: ButtonStyle by mutableStateOf(ButtonStyle.PRIMARY)
    var icon: Int? by mutableStateOf(null)

    private var onClick: () -> Unit by mutableStateOf({})
    private var isEnable: Boolean by mutableStateOf(true)

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
                R.styleable.Button,
                defStyleAttr,
                0
            )
            try {
                text = styledAttrs.getString(R.styleable.Button_text) ?: ""
                loadingText = styledAttrs.getString(R.styleable.Button_loadingText) ?: ""
                style = styledAttrs.getInt(R.styleable.Button_style, 0).toButtonStyle()
                isLoading = styledAttrs.getBoolean(R.styleable.Button_isLoading, false)
                isEnable = styledAttrs.getBoolean(R.styleable.Button_enabled, true)
                icon = styledAttrs.getResourceId(R.styleable.Button_icon, 0).takeIf { it != 0 }
            } finally {
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
