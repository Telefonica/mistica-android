package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
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
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.mediacard.MediaCard
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage.MediaCardImageResource
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO

@Composable
@Suppress("LongMethod")
fun MediaCards() {

    var tag: String by remember { mutableStateOf("tag") }
    var tagType: Int by remember { mutableStateOf(TYPE_PROMO) }
    var tagTypeDropDownExpanded: Boolean by remember { mutableStateOf(false) }
    var tagTypeItems = listOf(
        "PROMO",
        "ACTIVE",
        "INACTIVE",
        "SUCCESS",
        "WARNING",
        "ERROR",
        "INVERSE",
    )

    var preTitle: String by remember { mutableStateOf("preTitle") }
    var title: String by remember { mutableStateOf("title") }
    var subtitle: String by remember { mutableStateOf("subtitle") }
    var description: String by remember { mutableStateOf("description") }
    var primaryAction: String by remember { mutableStateOf("primaryAction") }
    var secondaryAction: String by remember { mutableStateOf("secondaryAction") }

    var withAdditionalContent: Boolean by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        OutlinedTextField(value = tag, onValueChange = { tag = it }, label = { Text("Tag") })
        DropdownMenu(expanded = tagTypeDropDownExpanded, onDismissRequest = { tagTypeDropDownExpanded = false }) {
            tagTypeItems.forEachIndexed { index, s ->
                DropdownMenuItem(onClick = {
                    tagType = index
                    tagTypeDropDownExpanded = false
                }) {
                    Text(s)
                }
            }
        }

        OutlinedTextField(value = preTitle, onValueChange = { preTitle = it }, label = { Text("PreTitle") })
        OutlinedTextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
        OutlinedTextField(value = subtitle, onValueChange = { subtitle = it }, label = { Text("Subtitle") })
        OutlinedTextField(value = description, onValueChange = { description = it }, label = { Text("Description") })

        OutlinedTextField(value = primaryAction, onValueChange = { primaryAction = it }, label = { Text("Primary Action") })
        OutlinedTextField(value = secondaryAction, onValueChange = { secondaryAction = it }, label = { Text("Secondary Action") })

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("With additional content")
            Checkbox(checked = withAdditionalContent, onCheckedChange = { withAdditionalContent = !withAdditionalContent })
        }

        MediaCard(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            image = MediaCardImageResource(R.drawable.card_image_sample),
            tag = if (tag.isNotEmpty()) Tag(tag).withStyle(tagType) else null,
            preTitle = preTitle.getOrNullIfEmpty(),
            title = title.getOrNullIfEmpty(),
            subtitle = subtitle.getOrNullIfEmpty(),

            description = description,

            primaryButton = if (primaryAction.isNotEmpty()) Action(primaryAction) { } else null,
            linkButton = if (secondaryAction.isNotEmpty()) Action(secondaryAction) { } else null,
            customContent = if (withAdditionalContent) {
                { Text("Additional content") }
            } else {
                {}
            },
        )
    }
}

private fun String.getOrNullIfEmpty(): String? = if (this.isEmpty()) null else this
