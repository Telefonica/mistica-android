package com.telefonica.mistica.filters

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import androidx.annotation.IdRes
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.telefonica.mistica.R
import com.telefonica.mistica.util.children
import com.telefonica.mistica.util.getDimension

class HorizontalScrollFilterGroup @JvmOverloads constructor(
    private val context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FrameLayout(context, attrs, defStyle) {

    private val chipGroup: ChipGroup by lazy { findViewById(R.id.chips_group) }
    private val scrollView: HorizontalScrollView by lazy { findViewById(R.id.filters_scroll_view) }
    private val horizontalPadding: Int =
        context.resources.getDimensionPixelOffset(R.dimen.filter_group_horizontal_padding)

    init {
        View.inflate(context, R.layout.horizontal_scroll_filter_group, this)
        setOnCheckedChangeListener { _, _ -> }
    }

    fun addFilter(filter: Chip) {
        filter.shapeAppearanceModel = filter.shapeAppearanceModel.withCornerSize(context.getDimension(R.attr.indicatorBorderRadius))

        chipGroup.addView(filter)

        if (filter.isChecked) {
            chipGroup.clearCheck()
            chipGroup.check(filter.id)
            chipGroup.makeCheckedChipNonCheckable()
        }
    }

    fun removeAllFilters() {
        chipGroup.removeAllViews()
    }

    fun setOnCheckedChangeListener(onCheckedChange: (chipGroup: ChipGroup, checkedChipId: Int) -> Unit) {
        chipGroup.setOnCheckedStateChangeListener { chipGroup, checkedIds ->
            chipGroup.makeCheckedChipNonCheckable()
            checkedIds.firstOrNull()?.let {
                chipGroup.scrollToShowChip(it)
                onCheckedChange(chipGroup, it)
            }
        }
    }

    private fun ChipGroup.makeCheckedChipNonCheckable() {
        children()
            .filterIsInstance<Chip>()
            .forEach { chip ->
                chip.isCheckable = chip.id != checkedChipId
                chip.isChecked = chip.id == checkedChipId
            }
    }

    private fun ChipGroup.scrollToShowChip(@IdRes checkedChipId: Int) {
        if (checkedChipId == View.NO_ID) return

        val chip = findViewById<Chip>(checkedChipId)

        addOnLayoutChangeListener(object : OnLayoutChangeListener {
            override fun onLayoutChange(
                view: View,
                left: Int,
                top: Int,
                right: Int,
                bottom: Int,
                oldLeft: Int,
                oldTop: Int,
                oldRight: Int,
                oldBottom: Int
            ) {
                view.removeOnLayoutChangeListener(this)
                val paddingRequiredToShowWholeChipPlusASpaceAtBothSides = 2 * horizontalPadding
                val rect = Rect(
                    0,
                    0,
                    chip.width + paddingRequiredToShowWholeChipPlusASpaceAtBothSides,
                    chip.height
                )
                val isScrollNotSmooth = true
                scrollView.requestChildRectangleOnScreen(chip, rect, isScrollNotSmooth)
            }
        })
    }
}