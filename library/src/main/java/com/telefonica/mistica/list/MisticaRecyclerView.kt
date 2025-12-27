package com.telefonica.mistica.list

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.IntDef
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.list.layout.configureWithBoxedLayout
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout

class MisticaRecyclerView : RecyclerView {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TYPE_FULL_WIDTH,
        TYPE_BOXED
    )
    annotation class ListLayoutType

    fun init(attrs: AttributeSet? = null) {
        var initialType: Int = TYPE_FULL_WIDTH
        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.MisticaRecyclerView,
                0,
                0
            )
            initialType =
                styledAttrs.getInt(R.styleable.MisticaRecyclerView_listLayoutType, initialType)
        }
        setListLayoutType(initialType)
    }

    fun setListLayoutType(@ListLayoutType type: Int) {
        when (type) {
            TYPE_BOXED -> configureWithBoxedLayout()
            else -> configureWithFullWidthLayout()
        }
    }

    companion object {
        const val TYPE_FULL_WIDTH = 0
        const val TYPE_BOXED = 1
    }
}
