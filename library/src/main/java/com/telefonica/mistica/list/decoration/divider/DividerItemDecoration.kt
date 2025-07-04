package com.telefonica.mistica.list.decoration.divider

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.View
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import androidx.core.graphics.withSave

open class DividerItemDecoration @JvmOverloads constructor(
    context: Context,
    private val adapter: DividerItemAdapter,
    @DrawableRes drawableRes: Int = R.drawable.generic_divider,
) : RecyclerView.ItemDecoration() {

    private val divider: Drawable? = AppCompatResources.getDrawable(context, drawableRes)
    private val bounds = Rect()

    private var drawableState: IntArray = IntArray(0)

    override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDrawOver(c, parent, state)
        divider?.let { divider ->
            drawHorizontal(c, parent, divider, state.itemCount)
        }
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State,
    ) {
        val position = parent.getChildAdapterPosition(view)
        if (hasDivider(position, state.getItemCount())) {
            outRect.set(0, 0, 0, divider?.intrinsicHeight ?: 0)
        } else {
            outRect.set(0, 0, 0, 0)
        }
        drawableState = view.drawableState
    }

    private fun hasDivider(position: Int, items: Int): Boolean =
        position != RecyclerView.NO_POSITION && adapter.hasDivider(position) && !isLastElement(position, items)

    private fun isLastElement(position: Int, items: Int): Boolean = position == items - 1

    private fun drawHorizontal(c: Canvas, parent: RecyclerView, divider: Drawable, items: Int) {
        c.withSave {
            for (i in 0 until parent.childCount) {
                val child = parent.getChildAt(i)
                val position = parent.getChildAdapterPosition(child)
                if (!hasDivider(position, items)) {
                    continue
                }
                parent.getDecoratedBoundsWithMargins(child, bounds)
                val left =
                    parent.paddingLeft + adapter.getDividerLeftOffset(position) + Math.round(child.translationX)
                val right =
                    parent.width - parent.paddingRight - adapter.getDividerRightOffset(position) + Math.round(
                        child.translationX
                    )
                val bottom = bounds.bottom + Math.round(child.translationY)
                val top = bottom - divider.intrinsicHeight

                divider.apply {
                    divider.alpha = Math.round(child.alpha * HEX_MULTIPLIER)
                    divider.setBounds(left, top, right, bottom)
                    draw(this@withSave)
                    divider.state = drawableState
                }
            }
        }
    }

    private companion object {
        const val HEX_MULTIPLIER = 0xFF
    }
}
