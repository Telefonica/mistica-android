package com.telefonica.mistica.title

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.IntDef
import androidx.annotation.StyleRes
import androidx.annotation.VisibleForTesting
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.setTextAndVisibility
import com.telefonica.mistica.util.setTextPreset

@BindingMethods(
    BindingMethod(
        type = TitleView::class,
        attribute = "title",
        method = "setTitle"
    ),
    BindingMethod(
        type = TitleView::class,
        attribute = "titleStyle",
        method = "setTitleStyle"
    ),
    BindingMethod(
        type = TitleView::class,
        attribute = "isTitleHeading",
        method = "setTitleHeading"
    ),
    BindingMethod(
        type = TitleView::class,
        attribute = "link",
        method = "setLink"
    ),
    BindingMethod(
        type = TitleView::class,
        attribute = "linkOnClick",
        method = "setOnLinkClickedListener"
    )
)
class TitleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TITLE_1,
        TITLE_2,
    )
    annotation class TitleStyle

    private var linkTextView: TextView
    private var titleTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.title, this, true)

        titleTextView = findViewById(R.id.title_text)
        linkTextView = findViewById(R.id.link_text)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.TitleView,
                    defStyleAttr,
                    0
                )

            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.TitleView_title))
            setTitleStyle(styledAttrs.getInt(R.styleable.TitleView_titleStyle, -1))

            styledAttrs.getBoolean(
                R.styleable.TitleView_isTitleHeading,
                false
            )
                .takeIf { it }
                ?.let { setTitleHeading() }

            linkTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.TitleView_link))

            styledAttrs.recycle()
        }
    }

    fun getTitle(): String = titleTextView.text.toString()

    @VisibleForTesting
    internal fun getTitleTextView(): TextView = titleTextView

    fun setTitle(text: CharSequence?) {
        titleTextView.setTextAndVisibility(text)
    }

    fun setTitleStyle(@TitleStyle style: Int) {
        val styleConfig = when (style) {
            TITLE_1 -> TITLE_1_STYLE_CONFIG
            TITLE_2 -> TITLE_2_STYLE_CONFIG
            else -> TITLE_1_STYLE_CONFIG
        }

        titleTextView.setTextPreset(styleConfig.preset)
        titleTextView.setTextColor(context.getThemeColor(styleConfig.colorAttrRes))
        titleTextView.isAllCaps = styleConfig.isAllCaps
    }

    fun setTitleHeading() {
        ViewCompat.setAccessibilityHeading(titleTextView, true)
    }

    fun getLink(): String = linkTextView.text.toString()

    fun setLink(text: CharSequence?) {
        linkTextView.setTextAndVisibility(text)
    }

    fun setOnLinkClickedListener(listener: () -> Unit) {
        linkTextView.setOnClickListener { listener.invoke() }
    }

    companion object {
        const val TITLE_1 = 0
        const val TITLE_2 = 1

        private val TITLE_1_STYLE_CONFIG = TitleStyleConfig(
            preset = R.style.AppTheme_TextAppearance_PresetTitle1,
            colorAttrRes = R.attr.colorTextSecondary,
            isAllCaps = true,
        )

        private val TITLE_2_STYLE_CONFIG = TitleStyleConfig(
            preset = R.style.AppTheme_TextAppearance_Preset5,
            colorAttrRes = R.attr.colorTextPrimary,
            isAllCaps = false,
        )
    }
}

private data class TitleStyleConfig(
    @StyleRes val preset: Int,
    @AttrRes val colorAttrRes: Int,
    val isAllCaps: Boolean,
)