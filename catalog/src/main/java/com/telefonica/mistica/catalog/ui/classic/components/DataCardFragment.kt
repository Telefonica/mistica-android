package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.AttrRes
import androidx.fragment.app.Fragment
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.card.datacard.DataCardView
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_CIRCULAR_ICON
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_CIRCULAR_IMAGE
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_ICON
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_SQUARE_IMAGE
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.tag.TagStyle
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ERROR
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INVERSE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_SUCCESS
import com.telefonica.mistica.tag.TagView.Companion.TYPE_WARNING

class DataCardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.data_card_fragment_catalog, container, false)
    }

    @TagStyle
    private var tagStyle = TYPE_PROMO

    private var iconType: IconTypes = IconTypes.ICON

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.data_card_button_update)
            .setOnClickListener { updateDataCardView(view) }
        configureTagStyleSelector(view)
        configureIconTypeSelector(view)
        updateDataCardView(view)
    }

    private fun configureTagStyleSelector(view: View) {
        with(view.findViewById<DropDownInput>(R.id.tag_color_selector).dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    TagColors.values().map { it.name }
                )
            )
            setText(TagColors.PROMO.name)
            setOnItemClickListener { _, _, _, _ ->
                tagStyle = TagColors.valueOf(text.toString()).tagStyle
                updateDataCardView(view)
            }
        }
    }

    private fun configureIconTypeSelector(view: View) {
        with(view.findViewById<DropDownInput>(R.id.icon_type_selector).dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    IconTypes.values().map { it.name }
                )
            )
            setText(IconTypes.ICON.name)
            setOnItemClickListener { _, _, _, _ ->
                iconType = IconTypes.valueOf(text.toString())
                updateDataCardView(view)
            }
        }
    }

    private fun updateDataCardView(view: View) {
        with(view.findViewById<DataCardView>(R.id.data_card_view)) {
            setTag(view.findViewById<TextInput>(R.id.input_tag).text.toString())
            setTitle(view.findViewById<TextInput>(R.id.input_title).text.toString())
            setSubtitle(view.findViewById<TextInput>(R.id.input_subtitle).text.toString())
            setDescription(view.findViewById<TextInput>(R.id.input_description).text.toString())
            setPrimaryButtonText(view.findViewById<TextInput>(R.id.input_primary_button).text.toString())
            setLinkButtonText(view.findViewById<TextInput>(R.id.input_link_button).text.toString())
            setTagStyle(tagStyle)

            if (view.findViewById<CheckBoxInput>(R.id.additional_content_checkbox).isChecked()) {
                setCardAdditionalContent(null)
                val additionalContent = LayoutInflater.from(context).inflate(R.layout.card_custom_sample_content, this, false)
                setCardAdditionalContent(additionalContent)
            } else {
                setCardAdditionalContent(null)
            }
            if (view.findViewById<CheckBoxInput>(R.id.show_icon_checkbox).isChecked()) {
                setIconType(iconType.iconType)
                when (iconType) {
                    IconTypes.ICON -> setIcon(R.drawable.ic_lightning_light)
                    IconTypes.CIRCULAR_ICON -> setIcon(R.drawable.ic_lightning_light)
                    IconTypes.CIRCULAR_IMAGE -> setIcon(R.drawable.media_card_sample_image)
                    IconTypes.SQUARE_IMAGE -> setIcon(R.drawable.media_card_sample_image)
                }
            } else {
                removeIcon()
            }
            setPrimaryButtonOnClick {
                Toast.makeText(view.context, "Primary button clicked!", Toast.LENGTH_SHORT).show()
            }
            setLinkButtonOnClick {
                Toast.makeText(view.context, "Secondary button clicked!", Toast.LENGTH_SHORT).show()
            }
            setOnClickListener {
                Toast.makeText(view.context, "Data card clicked!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private enum class TagColors(@AttrRes val tagStyle: Int) {
        PROMO(TYPE_PROMO),
        ACTIVE(TYPE_ACTIVE),
        INACTIVE(TYPE_INACTIVE),
        SUCCESS(TYPE_SUCCESS),
        WARNING(TYPE_WARNING),
        ERROR(TYPE_ERROR),
        INVERSE(TYPE_INVERSE),
    }

    private enum class IconTypes(@AttrRes val iconType: Int) {
        ICON(TYPE_ICON),
        CIRCULAR_ICON(TYPE_CIRCULAR_ICON),
        CIRCULAR_IMAGE(TYPE_CIRCULAR_IMAGE),
        SQUARE_IMAGE(TYPE_SQUARE_IMAGE),
    }
}
