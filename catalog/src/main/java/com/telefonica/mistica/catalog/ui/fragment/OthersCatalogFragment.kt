package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.chip.Chip
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.chips.HorizontalScrollChipGroup

class OthersCatalogFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_others_catalog, container, false).apply {
            configureChips()
        }
    }

    private fun View.configureChips() {
        findViewById<HorizontalScrollChipGroup>(R.id.chips).apply {
            addChip("Chip 1", checked = true)
            addChip("Chip 2")
            addChip("Chip 3")
            addChip("Chip 4")
            addChip("Chip 5")
            setOnCheckedChangeListener { _, id ->
                Toast.makeText(context, "chip with id $id checked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun HorizontalScrollChipGroup.addChip(text: String, checked: Boolean = false): Chip =
        (LayoutInflater.from(context).inflate(R.layout.chip_choice, this, false) as Chip).apply {
            this.text = text
            this.isChecked = checked
            setOnCheckedChangeListener { _: CompoundButton?, checked: Boolean ->
                if (checked) {
                    Toast.makeText(context, "chip with text $text checked", Toast.LENGTH_SHORT).show()
                }
            }
            addChip(this)
        }
}