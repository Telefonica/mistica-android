package com.telefonica.mistica.sheet.children.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.sheet.children.list.ListElementViewData
import com.telefonica.mistica.sheet.children.list.setAsset
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

internal class SelectableListAdapter(val items: List<ListElementViewData.RowWithCheckBoxViewData>) : RecyclerView.Adapter<SelectableListViewHolder>() {

    private var selectedPosition by Delegates.observable(items.indexOfFirst { it.selected }) { property, oldPos, newPos ->
        if (newPos != oldPos && newPos in items.indices) {
            MainScope().launch {
                notifyItemChanged(oldPos)
                notifyItemChanged(newPos)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectableListViewHolder =
        SelectableListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.sheet_list_row_selectable_item,
                parent,
                false
            ) as ListRowView
        )

    override fun onBindViewHolder(holder: SelectableListViewHolder, position: Int) {
        val rowView: ListRowView = holder.rowView
        val item = items[position]
        rowView.setTitle(item.title)
        rowView.setSubtitle(item.description)
        rowView.setAsset(item.asset)
        rowView.setBackgroundType(ListRowView.BackgroundType.TYPE_NORMAL)
        (rowView.getActionView() as? AppCompatRadioButton)?.let { radioButton ->
            radioButton.isChecked = selectedPosition == position
            radioButton.setOnCheckedChangeListener { _, _ ->
                if (radioButton.isPressed) {
                    onItemClicked(position, item)
                }
            }
        }
        rowView.setOnClickListener {
            onItemClicked(position, item)
        }
    }

    override fun getItemCount(): Int = items.size

    private fun onItemClicked(position: Int, viewData: ListElementViewData.RowWithCheckBoxViewData) {
        viewData.onClickListener.onClicked(viewData.id)
        selectedPosition = position
    }
}