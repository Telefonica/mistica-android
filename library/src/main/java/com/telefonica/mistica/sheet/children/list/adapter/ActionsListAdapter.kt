package com.telefonica.mistica.sheet.children.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.sheet.children.list.ListElementViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowActionViewData

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
            holder.icon.setImageDrawable(item.asset)
            holder.icon.visibility = View.VISIBLE
        } else {
            holder.icon.visibility = View.GONE
        }

        holder.layout.setOnClickListener {
            onItemClicked(item)
        }
    }

    override fun getItemCount(): Int = items.size

    private fun onItemClicked(viewData: ListElementViewData) {
        viewData.onClickListener.onClicked(viewData.id)
    }
}