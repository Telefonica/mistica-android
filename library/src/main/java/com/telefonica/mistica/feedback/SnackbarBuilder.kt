package com.telefonica.mistica.feedback

import android.content.res.ColorStateList
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar
import com.telefonica.mistica.R
import com.telefonica.mistica.feedback.SnackBarBehaviorConfig.areSticky
import com.telefonica.mistica.util.getThemeColor

open class SnackbarBuilder(view: View?, text: String) {

    private val view: View
    private val text: CharSequence
    private var actionText: String? = null
    private var actionListener: View.OnClickListener? = null
    private var callback: Snackbar.Callback? = null

    constructor(view: View, @StringRes resId: Int) : this(view, view.resources.getString(resId))

    init {
        requireNotNull(view) { "View cannot be null" }
        this.text = text
        this.view = view
    }

    open fun withAction(text: String, listener: View.OnClickListener?): SnackbarBuilder = apply {
        actionText = text
        actionListener = listener
    }

    open fun withAction(@StringRes resId: Int, listener: View.OnClickListener?): SnackbarBuilder =
        withAction(view.resources.getString(resId), listener)

    open fun withCallback(callback: Snackbar.Callback): SnackbarBuilder = apply {
        this.callback = callback
    }

    @JvmOverloads
    open fun showInformative(snackbarLength: SnackbarLength = SnackbarLength.SHORT): Snackbar {
        val spannable = getSpannable(R.attr.colorTextPrimaryInverse)
        val snackbar = createSnackbar(spannable, snackbarLength)
        setBackgroundColor(snackbar, R.attr.colorFeedbackInfoBackground)
        setActionTextColor(snackbar, R.attr.colorTextLinkSnackbar)
        snackbar.show()
        return snackbar
    }

    @JvmOverloads
    open fun showCritical(snackbarLength: SnackbarLength = SnackbarLength.SHORT): Snackbar {
        val spannable = getSpannable(R.attr.colorTextPrimaryInverse)
        val snackbar = createSnackbar(spannable, snackbarLength)
        setBackgroundColor(snackbar, R.attr.colorFeedbackErrorBackground)
        setActionTextColor(snackbar, R.attr.colorTextPrimaryInverse)
        snackbar.show()
        return snackbar
    }

    private fun setActionTextColor(snackbar: Snackbar, @AttrRes colorRes: Int) {
        snackbar.setActionTextColor(view.context.getThemeColor(colorRes))
    }

    private fun setBackgroundColor(snackbar: Snackbar, @AttrRes colorRes: Int) {
        snackbar.view.backgroundTintList =
            ColorStateList.valueOf(view.context.getThemeColor(colorRes))
    }

    private fun getSpannable(@AttrRes colorRes: Int): Spannable {
        val spannable: Spannable = SpannableString(text)
        val foregroundColorSpan = ForegroundColorSpan(view.context.getThemeColor(colorRes))
        spannable.setSpan(
            foregroundColorSpan,
            0,
            spannable.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        return spannable
    }

    @Suppress("DEPRECATION")
    private fun createSnackbar(text: CharSequence, snackbarLength: SnackbarLength): Snackbar {
        val duration = when {
            areSticky() -> Snackbar.LENGTH_INDEFINITE
            actionText != null -> SnackbarLength.LONG.duration()
            else -> snackbarLength.duration()
        }
        val snackbar = Snackbar.make(view, text, duration)
        setTextStyles(snackbar)
        if (actionText != null) {
            snackbar.setAction(actionText, actionListener)
        }
        if (callback != null) {
            snackbar.setCallback(callback)
        }
        return snackbar
    }

    @Suppress("DEPRECATION")
    private fun setTextStyles(snackbar: Snackbar) {
        val text = snackbar.view.findViewById<TextView>(R.id.snackbar_text)
        text.maxLines = MAX_TEXT_LINES
        text.setTextAppearance(text.context, R.style.AppTheme_TextAppearance_Preset2)
        val action = snackbar.view.findViewById<TextView>(R.id.snackbar_action)
        action.setTextAppearance(action.context, R.style.AppTheme_TextAppearance_PresetLink)
        action.isAllCaps = false
    }

    companion object {
        private const val MAX_TEXT_LINES = 4
    }
}

enum class SnackbarLength {
    SHORT,
    LONG;

    fun duration(): Int =
        when (this) {
            SHORT -> DURATION_WITHOUT_ACTION
            LONG -> DURATION_WITH_ACTION
        }

    companion object {
        private const val DURATION_WITH_ACTION = 10000
        private const val DURATION_WITHOUT_ACTION = 5000
    }
}