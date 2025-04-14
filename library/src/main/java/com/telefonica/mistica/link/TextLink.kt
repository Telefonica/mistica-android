package com.telefonica.mistica.link

import android.content.Context
import android.graphics.Color
import android.text.method.LinkMovementMethod
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.link.MultiLink.CustomMultiLink
import com.telefonica.mistica.link.MultiLink.DefaultMultiLink
import com.telefonica.mistica.link.SingleLink.CustomSingleLink
import com.telefonica.mistica.link.SingleLink.DefaultSingleLink
import com.telefonica.mistica.util.getThemeColor

@BindingMethods(
    BindingMethod(
        type = TextLink::class,
        attribute = "linkColor",
        method = "setLinkColor"
    ),
)
class TextLink @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AppCompatTextView(
    context,
    attrs,
    defStyleAttr
) {

    @ColorInt
    private var linkColor: Int = context.getThemeColor(R.attr.colorTextLink)

    private val links: MutableList<MultiLink>? = null

    init {
        movementMethod = LinkMovementMethod.getInstance()
        highlightColor = Color.TRANSPARENT


       if (attrs != null) {
            if (attrs.hasCustomStyle().not()) {
                // Ensure default style if there is no custom style
                setTextAppearance(context, R.style.AppTheme_TextAppearance_Preset2_Medium)
            }

            val styledAttrs =
                context.theme.obtainStyledAttributes(attrs, R.styleable.TextLinkView, defStyleAttr, 0)
            setLinkColor(styledAttrs.getColor(R.styleable.TextLinkView_linkColor, context.getThemeColor(R.attr.colorTextLink)))
        }
    }

    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(text, type)
        updateView()
    }

    fun setSingleTextLink(singleLink: SingleLink) {
        setSingleTextLink(text.toString(), singleLink)
    }

    fun setSingleTextLink(originalText: String, singleLink: SingleLink) {
        text = getSpannableLinkText(
            originalText = originalText,
            links = listOf(singleLink.toMultiLink(originalText)),
            linkColor = linkColor,
        )
    }

    fun setMultiLinkText(links: List<MultiLink>) {
        setMultiLinkText(text.toString(), links)
    }

    fun setMultiLinkText(originalText: String, links: List<MultiLink>) {
        text = getSpannableLinkText(
            originalText = originalText,
            links = links,
            linkColor = linkColor,
        )
    }

    @Suppress("MemberVisibilityCanBePrivate")
    fun setLinkColor(@ColorInt linkColor: Int) {
        if (this.linkColor != linkColor) {
            this.linkColor = linkColor
            updateView()
        }
    }

    private fun updateView() {
        if (!links.isNullOrEmpty()) {
            setMultiLinkText(text.toString(), links)
        }
    }

    private fun SingleLink.toMultiLink(originalText: String): MultiLink {
        return when (this) {
            is DefaultSingleLink -> DefaultMultiLink(originalText, onLinkTapped)
            is CustomSingleLink -> CustomMultiLink(originalText, customSpan)
        }
    }

    private fun AttributeSet.hasCustomStyle() = styleAttribute != 0
}
