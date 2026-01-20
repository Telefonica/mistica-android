package com.telefonica.mistica.header

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.core.graphics.drawable.toDrawable
import com.telefonica.mistica.R
import com.telefonica.mistica.util.children
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getMisticaThemeDrawable
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.setTextAndVisibility

class HeaderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val firstPretitleTextView: TextView
    private val titleTextView: TextView
    private val secondPretitleTextView: TextView
    private val numeralTextView: TextView
    private var actionContainer: LinearLayout
    private var actionButton: Button
    private var secondaryActionButton: Button
    private val subtitleTextView: TextView
    private val bottomContainer: FrameLayout

    private var isInverse: Boolean = false
    private var hasTopPadding: Boolean = false
    private var firstPretitleHasSecondaryColor: Boolean = false
    private var secondPretitleHasSecondaryColor: Boolean = false
    private var numeralHasDangerColor: Boolean = false
    private var subtitleHasSecondaryColor: Boolean = false
    private var currentBottomLayoutRes: Int = BOTTOM_VIEW_NONE

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
        bottomContainer = findViewById(R.id.bottom_container)
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

            styledAttrs.getResourceId(
                R.styleable.HeaderView_headerBottomLayout,
                TypedValue.TYPE_NULL
            )
                .takeIf { it != TypedValue.TYPE_NULL }
                .let { setBottomLayout(it ?: BOTTOM_VIEW_NONE) }

            styledAttrs.recycle()
        }
        configureTextsColors()
        configurePaddingAndMargins()
    }

    fun setBottomLayout(@LayoutRes layoutRes: Int = BOTTOM_VIEW_NONE) {
        if (currentBottomLayoutRes != layoutRes) {
            bottomContainer.removeAllViews()
            if (layoutRes != BOTTOM_VIEW_NONE) {
                LayoutInflater.from(context).inflate(layoutRes, bottomContainer, true)
                bottomContainer.visibility = VISIBLE
            } else {
                bottomContainer.visibility = GONE
            }
            currentBottomLayoutRes = layoutRes
        }
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

    fun setHeaderFirstPretitle(@StringRes textRes: Int?) = setFirstPretitle(textRes)
    fun setHeaderTitle(text: CharSequence?) = setTitle(text)

    fun setHeaderInverse(value: Boolean) = setInverse(value)
    fun setHeaderHasTopPadding(value: Boolean) = setHasTopPadding(value)

    fun setHeaderFirstPretitle(text: CharSequence?) = setFirstPretitle(text)
    fun setHeaderFirstPretitleHasSecondaryColor(value: Boolean) =
        setFirstPretitleHasSecondaryColor(value)

    fun setHeaderSecondPretitle(text: CharSequence?) = setSecondPretitle(text)
    fun setHeaderSecondPretitleHasSecondaryColor(value: Boolean) =
        setSecondPretitleHasSecondaryColor(value)

    fun setHeaderNumeral(text: CharSequence?) = setNumeral(text)
    fun setHeaderNumeralHasErrorColor(value: Boolean) = setNumeralHasDangerColor(value)

    fun setHeaderSubtitle(text: CharSequence?) = setSubtitle(text)
    fun setHeaderSubtitleHasSecondaryColor(value: Boolean) = setSubtitleHasSecondaryColor(value)

    fun setHeaderActionButtonText(text: CharSequence?) = setActionButtonText(text)
    fun setHeaderSecondaryActionButtonText(text: CharSequence?) = setSecondaryActionButtonText(text)

    fun setHeaderActionButtonOnClick(listener: OnClickListener?) = setActionButtonOnClick(listener)
    fun setHeaderSecondaryActionButtonOnClick(listener: OnClickListener?) =
        setSecondaryActionButtonOnClick(listener)

    fun setHeaderBottomLayout(@LayoutRes layoutRes: Int) = setBottomLayout(layoutRes)


    private fun configureTextsColors() {
        val backgroundDrawable = if (isInverse) {
            context.getMisticaThemeDrawable(R.attr.drawableBackgroundBrand)
        } else {
            context.getThemeColor(R.attr.colorBackground).toDrawable()
        }
        background = backgroundDrawable

        @ColorInt val primaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextPrimaryInverse else R.attr.colorTextPrimary)
        @ColorInt val secondaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextSecondaryInverse else R.attr.colorTextSecondary)

        firstPretitleTextView.setTextColor(if (firstPretitleHasSecondaryColor) secondaryColor else primaryColor)
        titleTextView.setTextColor(primaryColor)
        secondPretitleTextView.setTextColor(if (secondPretitleHasSecondaryColor) secondaryColor else primaryColor)
        numeralTextView.setTextColor(
            if (numeralHasDangerColor && !isInverse) context.getThemeColor(
                R.attr.colorHighlight
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

    companion object {
        const val BOTTOM_VIEW_NONE = -1
    }
}
