package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.StyleRes
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.telefonica.mistica.bottomsheet.Asset
import com.telefonica.mistica.bottomsheet.BottomSheet
import com.telefonica.mistica.bottomsheet.BottomSheetView
import com.telefonica.mistica.bottomsheet.Children
import com.telefonica.mistica.bottomsheet.OnBottomSheetClicked
import com.telefonica.mistica.bottomsheet.RowWithCheckboxElement
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.databinding.ScreenFragmentBottomSheetCatalogBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BottomSheetCatalogFragment(
    @StyleRes private val themeOverride: Int? = null
) : Fragment() {

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
            BottomSheet(this.context!!)
                .withList(Children.ListWithCheckbox(
                    id = "0",
                    elements = listOf(
                        RowWithCheckboxElement.RowWithCheckBox(
                            id ="0",
                            title = "Test",
                            asset = Asset.Image(ResourcesCompat.getDrawable(resources, R.drawable.highlighted_card_custom_background, context!!.theme)!!),
                            description = null,
                        ),
                        RowWithCheckboxElement.RowWithCheckBox(
                            id ="1",
                            title = "Another",
                            asset = Asset.Image(ResourcesCompat.getDrawable(resources, R.drawable.highlighted_card_custom_background, context!!.theme)!!),
                            description = "Initially selected",
                            selected = true,
                        )
                    )
                ))
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
                .show()
        }

    }
}