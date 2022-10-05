package com.telefonica.mistica.sheet.children.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.sheet.children.list.ListElementViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowActionViewData
import com.telefonica.mistica.sheet.children.list.ListViewHolder
import com.telefonica.mistica.sheet.children.list.setAsset

internal class ActionsListAdapter(val items: List<RowActionViewData>) : RecyclerView.Adapter<ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.sheet_list_row_informative,
                parent,
                false
            ) as ListRowView
        )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rowView: ListRowView = holder.rowView
        val item = items[position]
        rowView.setTitle(item.title)
        rowView.setAsset(item.asset)
        rowView.setBackgroundType(ListRowView.BackgroundType.TYPE_NORMAL)
        rowView.setOnClickListener {
            onItemClicked(item)
        }
    }

    override fun getItemCount(): Int = items.size

    private fun onItemClicked(viewData: ListElementViewData) {
        viewData.onClickListener.onClicked(viewData.id)
    }
}