package com.telefonica.mistica.compose.list

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.badge.Badge
import com.telefonica.mistica.compose.list.AccessibilityOrder.BOTTOM
import com.telefonica.mistica.compose.list.AccessibilityOrder.DESCRIPTION
import com.telefonica.mistica.compose.list.AccessibilityOrder.HEADLINE
import com.telefonica.mistica.compose.list.AccessibilityOrder.SUBTITLE
import com.telefonica.mistica.compose.list.AccessibilityOrder.TITLE
import com.telefonica.mistica.compose.list.AccessibilityOrder.TRAILING
import com.telefonica.mistica.compose.shape.Chevron
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

@Composable
fun ListRowItem(
    modifier: Modifier = Modifier,
    listRowIcon: ListRowIcon? = null,
    title: String? = null,
    isTitleHeading: Boolean = false,
    subtitle: String? = null,
    description: String? = null,
    backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    badge: String? = null,
    isBadgeVisible: Boolean = false,
    headline: Tag? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    bottom: @Composable (() -> Unit)? = null,
    customContentDescription: CustomContentDescriptionConfig? = null,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
) {
    ListRowItemImp(
        modifier = modifier,
        icon = listRowIcon?.let { { listRowIcon.Draw() } },
        title = title,
        isTitleHeading = isTitleHeading,
        subtitle = subtitle,
        description = description,
        backgroundType = backgroundType,
        badge = badge,
        isBadgeVisible = isBadgeVisible,
        headline = headline,
        trailing = trailing,
        onClick = onClick,
        bottom = bottom,
        customContentDescription = customContentDescription,
        contentPadding = contentPadding
    )
}

@Composable
@Deprecated(replaceWith = ReplaceWith("ListRowItem"), message = "Use new ListRowItem with ListRowIcon param instead")
fun ListRowItem(
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    title: String? = null,
    isTitleHeading: Boolean = false,
    subtitle: String? = null,
    description: String? = null,
    backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    badge: String? = null,
    isBadgeVisible: Boolean = false,
    headline: Tag? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    bottom: @Composable (() -> Unit)? = null,
    customContentDescription: CustomContentDescriptionConfig? = null,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
) {
    ListRowItemImp(
        modifier = modifier,
        icon = icon,
        title = title,
        subtitle = subtitle,
        description = description,
        backgroundType = backgroundType,
        badge = badge,
        isBadgeVisible = isBadgeVisible,
        headline = headline,
        isTitleHeading = isTitleHeading,
        trailing = trailing,
        onClick = onClick,
        bottom = bottom,
        customContentDescription = customContentDescription,
        contentPadding = contentPadding
    )
}

