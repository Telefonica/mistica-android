package com.telefonica.mistica.feedback

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.AttrRes
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar
import com.telefonica.mistica.R
import com.telefonica.mistica.feedback.SnackBarBehaviorConfig.areSticky
import com.telefonica.mistica.feedback.snackbar.CustomSnackbarLayout
import com.telefonica.mistica.util.getThemeColor

open class SnackbarBuilder(view: View?, text: String) {

    private val view: View
    private val text: CharSequence
    private var actionText: String? = null
    private var actionListener: View.OnClickListener? = null
    private var callback: Snackbar.Callback? = null
    private var isDismissible = false

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

    open fun isDismissible(): SnackbarBuilder = apply{
        this.isDismissible = true
    }

    @JvmOverloads
    open fun showInformative(snackbarLength: SnackbarLength? = null): Snackbar {
        val spannable = getSpannable(R.attr.colorTextPrimaryInverse)
        val snackbar = createSnackbar(spannable, snackbarLength)
        setBackgroundColor(snackbar, R.attr.colorFeedbackInfoBackground)
        setActionTextColor(snackbar, R.attr.colorTextLinkSnackbar)
        snackbar.show()
        return snackbar
    }

    @JvmOverloads
    open fun showCritical(snackbarLength: SnackbarLength? = null): Snackbar {
        val spannable = getSpannable(R.attr.colorTextPrimaryInverse)
        val snackbar = createSnackbar(spannable, snackbarLength)
        setBackgroundColor(snackbar, R.attr.colorFeedbackErrorBackground)
        setActionTextColor(snackbar, R.attr.colorTextPrimaryInverse)
        snackbar.show()
        return snackbar
    }

    private fun setActionTextColor(snackbar: Snackbar, @AttrRes colorRes: Int) {
        snackbar.getCustomLayout().setActionTextColor(view.context.getThemeColor(colorRes))
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

    private fun createSnackbar(text: CharSequence, snackbarLength: SnackbarLength?): Snackbar {
        val duration = when {
            areSticky() -> SnackbarLength.INDEFINITE
            snackbarLength == null -> if (actionListener == null) SnackbarLength.SHORT else SnackbarLength.LONG
            else -> snackbarLength
        }.duration()

        val snackbar = inflateCustomSnackbar(duration)

        snackbar.getCustomLayout().setText(text)
        snackbar.setCustomAction()
        snackbar.showDismissActionIfNeeded(hasInfiniteDuration = snackbarLength == SnackbarLength.INDEFINITE)
        snackbar.addCallbackIfNeeded()

        return snackbar
    }

    // We are inflating a custom layout instead of reusing existing Snackbar layout implementation because
    // we need to add a dismiss X button and despite of it being included by Material 3 definition,
    // that dismiss button is not supported at the moment in the Android Material library.
    // See: https://github.com/material-components/material-components-android/issues/3049
    @SuppressLint("ShowToast")
    private fun inflateCustomSnackbar(duration: Int): Snackbar {
        // Since we are inflating a custom layout, we pass a dummy text and apply
        // the expected one later on to our custom TextView
        val snackbar = Snackbar.make(view, "", duration)
        val snackbarLayout = snackbar.view as Snackbar.SnackbarLayout

        snackbarLayout.removeAllViews()
        val customLayout = LayoutInflater.from(snackbarLayout.context).inflate(R.layout.snackbar_layout, snackbarLayout, false)
        snackbarLayout.addView(customLayout)

        return snackbar
    }

    private fun Snackbar.setCustomAction() {
        actionText?.let { text ->
            getCustomLayout().setAction(
                actionText = text,
                listener = {
                    actionListener?.onClick(it)
                    dismiss()
                }
            )
        }
    }

    private fun Snackbar.getCustomLayout(): CustomSnackbarLayout =
        this.view.findViewById(R.id.custom_layout)

    private fun Snackbar.showDismissActionIfNeeded(hasInfiniteDuration: Boolean) {
        val hasNoAction = actionText == null
        val userCanNotDismissSnackbarWithoutTriggeringAnyAction = actionText != null && actionListener != null
        val userShouldBeAbleToDismissSnackbar = hasInfiniteDuration &&
                (hasNoAction || userCanNotDismissSnackbarWithoutTriggeringAnyAction)

        if (isDismissible || userShouldBeAbleToDismissSnackbar) {
            getCustomLayout().setOnDismissClickListener { dismiss() }
        }
    }

    private fun Snackbar.addCallbackIfNeeded() {
        if (callback != null) {
            addCallback(callback)
        }
    }
}

enum class SnackbarLength {
    SHORT,
    LONG,
    INDEFINITE;

    fun duration(): Int =
        when (this) {
            SHORT -> DURATION_WITHOUT_ACTION
            LONG -> DURATION_WITH_ACTION
            INDEFINITE -> Snackbar.LENGTH_INDEFINITE
        }

    companion object {
        private const val DURATION_WITH_ACTION = 10000
        private const val DURATION_WITHOUT_ACTION = 5000
    }
}