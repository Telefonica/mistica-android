package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.telefonica.mistica.bottomsheet.Asset
import com.telefonica.mistica.bottomsheet.BottomSheet
import com.telefonica.mistica.bottomsheet.BottomSheetView
import com.telefonica.mistica.bottomsheet.OnBottomSheetClicked
import com.telefonica.mistica.bottomsheet.RowWithCheckBox
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.databinding.ScreenFragmentBottomSheetCatalogBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.max

class BottomSheetCatalogFragment() : Fragment() {

    private var _binding: ScreenFragmentBottomSheetCatalogBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ScreenFragmentBottomSheetCatalogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonShow.setOnClickListener {
            val elements = mutableListOf(
                RowWithCheckBox(
                    id ="0",
                    title = "Title",
                    asset = Asset.Image(ResourcesCompat.getDrawable(resources, R.drawable.highlighted_card_custom_background, context!!.theme)!!),
                    description = "Initially selected",
                    selected = true,
                )
            )

            for (i in 0..max(1, (binding.inputBottomsheetNumberOfElements.text ?: "1").toInt())) {
                elements.add(
                    RowWithCheckBox(
                        id ="$i",
                        title = "Another ($i)",
                        asset = Asset.Image(ResourcesCompat.getDrawable(resources, R.drawable.highlighted_card_custom_background, context!!.theme)!!),
                        selected = false,
                    )
                )
            }

            BottomSheet(this.context!!)
                .withHeader(
                    title = binding.inputBottomsheetTitle.text,
                    subtitle = binding.inputBottomsheetSubtitle.text,
                    description = binding.inputBottomsheetDescription.text,
                )
                .withList(
                    id = "0",
                    elements = elements
                )
                .withOnBottomSheetClickedListener(object: OnBottomSheetClicked {
                    override fun onTapped(bottomSheet: BottomSheetView,  childrenId: String, itemId: String) {
                        Toast
                            .makeText(this@BottomSheetCatalogFragment.context, "Onclicked: [Children: $childrenId, item:$itemId]", Toast.LENGTH_SHORT)
                            .show()
                        MainScope().launch {
                            delay(500)
                            bottomSheet.dismiss()
                        }
                    }
                })
                .withOnCancelListener {
                    Toast
                        .makeText(this@BottomSheetCatalogFragment.context, "onCancel", Toast.LENGTH_SHORT)
                        .show()
                }
                .withOnDismissListener {
                    Toast
                        .makeText(this@BottomSheetCatalogFragment.context, "onDismiss", Toast.LENGTH_SHORT)
                        .show()
                }
                .show()
        }

    }
}