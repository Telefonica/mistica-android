package com.telefonica.mistica.sheet.children.list.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.sheet.children.list.InformativeIconViewData
import com.telefonica.mistica.sheet.children.list.InformativeIconViewData.Bullet
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowInformativeViewData

internal class InformativeListAdapter(val items: List<RowInformativeViewData>) : RecyclerView.Adapter<InformativeListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InformativeListViewHolder =
        InformativeListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.sheet_list_row_informative,
                parent,
                false
            ) as ConstraintLayout
        )

    override fun onBindViewHolder(holder: InformativeListViewHolder, position: Int) {
        val item = items[position]
        holder.text.text = item.title
        holder.description.text = item.description

        when (item.icon) {
            Bullet -> {
                holder.bullet.visibility = View.VISIBLE
                holder.iconDefault.visibility = View.GONE
                holder.iconSmall.visibility = View.GONE
            }
            is InformativeIconViewData.Icon -> {
                holder.iconDefault.setImageDrawable(item.icon.drawableRes)
                holder.bullet.visibility = View.GONE
                holder.iconDefault.visibility = View.VISIBLE
                holder.iconSmall.visibility = View.GONE
            }
            is InformativeIconViewData.SmallIcon -> {
                holder.iconSmall.setImageDrawable(item.icon.drawableRes)
                holder.bullet.visibility = View.GONE
                holder.iconDefault.visibility = View.GONE
                holder.iconSmall.visibility = View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int = items.size

}