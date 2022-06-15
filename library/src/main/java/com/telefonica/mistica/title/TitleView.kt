package com.telefonica.mistica.title

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.setTextAndVisibility

@BindingMethods(
    BindingMethod(
        type = TitleView::class,
        attribute = "title",
        method = "setTitle"
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
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var lintTextView: TextView
    private var titleTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.title, this, true)

        titleTextView = findViewById(R.id.title_text)
        lintTextView = findViewById(R.id.link_text)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.TitleView,
                    defStyleAttr,
                    0
                )

            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.TitleView_title))
            lintTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.TitleView_link))

            styledAttrs.recycle()
        }
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.setTextAndVisibility(text)
    }

    fun setLink(text: CharSequence?) {
        lintTextView.setTextAndVisibility(text)
    }

    fun setOnLinkClickedListener(listener: () -> Unit) {
        lintTextView.setOnClickListener { listener.invoke() }
    }

}