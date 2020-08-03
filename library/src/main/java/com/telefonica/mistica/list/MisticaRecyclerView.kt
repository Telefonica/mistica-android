package com.telefonica.mistica.list

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.Nullable
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.list.layout.ListLayoutType
import com.telefonica.mistica.list.layout.setListLayoutStyleType

@BindingMethods(
    BindingMethod(
        type = MisticaRecyclerView::class,
        attribute = "listLayoutType",
        method = "setListLayoutType"
    )
)
class MisticaRecyclerView : RecyclerView {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, @Nullable attrs: AttributeSet) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    fun init(@Nullable attrs: AttributeSet? = null) {
        var initialType: Int = ListLayoutType.TYPE_FULL_WIDTH
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
        setListLayoutStyleType(type)
    }
}
