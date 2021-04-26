package com.telefonica.mistica.section

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
        type = SectionTitleView::class,
        attribute = "sectionTitle",
        method = "setTitle"
    ),
    BindingMethod(
    type = SectionTitleView::class,
    attribute = "sectionLink",
    method = "setLink")
)
class SectionTitleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var lintTextView: TextView
    private var titleTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.section_title, this, true)

        titleTextView = findViewById(R.id.section_title)
        lintTextView = findViewById(R.id.section_link)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.SectionTitleView,
                    defStyleAttr,
                    0
                )

            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.SectionTitleView_sectionTitle))
            lintTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.SectionTitleView_sectionLink))

            styledAttrs.recycle()
        }
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.text = text
    }

    fun setLink(text: CharSequence?) {
        lintTextView.text = text
    }

    fun setLinkCallback(onclickHandler: () -> Unit) {
        lintTextView.setOnClickListener { onclickHandler.invoke() }
    }

}