package com.telefonica.mistica.sheet.children.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowActionViewData
import com.telefonica.mistica.sheet.children.list.RowActionStyleViewData
import com.telefonica.mistica.util.getThemeColor

internal class ActionsListAdapter(val items: List<RowActionViewData>) : RecyclerView.Adapter<ActionsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActionsListViewHolder =
        ActionsListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.sheet_list_row_action,
                parent,
                false
            ) as ConstraintLayout
        )

    override fun onBindViewHolder(holder: ActionsListViewHolder, position: Int) {
        val item = items[position]
        holder.text.text = item.title
        if (item.asset != null) {
            holder.icon.loadRowAsset(item.asset)
            holder.icon.visibility = View.VISIBLE
        } else {
            holder.icon.visibility = View.GONE
        }
        when (item.rowActionStyle) {
            RowActionStyleViewData.Default -> holder.text.setTextColor(holder.text.context.getThemeColor(R.attr.colorTextPrimary))
            RowActionStyleViewData.Destructive -> holder.text.setTextColor(holder.text.context.getThemeColor(R.attr.colorTextLinkDanger))
        }
        holder.layout.setOnClickListener {
            onItemClicked(item)
        }
        holder.layout.background = AppCompatResources.getDrawable(holder.layout.context, R.drawable.list_row_background)
    }

    override fun getItemCount(): Int = items.size

    private fun onItemClicked(viewData: RowActionViewData) {
        viewData.onClickListener.onClicked(viewData.id)
    }
}
