package com.telefonica.mistica.bottomsheet.children.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_LARGE_ICON
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

internal class SelectableListAdapter(val items: List<ListElementViewData.RowWithCheckBoxViewData>) : RecyclerView.Adapter<ListViewHolder>() {

    private var selectedPosition by Delegates.observable(items.indexOfFirst { it.selected }) { property, oldPos, newPos ->
        if (newPos != oldPos && newPos in items.indices) {
            MainScope().launch {
                notifyItemChanged(oldPos)
                notifyItemChanged(newPos)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.bottom_sheet_list_row_item,
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

private fun ListRowView.setAsset(asset: AssetViewData?) {
    when (asset) {
        is AssetViewData.Image -> {
            this.setAssetType(TYPE_IMAGE)
            this.setAssetDrawable(asset.drawableRes)
        }
        is AssetViewData.LargeIcon -> {
            this.setAssetType(TYPE_LARGE_ICON)
            this.setAssetResource(asset.id)
        }
        is AssetViewData.SmallIcon -> {
            this.setAssetType(TYPE_SMALL_ICON)
            this.setAssetResource(asset.id)
        }
        is AssetViewData.SmallImage -> {
            this.setAssetType(TYPE_SMALL_ICON)
            this.setAssetDrawable(asset.drawableRes)
        }
        null -> {}
    }
}

class ListViewHolder(val rowView: ListRowView) : RecyclerView.ViewHolder(rowView)