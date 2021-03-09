package com.telefonica.mistica.header

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.StringRes
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.children
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getThemeColor

@BindingMethods(
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerInverse",
        method = "setInverse"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerHasTopPadding",
        method = "setHasTopPadding"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerFirstPretitle",
        method = "setFirstPretitle"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerFirstPretitleHasSecondaryColor",
        method = "setFirstPretitleHasSecondaryColor"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerSecondPretitle",
        method = "setSecondPretitle"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerSecondPretitleHasSecondaryColor",
        method = "setSecondPretitleHasSecondaryColor"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerNumeral",
        method = "setNumeral"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerNumeralHasErrorColor",
        method = "setNumeralHasDangerColor"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerActionButtonText",
        method = "setActionButtonText"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerSecondaryActionButtonText",
        method = "setSecondaryActionButtonText"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerActionButtonOnClick",
        method = "setActionButtonOnClick"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerSecondaryActionButtonOnClick",
        method = "setSecondaryActionButtonOnClick"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerSubtitle",
        method = "setHeaderSubtitle"
    ),
    BindingMethod(
        type = HeaderView::class,
        attribute = "headerSubtitleHasSecondaryColor",
        method = "setSubtitleHasSecondaryColor"
    )
)
class HeaderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val firstPretitleTextView: TextView
    private val titleTextView: TextView
    private val secondPretitleTextView: TextView
    private val numeralTextView: TextView
    private var actionContainer: LinearLayout
    private var actionButton: Button
    private var secondaryActionButton: Button
    private val subtitleTextView: TextView

    private var isInverse: Boolean = false
    private var hasTopPadding: Boolean = false
    private var firstPretitleHasSecondaryColor: Boolean = false
    private var secondPretitleHasSecondaryColor: Boolean = false
    private var numeralHasDangerColor: Boolean = false
    private var subtitleHasSecondaryColor: Boolean = false

    private var actionClickListener: OnClickListener? = null
    private var secondaryActionClickListener: OnClickListener? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.header_view, this, true)
        orientation = VERTICAL
        gravity = Gravity.START

        firstPretitleTextView = findViewById(R.id.header_first_pretitle)
        titleTextView = findViewById(R.id.header_title)
        secondPretitleTextView = findViewById(R.id.header_second_pretitle)
        numeralTextView = findViewById(R.id.header_numeral)
        actionContainer = findViewById(R.id.header_action_container)
        actionButton = findViewById(R.id.header_action_button)
        secondaryActionButton = findViewById(R.id.header_secondary_action_button)
        subtitleTextView = findViewById(R.id.header_subtitle)
        isFocusable = true

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(attrs, R.styleable.HeaderView, defStyleAttr, 0)

            isInverse = styledAttrs.getBoolean(R.styleable.HeaderView_headerInverse, false)
            if (isInverse) {
                actionButton = findViewById(R.id.header_action_button_inverse)
                secondaryActionButton = findViewById(R.id.header_secondary_action_button_inverse)
            }

            hasTopPadding = styledAttrs.getBoolean(R.styleable.HeaderView_headerHasTopPadding, true)

            firstPretitleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HeaderView_headerFirstPretitle))
            firstPretitleHasSecondaryColor = styledAttrs.getBoolean(
                R.styleable.HeaderView_headerFirstPretitleHasSecondaryColor,
                false
            )

            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HeaderView_headerTitle))

            secondPretitleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HeaderView_headerSecondPretitle))
            secondPretitleHasSecondaryColor = styledAttrs.getBoolean(
                R.styleable.HeaderView_headerSecondPretitleHasSecondaryColor,
                false
            )

            numeralTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HeaderView_headerNumeral))
            numeralHasDangerColor =
                styledAttrs.getBoolean(R.styleable.HeaderView_headerNumeralHasErrorColor, false)

            actionButton.setTextAndVisibility(styledAttrs.getText(R.styleable.HeaderView_headerActionButtonText))
            secondaryActionButton.setTextAndVisibility(styledAttrs.getText(R.styleable.HeaderView_headerSecondaryActionButtonText))

            subtitleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HeaderView_headerSubtitle))
            subtitleHasSecondaryColor = styledAttrs.getBoolean(
                R.styleable.HeaderView_headerSubtitleHasSecondaryColor,
                false
            )

            styledAttrs.recycle()
        }
        configureTextsColors()
        configurePaddingAndMargins()
    }

    fun setInverse(inverse: Boolean) {
        isInverse = inverse
        reconfigureButtons()
        configureTextsColors()
    }

    fun setHasTopPadding(hasTopPadding: Boolean) {
        this.hasTopPadding = hasTopPadding
        configurePaddingAndMargins()
    }

    fun setFirstPretitle(text: CharSequence?) {
        firstPretitleTextView.setTextAndVisibility(text)
        configurePaddingAndMargins()
    }

    fun setFirstPretitle(@StringRes textRes: Int?) {
        textRes?.let { setFirstPretitle(context.getString(it)) }
    }

    fun setFirstPretitleHasSecondaryColor(hasSecondaryColor: Boolean) {
        firstPretitleHasSecondaryColor = hasSecondaryColor
        configureTextsColors()
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.setTextAndVisibility(text)
        configurePaddingAndMargins()
    }

    fun setTitle(@StringRes textRes: Int?) {
        textRes?.let { setTitle(context.getString(it)) }
    }

    fun setSecondPretitle(text: CharSequence?) {
        secondPretitleTextView.setTextAndVisibility(text)
        configurePaddingAndMargins()
    }

    fun setSecondPretitle(@StringRes textRes: Int?) {
        textRes?.let { setSecondPretitle(context.getString(it)) }
    }

    fun setSecondPretitleHasSecondaryColor(hasSecondaryColor: Boolean) {
        secondPretitleHasSecondaryColor = hasSecondaryColor
        configureTextsColors()
    }

    fun setNumeral(text: CharSequence?) {
        numeralTextView.setTextAndVisibility(text)
        configurePaddingAndMargins()
    }

    fun setNumeral(@StringRes textRes: Int?) {
        textRes?.let { setNumeral(context.getString(it)) }
    }

    fun setNumeralHasDangerColor(hasDangerColor: Boolean) {
        numeralHasDangerColor = hasDangerColor
        configureTextsColors()
    }

    fun setActionButtonText(text: CharSequence?) {
        actionButton.setTextAndVisibility(text)
        configurePaddingAndMargins()
    }

    fun setActionButtonText(@StringRes textRes: Int?) {
        textRes?.let { setActionButtonText(context.getString(it)) }
    }

    fun setSecondaryActionButtonText(text: CharSequence?) {
        secondaryActionButton.setTextAndVisibility(text)
        configurePaddingAndMargins()
    }

    fun setSecondaryActionButtonText(@StringRes textRes: Int?) {
        textRes?.let { setSecondaryActionButtonText(context.getString(it)) }
    }

    fun setActionButtonOnClick(onClickListener: OnClickListener?) {
        actionClickListener = onClickListener
        actionButton.setOnClickListener(onClickListener)
    }

    fun setSecondaryActionButtonOnClick(onClickListener: OnClickListener?) {
        secondaryActionClickListener = onClickListener
        secondaryActionButton.setOnClickListener(onClickListener)
    }

    fun setSubtitle(text: CharSequence?) {
        subtitleTextView.setTextAndVisibility(text)
        configurePaddingAndMargins()
    }

    fun setSubtitle(@StringRes textRes: Int?) {
        textRes?.let { setSubtitle(context.getString(it)) }
    }

    fun setSubtitleHasSecondaryColor(hasSecondaryColor: Boolean) {
        subtitleHasSecondaryColor = hasSecondaryColor
        configureTextsColors()
    }

    private fun configureTextsColors() {
        setBackgroundColor(context.getThemeColor(if (isInverse) R.attr.colorPrimary else R.attr.colorBackground))

        @ColorInt val primaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextPrimaryInverse else R.attr.colorTextPrimary)
        @ColorInt val secondaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextSecondaryInverse else R.attr.colorTextSecondary)

        firstPretitleTextView.setTextColor(if (firstPretitleHasSecondaryColor) secondaryColor else primaryColor)
        titleTextView.setTextColor(primaryColor)
        secondPretitleTextView.setTextColor(if (secondPretitleHasSecondaryColor) secondaryColor else primaryColor)
        numeralTextView.setTextColor(
            if (numeralHasDangerColor && !isInverse) context.getThemeColor(
                R.attr.colorTextDanger
            ) else primaryColor
        )
        subtitleTextView.setTextColor(if (subtitleHasSecondaryColor) secondaryColor else primaryColor)
    }

    private fun reconfigureButtons() {
        val actionButton: Button =
            findViewById(if (isInverse) R.id.header_action_button_inverse else R.id.header_action_button)
        if (this.actionButton != actionButton) {
            actionButton.applyConfigFrom(this.actionButton, actionClickListener)
            this.actionButton.visibility = View.GONE
            this.actionButton = actionButton
        }

        val secondaryActionButton: Button = findViewById(
            if (isInverse) R.id.header_secondary_action_button_inverse else R.id.header_secondary_action_button
        )
        if (this.secondaryActionButton != secondaryActionButton) {
            secondaryActionButton.applyConfigFrom(
                this.secondaryActionButton,
                secondaryActionClickListener
            )
            this.secondaryActionButton.visibility = View.GONE
            this.secondaryActionButton = secondaryActionButton
        }
    }

    private fun configurePaddingAndMargins() {
        setPadding(
            context.convertDpToPx(16),
            context.convertDpToPx(if (hasTopPadding) 32 else 0),
            context.convertDpToPx(32),
            context.convertDpToPx(24)
        )

        firstPretitleTextView.applyBottomMargin(if (titleTextView.isVisible()) 8 else 24)
        titleTextView.applyBottomMargin(24)
        secondPretitleTextView.applyBottomMargin(8)
        numeralTextView.applyBottomMargin(16)
        actionButton.applyBottomMargin(16)
        secondaryActionButton.applyBottomMargin(16)
        children()
            .flatMap { if (it is ViewGroup) it.children() else listOf(it) }
            .lastOrNull { it.isVisible() }
            ?.apply { applyBottomMargin(0) }
    }

    private fun View.applyBottomMargin(dpsMargin: Int) {
        layoutParams = (layoutParams as LayoutParams).apply {
            bottomMargin = context.convertDpToPx(dpsMargin)
        }
    }

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = View.VISIBLE
        } else {
            visibility = View.GONE
        }
    }

    private fun Button.applyConfigFrom(otherButton: Button, clickListener: OnClickListener?) {
        visibility = otherButton.visibility
        setOnClickListener(clickListener)
        text = otherButton.text
        layoutParams = (layoutParams as LayoutParams).apply {
            bottomMargin = (otherButton.layoutParams as LayoutParams).bottomMargin
        }
    }

    private fun View.isVisible(): Boolean =
        visibility == View.VISIBLE
}
