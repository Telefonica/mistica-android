package com.telefonica.mistica.catalog.ui.fragment

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.databinding.ScreenFragmentSheetCatalogBinding
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.sheet.Asset
import com.telefonica.mistica.sheet.RowAction
import com.telefonica.mistica.sheet.RowInformative
import com.telefonica.mistica.sheet.RowSelectable
import com.telefonica.mistica.sheet.Sheet
import com.telefonica.mistica.sheet.SheetView
import com.telefonica.mistica.sheet.onSheetTapped
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.max

class SheetCatalogFragment : Fragment() {

    private var _binding: ScreenFragmentSheetCatalogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = ScreenFragmentSheetCatalogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        configureChildrenTypeSelector(view)

        binding.buttonShow.setOnClickListener {
            buildAndShowSheet()
        }

    }

    private fun buildAndShowSheet() {
        buildSelectableListElements()

        Sheet(this.requireContext())
            .withHeader(
                title = binding.inputSheetTitle.text,
                subtitle = binding.inputSheetSubtitle.text,
                description = binding.inputSheetDescription.text,
            )
            .also {
                when (ComponentType.valueOf(binding.sheetType.dropDown.text.toString())) {
                    ComponentType.Single_Selection -> it.withSelectableList(
                        id = "0",
                        elements = buildSelectableListElements()
                    )
                    ComponentType.Action -> it.withActionsList(
                        id = "0",
                        elements = buildActionsListElements()
                    )
                    ComponentType.Informative -> it.withInformativeList(
                        id = "0",
                        elements = buildInformativeListElements()
                    )
                }
            }
            .withOnSheetTappedListener(object : onSheetTapped {
                override fun onTapped(sheetView: SheetView, childrenId: String, itemId: String) {
                    Toast
                        .makeText(this@SheetCatalogFragment.context, "Onclicked: [Children: $childrenId, item:$itemId]", Toast.LENGTH_SHORT)
                        .show()
                    MainScope().launch {
                        delay(500)
                        sheetView.dismiss()
                    }
                }
            })
            .withOnCancelListener {
                Toast
                    .makeText(this@SheetCatalogFragment.context, "onCancel", Toast.LENGTH_SHORT)
                    .show()
            }
            .withOnDismissListener {
                Toast
                    .makeText(this@SheetCatalogFragment.context, "onDismiss", Toast.LENGTH_SHORT)
                    .show()
            }
            .show()
    }

    private fun buildSelectableListElements(): List<RowSelectable> {
        val elements = mutableListOf(
            RowSelectable(
                id = "0",
                title = "Title",
                asset = getIcon(),
                description = getDescription(),
                selected = true,
            )
        )

        for (i in 0 until max(1, (binding.inputSheetNumberOfElements.text ?: "1").toInt())) {
            elements.add(
                RowSelectable(
                    id = "$i",
                    title = "Another ($i)",
                    asset = getIcon(),
                    selected = false,
                    description = getDescription(),
                )
            )
        }

        return elements
    }

    private fun buildInformativeListElements(): List<RowInformative> {
        val elements = mutableListOf(
            RowInformative(
                id = "0",
                title = "Title",
                description = getDescription(),
            )
        )

        for (i in 0 until max(1, (binding.inputSheetNumberOfElements.text ?: "1").toInt())) {
            elements.add(
                RowInformative(
                    id = "$i",
                    title = "Another ($i)",
                    description = getDescription(),
                )
            )
        }

        return elements
    }

    private fun buildActionsListElements(): List<RowAction> {
        val elements = mutableListOf(
            RowAction(
                id = "0",
                title = "Title",
                asset = getActionIcon()
            )
        )

        for (i in 0 until max(1, (binding.inputSheetNumberOfElements.text ?: "1").toInt())) {
            elements.add(
                RowAction(
                    id = "$i",
                    title = "Another ($i)",
                    asset = getActionIcon()
                )
            )
        }

        return elements
    }

    private fun configureChildrenTypeSelector(view: View) {
        with(binding.sheetType.dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    ComponentType.values().map { it.name }
                ))
            setOnItemClickListener { _, _, position, _ ->
                binding.buttonShow.visibility = View.VISIBLE
                when (ComponentType.values().get(position)) {
                    ComponentType.Single_Selection -> {
                        binding.sectionSingleSelection.visibility = View.VISIBLE
                        binding.sectionAction.visibility = View.GONE
                        binding.sectionInformative.visibility = View.GONE
                    }
                    ComponentType.Action -> {
                        binding.sectionSingleSelection.visibility = View.GONE
                        binding.sectionAction.visibility = View.VISIBLE
                        binding.sectionInformative.visibility = View.GONE
                    }
                    ComponentType.Informative -> {
                        binding.sectionSingleSelection.visibility = View.GONE
                        binding.sectionAction.visibility = View.GONE
                        binding.sectionInformative.visibility = View.VISIBLE
                    }
                }
            }
        }
    }

    private fun getIcon() = if (binding.inputSheetRowsWithIcons.isChecked()) {
        if (binding.inputSheetRowsWithSmallIcons.isChecked()) {
            Asset.SmallImage(ResourcesCompat.getDrawable(resources, R.drawable.ic_sheets, requireContext().theme)!!)
        } else {
            Asset.Image(ResourcesCompat.getDrawable(resources, R.drawable.highlighted_card_custom_background, requireContext().theme)!!)
        }
    } else {
        null
    }

    private fun getActionIcon(): Drawable? = if (binding.inputSheetRowsWithIconsAction.isChecked()) {
        ResourcesCompat.getDrawable(resources, R.drawable.ic_sheets, requireContext().theme)!!
    } else {
        null
    }

    private fun getDescription() = if (binding.inputSheetRowsWithDescription.isChecked()) "A description" else null

    private enum class ComponentType {
        Single_Selection,
        Action,
        Informative,
    }
}