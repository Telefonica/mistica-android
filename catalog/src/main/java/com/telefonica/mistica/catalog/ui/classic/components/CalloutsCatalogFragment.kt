package com.telefonica.mistica.catalog.ui.classic.components

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.callout.CalloutView
import com.telefonica.mistica.callout.CalloutViewImageConfig
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.util.getThemeColor

class CalloutsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.screen_callouts_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(view.findViewById<DropDownInput>(R.id.buttons_config_dropdown).dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    CalloutButtonsConfig.values().map { it.name },
                )
            )
            setText(CalloutButtonsConfig.PRIMARY.name)
        }
        with(view.findViewById<DropDownInput>(R.id.image_config_dropdown).dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    CalloutViewImageConfig.values().map { it.name },
                )
            )
            setText(CalloutViewImageConfig.ICON.name)
        }
        view.findViewById<Button>(R.id.update_button).setOnClickListener {
            updateCalloutView(view)
        }
        updateCalloutView(view)
    }

    private fun updateCalloutView(view: View) {
        with(view.findViewById<CalloutView>(R.id.callout_view)) {
            if (visibility == GONE) {
                visibility = VISIBLE
            }

            val imageConfig = CalloutViewImageConfig.valueOf(
                view.findViewById<DropDownInput>(R.id.image_config_dropdown).dropDown.text.toString()
            )

            when (imageConfig) {
                CalloutViewImageConfig.NONE -> {
                    setAssetType(imageConfig)
                }
                CalloutViewImageConfig.ICON -> {
                    setAsset(R.drawable.ic_callout)
                    setAssetType(imageConfig)
                }
                CalloutViewImageConfig.SQUARE_IMAGE,
                CalloutViewImageConfig.CIRCULAR_IMAGE -> {
                    setAsset(R.drawable.media_card_sample_image)
                    setAssetType(imageConfig)
                }
            }

            setDismissable(view.findViewById<CheckBoxInput>(R.id.dismiss_input).isChecked())
            val inverse = view.findViewById<CheckBoxInput>(R.id.inverse_input).isChecked()
            setInverse(inverse)
            with(view.findViewById<View>(R.id.callout_preview_container)) {
                if (inverse) {
                    setBackgroundColor(context.getThemeColor(R.attr.colorBackgroundBrand))
                } else {
                    setBackgroundColor(context.getThemeColor(R.attr.colorBackground))
                }
            }
            setTitle(view.findViewById<TextInput>(R.id.title_input).text.toString())
            setDescription(view.findViewById<TextInput>(R.id.description_input).text.toString())
            setButtonsConfig(
                CalloutButtonsConfig.valueOf(view.findViewById<DropDownInput>(R.id.buttons_config_dropdown).dropDown.text.toString()).buttonsConfig
            )
            setPrimaryButtonText(view.findViewById<TextInput>(R.id.primary_button_text_input).text.toString())
            setSecondaryButtonText(view.findViewById<TextInput>(R.id.secondary_button_text_input).text.toString())
            setLinkButtonText(view.findViewById<TextInput>(R.id.link_button_text_input).text.toString())
            setPrimaryButtonOnClick { showToast(context, "Primary button clicked!") }
            setSecondaryButtonOnClick { showToast(context, "Secondary button clicked!") }
            setLinkButtonOnClick { showToast(context, "Link button clicked!") }
            setOnDismiss { showToast(context, "Callout dismissed! Update to show again") }
        }
    }

    private fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    private enum class CalloutButtonsConfig(@CalloutView.ButtonsConfig val buttonsConfig: Int) {
        NONE(CalloutView.BUTTONS_CONFIG_NONE),
        PRIMARY(CalloutView.BUTTONS_CONFIG_PRIMARY),
        PRIMARY_AND_LINK(CalloutView.BUTTONS_CONFIG_PRIMARY_LINK),
        PRIMARY_AND_SECONDARY(CalloutView.BUTTONS_CONFIG_PRIMARY_SECONDARY),
        SECONDARY(CalloutView.BUTTONS_CONFIG_SECONDARY),
        SECONDARY_AND_LINK(CalloutView.BUTTONS_CONFIG_SECONDARY_LINK),
        LINK(CalloutView.BUTTONS_CONFIG_LINK),
    }
}