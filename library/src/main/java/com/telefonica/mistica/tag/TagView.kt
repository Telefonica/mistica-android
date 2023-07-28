package com.telefonica.mistica.tag

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.IntDef
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ERROR
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INVERSE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_SUCCESS
import com.telefonica.mistica.tag.TagView.Companion.TYPE_WARNING

@Retention(AnnotationRetention.SOURCE)
@IntDef(
    TYPE_PROMO,
    TYPE_ACTIVE,
    TYPE_INACTIVE,
    TYPE_SUCCESS,
    TYPE_WARNING,
    TYPE_ERROR,
    TYPE_INVERSE,
)
annotation class TagStyle

class TagView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractMisticaComposeView(
    context,
    attrs,
    defStyleAttr
) {

    @TagStyle
    var style by mutableStateOf(TYPE_PROMO)
    var text: String by mutableStateOf("")
    var icon: Int? by mutableStateOf(null)

    init {
        attrs?.let {
            val styledAttrs = context.theme.obtainStyledAttributes(attrs, R.styleable.TagView, defStyleAttr, 0)
            try {
                style = styledAttrs.getInt(R.styleable.TagView_tagStyle, TYPE_PROMO)
                icon = styledAttrs.getResourceId(R.styleable.TagView_tagIcon, 0).takeIf { it != 0 }
                text = styledAttrs.getString(R.styleable.TagView_tagText) ?: ""
            } finally {
                styledAttrs.recycle()
            }
        }
    }

    @Composable
    override fun Content() {
        Theme {
            Tag(
                text = text,
                style = style,
                icon = icon
            )
        }
    }

    companion object {
        const val TYPE_PROMO = 0
        const val TYPE_ACTIVE = 1
        const val TYPE_INACTIVE = 2
        const val TYPE_SUCCESS = 3
        const val TYPE_WARNING = 4
        const val TYPE_ERROR = 5
        const val TYPE_INVERSE = 6
    }
}