@Composable
@Suppress("CyclomaticComplexMethod")
private fun ListRowItemImp(
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    title: String? = null,
    isTitleHeading: Boolean = false,
    subtitle: String? = null,
    description: String? = null,
    backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    badge: String? = null,
    isBadgeVisible: Boolean = false,
    headline: Tag? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    bottom: @Composable (() -> Unit)? = null,
    customContentDescription: CustomContentDescriptionConfig? = null,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
) {
    val badgeVisible by remember { mutableStateOf(isBadgeVisible) }
    val isRowFocusableGroup = onClick != null || customContentDescription != null

    val boxModifier = when (backgroundType) {
        BackgroundType.TYPE_NORMAL -> modifier
        BackgroundType.TYPE_BOXED,
        BackgroundType.TYPE_BOXED_INVERSE,
            -> modifier.padding(contentPadding)
    }
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius))
        .makeClickableIfNeeded(onClick)
        .semantics(mergeDescendants = isRowFocusableGroup) {
            isTraversalGroup = true
            if (customContentDescription != null) contentDescription = customContentDescription.contentDescription
        }

    val rowModifier = when (backgroundType) {
        BackgroundType.TYPE_NORMAL -> Modifier
        BackgroundType.TYPE_BOXED -> Modifier
            .border(
                width = 1.dp,
                color = MisticaTheme.colors.border,
                shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius),
            )
            .background(
                color = MisticaTheme.colors.backgroundContainer,
                shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius),
            )

        BackgroundType.TYPE_BOXED_INVERSE -> Modifier
            .background(
                brush = MisticaTheme.brushes.backgroundBrand,
                shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius),
            )
    }
        .fillMaxWidth()
        .defaultMinSize(
            minHeight = when (description) {
                null -> 72.dp
                else -> 80.dp
            }
        )
        .padding(16.dp)

    val textColorPrimary = when (backgroundType) {
        BackgroundType.TYPE_NORMAL,
        BackgroundType.TYPE_BOXED,
            -> MisticaTheme.colors.textPrimary

        BackgroundType.TYPE_BOXED_INVERSE -> MisticaTheme.colors.textPrimaryInverse
    }

    val textColorSecondary = when (backgroundType) {
        BackgroundType.TYPE_NORMAL,
        BackgroundType.TYPE_BOXED,
            -> MisticaTheme.colors.textSecondary

        BackgroundType.TYPE_BOXED_INVERSE -> MisticaTheme.colors.textSecondaryInverse
    }

    Box(
        modifier = boxModifier.testTag(ListRowItemTestTags.LIST_ROW_ITEM)
    ) {
        Row(
            modifier = rowModifier.height(IntrinsicSize.Min)
        ) {
            if (icon != null) {
                Box(modifier = Modifier.testTag(ListRowItemTestTags.LIST_ROW_ITEM_ICON)) {
                    icon()
                }
                Spacer(modifier = Modifier.width(16.dp))
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .absolutePadding(right = 16.dp)
                    .align(CenterVertically)
            ) {
                headline?.let {
                    it.withModifier(
                        Modifier.then(
                            if (customContentDescription != null) Modifier.clearAndSetSemantics { }
                            else Modifier
                                .semantics { traversalIndex = HEADLINE.index }
                                .zIndex(HEADLINE.index)
                        ),
                    ).build()
                    Spacer(modifier = Modifier.height(8.dp))
                }

                title?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset3,
                        color = textColorPrimary,
                        modifier = Modifier
                            .testTag(ListRowItemTestTags.LIST_ROW_ITEM_TITLE)
                            .then(
                                if (customContentDescription != null) Modifier.clearAndSetSemantics { }
                                else Modifier
                                    .semantics {
                                        if (isTitleHeading) heading()
                                        traversalIndex = TITLE.index
                                    }
                                    .zIndex(TITLE.index)
                            ),
                    )
                }

                subtitle?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset2,
                        color = textColorPrimary,
                        modifier = Modifier
                            .testTag(ListRowItemTestTags.LIST_ROW_ITEM_SUBTITLE)
                            .padding(vertical = 2.dp)
                            .defaultMinSize(minHeight = 20.dp)
                            .then(
                                if (customContentDescription != null) Modifier.clearAndSetSemantics { }
                                else Modifier
                                    .semantics { traversalIndex = SUBTITLE.index }
                                    .zIndex(SUBTITLE.index)
                            ),
                    )
                }

                description?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset2,
                        color = textColorSecondary,
                        modifier = Modifier
                            .testTag(ListRowItemTestTags.LIST_ROW_ITEM_DESCRIPTION)
                            .padding(vertical = 2.dp)
                            .defaultMinSize(minHeight = 20.dp)
                            .then(
                                if (customContentDescription != null) Modifier.clearAndSetSemantics { }
                                else Modifier
                                    .semantics { traversalIndex = DESCRIPTION.index }
                                    .zIndex(DESCRIPTION.index)
                            ),
                    )
                }

                bottom?.let {
                    Spacer(modifier = Modifier.height(2.dp))
                    Box(
                        modifier = Modifier
                            .then(
                                if (customContentDescription?.ignoreBottomSlot == true) Modifier.clearAndSetSemantics { }
                                else Modifier
                                    .semantics(mergeDescendants = !isRowFocusableGroup) { traversalIndex = BOTTOM.index }
                                    .zIndex(BOTTOM.index)
                            )
                    ) {
                        it()
                    }
                }
            }

            if (badgeVisible) {
                val badgeModifier = Modifier
                    .align(CenterVertically)
                    .absolutePadding(0.dp, 0.dp, 16.dp, 0.dp)
                    .clearAndSetSemantics { }
                Badge(
                    modifier = badgeModifier,
                    content = badge,
                )
            }

            trailing?.let {
                Column(
                    modifier = Modifier
                        .align(CenterVertically)
                        .then(
                            if (customContentDescription?.ignoreTrailingSlot == true) Modifier.clearAndSetSemantics { }
                            else Modifier
                                .semantics(mergeDescendants = !isRowFocusableGroup) { traversalIndex = TRAILING.index }
                                .zIndex(TRAILING.index)
                        )
                ) {
                    it()
                }
            }
        }
    }
}

