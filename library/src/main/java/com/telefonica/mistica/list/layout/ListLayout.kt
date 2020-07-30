package com.telefonica.mistica.list.layout

import android.graphics.Rect
import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.list.decoration.divider.DividerItemAdapter
import com.telefonica.mistica.list.decoration.divider.DividerItemDecoration
import com.telefonica.mistica.list.layout.ListLayout.BOXED
import com.telefonica.mistica.list.layout.ListLayout.FULL_WIDTH
import com.telefonica.mistica.util.convertDpToPx

enum class ListLayout {
    BOXED,
    FULL_WIDTH
}

@BindingAdapter("listLayout")
fun RecyclerView.setListLayoutStyle(layout: ListLayout) {
    when (layout) {
        BOXED -> configureWithBoxedLayout()
        FULL_WIDTH -> configureWithFullWidthLayout()
    }
}

fun RecyclerView.configureWithFullWidthLayout() {
    layoutManager = LinearLayoutManager(context)
    addItemDecoration(
        DividerItemDecoration(
            context,
            object : DividerItemAdapter {
                override fun getDividerLeftOffset(position: Int): Int =
                    context.convertDpToPx(16)

                override fun getDividerRightOffset(position: Int): Int =
                    context.convertDpToPx(16)

                override fun hasDivider(position: Int): Boolean =
                    true
            })
    )
}

fun RecyclerView.configureWithBoxedLayout() {
    layoutManager = LinearLayoutManager(context)
    addItemDecoration(MarginItemDecoration(context.convertDpToPx(16)))
}

private class MarginItemDecoration(
    private val spaceHeight: Int
) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        with(outRect) {
            top = if (parent.getChildAdapterPosition(view) == 0) spaceHeight else 0
            left = spaceHeight
            right = spaceHeight
            bottom = spaceHeight
        }
    }
}
