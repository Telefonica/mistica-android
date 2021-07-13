package com.telefonica.mistica.catalog.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.emptystate.card.EmptyStateCardView
import com.telefonica.mistica.emptystate.card.EmptyStateCardView.ButtonsConfig
import com.telefonica.mistica.emptystate.card.EmptyStateCardView.ImageSize
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput

class EmptyStateCardCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.empty_state_card_fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<DropDownInput>(R.id.image_size_dropdown).configure(
            values = CardImageSize.values().map { it.name },
            defaultValue = CardImageSize.IMAGE_SIZE_SMALL.name,
        )
        view.findViewById<DropDownInput>(R.id.buttons_config_dropdown).configure(
            values = CardButtonsConfig.values().map { it.name },
            defaultValue = CardButtonsConfig.BUTTONS_CONFIG_PRIMARY.name,
        )

        with(view.findViewById<EmptyStateCardView>(R.id.empty_state_card_view)) {
            view.findViewById<Button>(R.id.update_button).setOnClickListener { updateWith(view) }
            updateWith(view)
        }
    }

    private fun EmptyStateCardView.updateWith(catalogView: View) {
        setImageSize(CardImageSize.valueOf(catalogView.findViewById<DropDownInput>(R.id.image_size_dropdown).dropDown.text.toString()).imageSize)
        setTitle(catalogView.findViewById<TextInput>(R.id.title_input).text.toString())
        setSubtitle(catalogView.findViewById<TextInput>(R.id.subtitle_input).text.toString())
        setButtonsConfig(
            CardButtonsConfig.valueOf(catalogView.findViewById<DropDownInput>(R.id.buttons_config_dropdown).dropDown.text.toString()).buttonsConfig
        )
        setPrimaryButtonText(catalogView.findViewById<TextInput>(R.id.primary_buton_text_input).text.toString())
        setSecondaryButtonText(catalogView.findViewById<TextInput>(R.id.secondary_buton_text_input).text.toString())
        setLinkButtonText(catalogView.findViewById<TextInput>(R.id.link_buton_text_input).text.toString())
        setPrimaryButtonOnClick { showToast(context, "Primary button clicked!") }
        setSecondaryButtonOnClick { showToast(context, "Secondary button clicked!") }
        setLinkButtonOnClick { showToast(context, "Link button clicked!") }
    }

    private fun DropDownInput.configure(
        values: List<String>,
        defaultValue: String,
    ) {
        with(dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    context,
                    R.layout.dropdown_menu_popup_item,
                    values
                )
            )
            setText(defaultValue)
        }
    }

    private fun showToast(context: Context, message: String) {
        Toast.makeText(
            context,
            message,
            Toast.LENGTH_SHORT
        ).show()
    }

    private enum class CardImageSize(@ImageSize val imageSize: Int) {
        IMAGE_SIZE_ICON(EmptyStateCardView.IMAGE_SIZE_ICON),
        IMAGE_SIZE_SMALL(EmptyStateCardView.IMAGE_SIZE_SMALL),
    }

    private enum class CardButtonsConfig(@ButtonsConfig val buttonsConfig: Int) {
        BUTTONS_CONFIG_NONE(EmptyStateCardView.BUTTONS_CONFIG_NONE),
        BUTTONS_CONFIG_PRIMARY(EmptyStateCardView.BUTTONS_CONFIG_PRIMARY),
        BUTTONS_CONFIG_PRIMARY_LINK(EmptyStateCardView.BUTTONS_CONFIG_PRIMARY_LINK),
        BUTTONS_CONFIG_PRIMARY_SECONDARY(EmptyStateCardView.BUTTONS_CONFIG_PRIMARY_SECONDARY),
        BUTTONS_CONFIG_SECONDARY(EmptyStateCardView.BUTTONS_CONFIG_SECONDARY),
        BUTTONS_CONFIG_SECONDARY_LINK(EmptyStateCardView.BUTTONS_CONFIG_SECONDARY_LINK),
        LINK(EmptyStateCardView.LINK),
    }
}
