package com.telefonica.mistica.sheet.children.list.adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R

class ActionsListViewHolder(layout: ConstraintLayout): RecyclerView.ViewHolder(layout) {
    val icon: ImageView
    val text: TextView
    val layout: ConstraintLayout

    init {
        this.layout = layout
        text = layout.findViewById(R.id.sheet_row_action_title_text)
        icon = layout.findViewById(R.id.sheet_row_action_asset_image)
    }
}