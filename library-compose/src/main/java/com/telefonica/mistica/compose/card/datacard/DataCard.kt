package com.telefonica.mistica.compose.card.datacard

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.Card
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagStyle
import com.telefonica.mistica.tag.TagView

@Composable
fun DataCard(
    modifier: Modifier = Modifier,
    @DrawableRes iconRes: Int? = null,
    cardTag: Tag? = null,
    preTitle: String? = null,
    title: String? = null,
    subtitle: String? = null,
    titleMaxLines: Int? = 1,//TODO gmerino
    description: String? = null,
    descriptionMaxLines: Int? = 1,//TODO gmerino
    primaryButton: Action? = null,
    linkButton: Action? = null,
    customContent: @Composable () -> Unit = {},
) {
    Card(
        modifier = modifier,
        iconRes = iconRes,
        cardTag = cardTag,
        preTitle = preTitle,
        title = title,
        subtitle = subtitle,
        titleMaxLines = titleMaxLines,
        description = description,
        descriptionMaxLines = descriptionMaxLines,
        primaryButton = primaryButton,
        linkButton = linkButton,
        customContent = customContent,
    )
}

data class Tag(
    val content: String,
    @TagStyle val style: Int = TagView.TYPE_PROMO,
)

data class Action(
    val text: String,
    val onTapped: () -> Unit,
)