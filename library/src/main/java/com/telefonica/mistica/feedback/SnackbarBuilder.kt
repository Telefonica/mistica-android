package com.telefonica.mistica.feedback

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.accessibility.AccessibilityManager
import androidx.annotation.AttrRes
import androidx.annotation.StringRes
import com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
import com.google.android.material.snackbar.Snackbar
import com.telefonica.mistica.R
import com.telefonica.mistica.feedback.SnackBarBehaviorConfig.areSticky
import com.telefonica.mistica.feedback.snackbar.CustomSnackbarLayout
import com.telefonica.mistica.util.getThemeColor

open class SnackbarBuilder(view: View?, text: String) {

    private val view: View
    private val text: CharSequence
    private var actionText: String? = null
    private var actionContentDescription: String? = null
    private var actionListener: View.OnClickListener? = null
    private var callback: Snackbar.Callback? = null
    private var withDismiss = false
    private val accessibilityManager: AccessibilityManager

    private val hasAction: Boolean
        get() = actionText != null

    constructor(view: View, @StringRes resId: Int) : this(view, view.resources.getString(resId))

    init {
        requireNotNull(view) { "View cannot be null" }
        this.text = text
        this.view = view
        this.accessibilityManager = view.context.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
    }

    open fun withAction(text: String, contentDescription: String? = null, listener: View.OnClickListener?): SnackbarBuilder = apply {
        actionText = text
        actionListener = listener
        actionContentDescription = contentDescription
    }

    open fun withAction(@StringRes resId: Int, @StringRes contentDescription: Int? = null, listener: View.OnClickListener?): SnackbarBuilder =
        withAction(view.resources.getString(resId), contentDescription?.let { view.resources.getString(contentDescription) }, listener)

    open fun withCallback(callback: Snackbar.Callback): SnackbarBuilder = apply {
        this.callback = callback
    }

    open fun withDismiss(): SnackbarBuilder = apply {
        this.withDismiss = true
    }

    @JvmOverloads
    open fun showInformative(snackbarLength: SnackbarLength = SnackbarLength.SHORT): Snackbar {
        val spannable = getSpannable(R.attr.colorTextPrimaryInverse)
        val snackbar = createSnackbar(spannable, snackbarLength, isCritical = false)
        setBackgroundColor(snackbar, R.attr.colorFeedbackInfoBackground)
        setActionTextColor(snackbar, R.attr.colorTextLinkSnackbar)
        snackbar.show()
        return snackbar
    }

    @JvmOverloads
    open fun showCritical(snackbarLength: SnackbarLength = SnackbarLength.SHORT): Snackbar {
        val spannable = getSpannable(R.attr.colorTextPrimaryInverse)
        val snackbar = createSnackbar(spannable, snackbarLength, isCritical = true)
        setBackgroundColor(snackbar, R.attr.colorFeedbackErrorBackground)
        setActionTextColor(snackbar, R.attr.colorTextPrimaryInverse)
        interruptPreviousAccessibilityAnnouncement(snackbar)
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

    private fun interruptPreviousAccessibilityAnnouncement(snackbar: Snackbar) {
        snackbar.addCallback(object : BaseCallback<Snackbar>() {
            override fun onShown(snackbar: Snackbar) {
                if (accessibilityManager.isEnabled) accessibilityManager.interrupt()
            }
        })
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

    private fun createSnackbar(text: CharSequence, snackbarLength: SnackbarLength, isCritical: Boolean): Snackbar {
        val duration = when {
            areSticky() -> SnackbarLength.INDEFINITE
            isInvalidLengthWhenThereIsAction(snackbarLength) -> SnackbarLength.LONG
            isInvalidLengthWhenThereIsNoAction(snackbarLength) -> SnackbarLength.SHORT
            else -> snackbarLength
        }.duration()

        val snackbar = inflateCustomSnackbar(duration)

        snackbar.getCustomLayout().setText(text)
        snackbar.setCustomAction()
        snackbar.showDismissActionIfNeeded(hasInfiniteDuration = snackbarLength == SnackbarLength.INDEFINITE)
        snackbar.addCallbackIfNeeded()

        return snackbar
    }

    private fun isInvalidLengthWhenThereIsAction(length: SnackbarLength): Boolean =
        hasAction && length == SnackbarLength.SHORT

    private fun isInvalidLengthWhenThereIsNoAction(length: SnackbarLength): Boolean =
        !hasAction && length == SnackbarLength.LONG

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
                contentDescription = actionContentDescription,
                listener = {
                    actionListener?.onClick(it)
                    dispatchDismissedByActionEvent()
                }
            )
        }
    }

    private fun Snackbar.dispatchDismissedByActionEvent() {
        // We are overwriting the Snackbar implementation in order to have support for certain UI elements like the dismiss button.
        // Given that, we are losing some built in capabilities such as BaseCallback.DISMISS_EVENT_ACTION event.
        // The correct way to dispatch a BaseCallback.DISMISS_EVENT_ACTION event would be to use Snackbar::dispatchDismiss method.
        // However that method is protected (we don't have access to it) and invoking Snackbar::dismiss with a registered callback would trigger
        // the DISMISS_EVENT_MANUAL event. The workaround is to remove the callback if present, manually invoke the callback method and then invoking
        // a dismiss that won't trigger a second event.
        removeCallback(callback)
        callback?.onDismissed(this, BaseCallback.DISMISS_EVENT_ACTION)
        dismiss()
    }

    private fun Snackbar.getCustomLayout(): CustomSnackbarLayout =
        this.view.findViewById(R.id.custom_layout)

    private fun Snackbar.showDismissActionIfNeeded(hasInfiniteDuration: Boolean) {
        val userShouldBeAbleToDismissSnackbar = !hasAction && hasInfiniteDuration

        if (withDismiss || userShouldBeAbleToDismissSnackbar) {
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
