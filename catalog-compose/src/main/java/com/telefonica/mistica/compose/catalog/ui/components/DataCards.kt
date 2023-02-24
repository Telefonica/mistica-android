package com.telefonica.mistica.compose.catalog.ui.components

import androidx.annotation.AttrRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_CIRCULAR_ICON
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_ICON
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.datacard.DataCard
import com.telefonica.mistica.compose.card.datacard.noIcon
import com.telefonica.mistica.compose.card.datacard.resourceIconPainter
import com.telefonica.mistica.compose.catalog.R
import com.telefonica.mistica.compose.input.DropDownInput
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO

@Composable
fun DataCards() {

    var tag: String by remember { mutableStateOf("tag") }
    var tagStyle: Int by remember { mutableStateOf(TYPE_PROMO) }

    var preTitle: String by remember { mutableStateOf("preTitle") }
    var title: String by remember { mutableStateOf("title") }
    var subtitle: String by remember { mutableStateOf("subtitle") }
    var description: String by remember { mutableStateOf("description") }
    var primaryAction: String by remember { mutableStateOf("primaryAction") }
    var secondaryAction: String by remember { mutableStateOf("secondaryAction") }

    var withAditionalContent: Boolean by remember { mutableStateOf(false) }
    var withIcon: Boolean by remember { mutableStateOf(false) }
    var iconType: IconTypes by remember { mutableStateOf(IconTypes.ICON) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        OutlinedTextField(value = tag, onValueChange = { tag = it }, label = { Text("Tag") })

        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp, 8.dp),
            items = TagColors.values().map { it.name },
            currentItemIndex = tagStyle,
            onItemSelected = { index -> tagStyle = index },
            hint = "Tag style",
        )

        OutlinedTextField(value = preTitle, onValueChange = { preTitle = it }, label = { Text("PreTitle") })
        OutlinedTextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
        OutlinedTextField(value = subtitle, onValueChange = { subtitle = it }, label = { Text("Subtitle") })
        OutlinedTextField(value = description, onValueChange = { description = it }, label = { Text("Description") })

        OutlinedTextField(value = primaryAction, onValueChange = { primaryAction = it }, label = { Text("Primary Action") })
        OutlinedTextField(value = secondaryAction, onValueChange = { secondaryAction = it }, label = { Text("Secondary Action") })

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("With aditional content")
            Checkbox(checked = withAditionalContent, onCheckedChange = { withAditionalContent = !withAditionalContent })
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("With icon")
            Checkbox(checked = withIcon, onCheckedChange = { withIcon = !withIcon })
        }

        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp, 8.dp),
            items = IconTypes.values().map { it.name },
            currentItemIndex = IconTypes.values().indexOf(iconType),
            onItemSelected = { index -> iconType = IconTypes.values()[index] },
            hint = "Icon type",
        )

        DataCard(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            iconPainter = if (withIcon) {
                when (iconType) {
                    IconTypes.ICON -> resourceIconPainter(iconRes = R.drawable.ic_lightning_light, isCircular = false)
                    IconTypes.CIRCULAR_ICON -> resourceIconPainter(
                        iconRes = R.drawable.ic_lightning_light,
                        isCircular = true,
                        backgroundColor = MisticaTheme.colors.brandLow,
                        iconTint = MisticaTheme.colors.brand
                    )
                    IconTypes.CIRCULAR_IMAGE -> resourceIconPainter(iconRes = R.drawable.card_image_sample, isCircular = true)
                }
            } else {
                noIcon()
            },
            tag = if (tag.isNotEmpty()) Tag(tag).withStyle(tagStyle) else null,
            preTitle = preTitle.getOrNullIfEmpty(),
            title = title.getOrNullIfEmpty(),
            subtitle = subtitle.getOrNullIfEmpty(),

            description = description,

            primaryButton = if (primaryAction.isNotEmpty()) Action(primaryAction) { } else null,
            linkButton = if (secondaryAction.isNotEmpty()) Action(secondaryAction) { } else null,
            customContent = if (withAditionalContent) {
                { Text("Aditional content") }
            } else {
                {}
            },
        )
    }
}

private enum class TagColors(@AttrRes val tagStyle: Int) {
    PROMO(TYPE_PROMO),
    ACTIVE(TagView.TYPE_ACTIVE),
    INACTIVE(TagView.TYPE_INACTIVE),
    SUCCESS(TagView.TYPE_SUCCESS),
    WARNING(TagView.TYPE_WARNING),
    ERROR(TagView.TYPE_ERROR),
    INVERSE(TagView.TYPE_INVERSE),
}

private enum class IconTypes(@AttrRes val iconType: Int) {
    ICON(TYPE_ICON),
    CIRCULAR_ICON(TYPE_CIRCULAR_ICON),
    CIRCULAR_IMAGE(TYPE_CIRCULAR_ICON),
}

private fun String.getOrNullIfEmpty(): String? = if (this.isEmpty()) null else this
