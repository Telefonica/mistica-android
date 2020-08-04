package com.telefonica.mistica.list.layout

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.list.decoration.divider.DividerItemAdapter
import com.telefonica.mistica.list.decoration.divider.DividerItemDecoration
import com.telefonica.mistica.util.convertDpToPx

fun RecyclerView.configureWithFullWidthLayout() {
    removeItemDecorations()
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
    removeItemDecorations()
    layoutManager = LinearLayoutManager(context)
    addItemDecoration(MarginItemDecoration(context.convertDpToPx(16)))
}

private fun RecyclerView.removeItemDecorations() {
    for (i in 0 until itemDecorationCount) {
        removeItemDecorationAt(i)
    }
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
