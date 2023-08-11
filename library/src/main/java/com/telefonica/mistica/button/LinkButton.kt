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

class LinkButton : AbstractMisticaComposeView {

    private var text: String by mutableStateOf("")
    private var loadingText: String by mutableStateOf("")
    private var isLoading: Boolean by mutableStateOf(false)
    private var isInverse: Boolean by mutableStateOf(false)
    private var style: ButtonStyle by mutableStateOf(ButtonStyle.LINK)
    private var icon: Int? by mutableStateOf(null)

    private var onClick: () -> Unit by mutableStateOf({})
    private var isEnable: Boolean by mutableStateOf(true)
    private var withChevron: Boolean by mutableStateOf(true)

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
            val textTypedArray = context.obtainStyledAttributes(attrs, intArrayOf(android.R.attr.text))
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
                isInverse = styledAttrs.getBoolean(R.styleable.Button_isInverse, false)
                style = if (isInverse) ButtonStyle.LINK_INVERSE else ButtonStyle.LINK
                isEnable = styledAttrs.getBoolean(R.styleable.Button_enabled, true)
                icon = styledAttrs.getResourceId(R.styleable.Button_icon, 0).takeIf { it != 0 }
                withChevron = styledAttrs.getBoolean(R.styleable.Button_withChevron, false)
            } finally {
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
