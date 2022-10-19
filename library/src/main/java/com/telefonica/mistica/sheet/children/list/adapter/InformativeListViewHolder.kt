package com.telefonica.mistica.sheet.children.list.adapter

import android.widget.ImageView
import android.widget.Space
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R

class InformativeListViewHolder(layout: ConstraintLayout): RecyclerView.ViewHolder(layout) {
    val bullet: ImageView
    val iconDefault: ImageView
    val iconSmall: ImageView
    val text: TextView
    val description: TextView
    val bottomExtraSpace: Space

    init {
        text = layout.findViewById(R.id.sheet_row_informative_title_text)
        description = layout.findViewById(R.id.sheet_row_informative_subtitle_text)
        bullet = layout.findViewById(R.id.sheet_row_action_icon_bullet)
        iconDefault = layout.findViewById(R.id.sheet_row_action_icon_default)
        iconSmall = layout.findViewById(R.id.sheet_row_action_icon_small)
        bottomExtraSpace = layout.findViewById(R.id.sheet_row_informative_bottom_extra_space)
    }
}