private fun Modifier.makeClickableIfNeeded(onClick: (() -> Unit)?): Modifier =
    if (onClick != null) {
        clickable(onClick = onClick)
    } else {
        this
    }

object ListRowItemTestTags {
    const val LIST_ROW_ITEM = "list_row_item"
    const val LIST_ROW_ITEM_ICON = "list_row_item_icon"
    const val LIST_ROW_ITEM_DESCRIPTION = "list_row_item_description"
    const val LIST_ROW_ITEM_SUBTITLE = "list_row_item_subtitle"
    const val LIST_ROW_ITEM_TITLE = "list_row_item_title"
}

data class CustomContentDescriptionConfig(
    val contentDescription: String,
    val ignoreBottomSlot: Boolean = true,
    val ignoreTrailingSlot: Boolean = true,
)

@Preview(showBackground = true)
@Composable
fun ListRowItemPreview() {
    MisticaTheme(brand = MovistarBrand) {
        val checkedState = remember { mutableStateOf(true) }
        Column {
            ListRowItem(
                listRowIcon = null,
                title = "Title",
            )
            ListRowItem(
                listRowIcon = null,
                headline = Tag("Promo"),
                isBadgeVisible = true,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                trailing = { Chevron() },
            )
            ListRowItem(
                title = "Title",
                isBadgeVisible = true,
                badge = "2",
                subtitle = "Subtitle",
                description = "Description",
                listRowIcon = ListRowIcon.NormalIcon(
                    painter = painterResource(id = R.drawable.icn_arrow),
                    description = null
                ),
                trailing = { Chevron() }
            )
            ListRowItem(
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                listRowIcon = ListRowIcon.CircleIcon(
                    painter = painterResource(id = R.drawable.icn_creditcard),
                    backgroundColor = MisticaTheme.colors.neutralLow,
                    description = null,
                    tint = Color.Red
                ),
                trailing = {
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it }
                    )
                }
            )
            ListRowItem(
                backgroundType = BackgroundType.TYPE_BOXED,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                listRowIcon = ListRowIcon.CircleIcon(backgroundColor = MisticaTheme.colors.neutralLow),
                trailing = {
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it }
                    )
                },
                bottom = {
                    Box(
                        modifier = Modifier
                            .height(40.dp)
                            .fillMaxWidth()
                            .background(Color.Green)
                    )
                }
            )
        }
    }
}

enum class BackgroundType {
    TYPE_NORMAL,
    TYPE_BOXED,
    TYPE_BOXED_INVERSE,
}

private enum class AccessibilityOrder(val index: Float) {
    TITLE(1f),
    HEADLINE(2f),
    SUBTITLE(3f),
    DESCRIPTION(4f),
    BOTTOM(5f),
    TRAILING(6f),
}
