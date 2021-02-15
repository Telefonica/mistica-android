package com.telefonica.mistica.feedback.error

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.button.ProgressButton
import com.telefonica.mistica.util.convertDpToPx

@BindingMethods(
    BindingMethod(
        type = LoadErrorFeedbackView::class,
        attribute = "loadErrorFeedbackTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = LoadErrorFeedbackView::class,
        attribute = "loadErrorFeedbackDescription",
        method = "setDescription"
    ),
    BindingMethod(
        type = LoadErrorFeedbackView::class,
        attribute = "loadErrorFeedbackIsLoading",
        method = "setIsLoading"
    ),
    BindingMethod(
        type = LoadErrorFeedbackView::class,
        attribute = "loadErrorFeedbackButtonOnClick",
        method = "setButtonOnClick"
    ),
    BindingMethod(
        type = LoadErrorFeedbackView::class,
        attribute = "loadErrorFeedbackButtonText",
        method = "setButtonText"
    ),
    BindingMethod(
        type = LoadErrorFeedbackView::class,
        attribute = "loadErrorFeedbackIsButtonVisible",
        method = "setIsButtonVisible"
    )
)
class LoadErrorFeedbackView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val titleTextView: TextView
    private val descriptionTextView: TextView
    private val button: ProgressButton

    init {
        LayoutInflater.from(context).inflate(R.layout.load_error_feedback, this, true)

        val padding = context.convertDpToPx(16)
        setPadding(padding, padding, padding, padding)
        gravity = Gravity.CENTER
        orientation = VERTICAL

        titleTextView = findViewById(R.id.load_error_feedback_title)
        descriptionTextView = findViewById(R.id.load_error_feedback_description)
        button = findViewById(R.id.load_error_feedback_button)
        isFocusable = true

        if (attrs != null) {
            val theme = context.theme
            val styledAttrs =
                theme.obtainStyledAttributes(attrs, R.styleable.LoadErrorFeedback, defStyleAttr, 0)
            styledAttrs.getText(R.styleable.LoadErrorFeedback_loadErrorFeedbackTitle)
                ?.let { setTitle(it) }
            styledAttrs.getText(R.styleable.LoadErrorFeedback_loadErrorFeedbackDescription)
                ?.let { setDescription(it) }
            styledAttrs.getText(R.styleable.LoadErrorFeedback_loadErrorFeedbackButtonText)
                ?.let { setButtonText(it) }
            setIsLoading(
                styledAttrs.getBoolean(
                    R.styleable.LoadErrorFeedback_loadErrorFeedbackIsLoading,
                    false
                )
            )
            setIsButtonVisible(
                styledAttrs.getBoolean(
                    R.styleable.LoadErrorFeedback_loadErrorFeedbackIsButtonVisible,
                    true
                )
            )
            styledAttrs.recycle()
        }
    }

    fun setTitle(text: CharSequence?) {
        if (text != null) {
            titleTextView.text = text
            titleTextView.visibility = View.VISIBLE
        } else {
            titleTextView.visibility = View.GONE
        }
    }

    fun setDescription(text: CharSequence) {
        descriptionTextView.text = text
    }

    fun setIsLoading(loading: Boolean) {
        button.setIsLoading(loading)
    }

    fun setButtonOnClick(listener: OnClickListener?) {
        button.setOnClickListener(listener)
    }

    fun setButtonText(text: CharSequence) {
        button.setText(text)
    }

    fun setButtonText(@StringRes textId: Int) = setButtonText(context.getString(textId))

    fun setIsButtonVisible(isVisible: Boolean) {
        button.visibility = if (isVisible) View.VISIBLE else View.GONE
    }

    fun setButtonClickListener(listener: ((View) -> Unit)?) {
        setButtonOnClick(OnClickListener { listener?.invoke(it) })
    }
}