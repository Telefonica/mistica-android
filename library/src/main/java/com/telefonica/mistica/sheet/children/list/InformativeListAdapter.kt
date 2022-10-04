package com.telefonica.mistica.sheet.children.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.list.ListRowView

internal class InformativeListAdapter(val items: List<ListElementViewData.RowWithCheckBoxViewData>) : RecyclerView.Adapter<ListViewHolder>() {

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
        rowView.setSubtitle(item.description)
        rowView.setAsset(item.asset)
        rowView.setBackgroundType(ListRowView.BackgroundType.TYPE_NORMAL)
        rowView.setOnClickListener {
            onItemClicked(position, item)
        }
    }

    override fun getItemCount(): Int = items.size

    private fun onItemClicked(position: Int, viewData: ListElementViewData.RowWithCheckBoxViewData) {
        viewData.onClickListener.onClicked(viewData.id)
    }
}