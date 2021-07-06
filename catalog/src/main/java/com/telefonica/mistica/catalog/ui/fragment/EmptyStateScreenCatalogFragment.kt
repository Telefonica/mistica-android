package com.telefonica.mistica.catalog.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.StyleRes
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.activity.EmptyStateScreenCatalogActivity
import com.telefonica.mistica.emptystate.screen.EmptyStateScreenView
import com.telefonica.mistica.emptystate.screen.EmptyStateScreenView.ButtonsConfig
import com.telefonica.mistica.emptystate.screen.EmptyStateScreenView.ImageSize
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput

class EmptyStateScreenCatalogFragment(
    @StyleRes private val themeOverride: Int? = null,
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.empty_state_screen_fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<DropDownInput>(R.id.image_size_dropdown).configure(
            values = ScreenImageSize.values().map { it.name },
            defaultValue = ScreenImageSize.IMAGE_SIZE_SMALL.name,
        )
        view.findViewById<DropDownInput>(R.id.buttons_config_dropdown).configure(
            values = ScreenButtonsConfig.values().map { it.name },
            defaultValue = ScreenButtonsConfig.BUTTONS_CONFIG_PRIMARY.name,
        )

        view.findViewById<Button>(R.id.show_button).setOnClickListener { showEmptyStateScreen(view) }
    }

    private fun showEmptyStateScreen(catalogView: View) {
        with(Intent(context, EmptyStateScreenCatalogActivity::class.java)) {
            themeOverride?.let { putExtra(EmptyStateScreenCatalogActivity.EXTRA_THEME, it) }
            putExtra(
                EmptyStateScreenCatalogActivity.EXTRA_IMAGE_SIZE,
                ScreenImageSize.valueOf(catalogView.findViewById<DropDownInput>(R.id.image_size_dropdown).dropDown.text.toString()).imageSize
            )
            putExtra(
                EmptyStateScreenCatalogActivity.EXTRA_TITLE,
                catalogView.findViewById<TextInput>(R.id.title_input).text.toString()
            )
            putExtra(
                EmptyStateScreenCatalogActivity.EXTRA_SUBTITLE,
                catalogView.findViewById<TextInput>(R.id.subtitle_input).text.toString()
            )
            putExtra(
                EmptyStateScreenCatalogActivity.EXTRA_BUTTONS_CONFIG,
                ScreenButtonsConfig.valueOf(catalogView.findViewById<DropDownInput>(R.id.buttons_config_dropdown).dropDown.text.toString()).buttonsConfig
            )
            putExtra(
                EmptyStateScreenCatalogActivity.EXTRA_PRIMARY_BUTTON_TEXT,
                catalogView.findViewById<TextInput>(R.id.primary_buton_text_input).text.toString()
            )
            putExtra(
                EmptyStateScreenCatalogActivity.EXTRA_SECONDARY_BUTTON_TEXT,
                catalogView.findViewById<TextInput>(R.id.secondary_buton_text_input).text.toString()
            )
            putExtra(
                EmptyStateScreenCatalogActivity.EXTRA_LINK_BUTTON_TEXT,
                catalogView.findViewById<TextInput>(R.id.link_buton_text_input).text.toString())
            context?.startActivity(this)
        }
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

    private enum class ScreenImageSize(@ImageSize val imageSize: Int) {
        IMAGE_SIZE_ICON(EmptyStateScreenView.IMAGE_SIZE_ICON),
        IMAGE_SIZE_SMALL(EmptyStateScreenView.IMAGE_SIZE_SMALL),
        IMAGE_SIZE_FULL_WIDTH(EmptyStateScreenView.IMAGE_SIZE_FULL_WIDTH),
    }

    private enum class ScreenButtonsConfig(@ButtonsConfig val buttonsConfig: Int) {
        BUTTONS_CONFIG_NONE(EmptyStateScreenView.BUTTONS_CONFIG_NONE),
        BUTTONS_CONFIG_PRIMARY(EmptyStateScreenView.BUTTONS_CONFIG_PRIMARY),
        BUTTONS_CONFIG_PRIMARY_LINK(EmptyStateScreenView.BUTTONS_CONFIG_PRIMARY_LINK),
        BUTTONS_CONFIG_PRIMARY_SECONDARY(EmptyStateScreenView.BUTTONS_CONFIG_PRIMARY_SECONDARY),
        BUTTONS_CONFIG_SECONDARY(EmptyStateScreenView.BUTTONS_CONFIG_SECONDARY),
        BUTTONS_CONFIG_SECONDARY_LINK(EmptyStateScreenView.BUTTONS_CONFIG_SECONDARY_LINK),
    }
}
