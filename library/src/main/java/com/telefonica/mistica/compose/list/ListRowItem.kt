package com.telefonica.mistica.compose.list

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
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
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.badge.Badge
import com.telefonica.mistica.compose.shape.Chevron
import com.telefonica.mistica.compose.shape.Circle
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

@ExperimentalMaterialApi
@Composable
fun ListRowItem(
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    badge: String? = null,
    isBadgeVisible: Boolean = false,
    headline: Tag? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    bottom: @Composable (() -> Unit)? = null,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
) {
    val badgeVisible by remember { mutableStateOf(isBadgeVisible) }

    val boxModifier = when (backgroundType) {
        BackgroundType.TYPE_NORMAL -> modifier
        BackgroundType.TYPE_BOXED,
        BackgroundType.TYPE_BOXED_INVERSE,
        -> modifier.padding(contentPadding)
    }
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius))
        .makeClickableIfNeeded(onClick)

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
                color = MisticaTheme.colors.backgroundBrand,
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
                    it.build()
                    Spacer(modifier = Modifier.height(8.dp))
                }
                title?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset3,
                        color = textColorPrimary,
                        modifier = Modifier.testTag(ListRowItemTestTags.LIST_ROW_ITEM_TITLE),
                    )
                }
                subtitle?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset2,
                        color = textColorSecondary,
                        modifier = Modifier
                            .testTag(ListRowItemTestTags.LIST_ROW_ITEM_SUBTITLE)
                            .padding(vertical = 2.dp)
                            .defaultMinSize(minHeight = 20.dp),
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
                            .defaultMinSize(minHeight = 20.dp),
                    )
                }
                bottom?.let {
                    Spacer(modifier = Modifier.height(2.dp))
                    bottom()
                }
            }

            if (badgeVisible) {
                val badgeModifier = Modifier
                    .align(CenterVertically)
                    .absolutePadding(0.dp, 0.dp, 16.dp, 0.dp)
                Badge(
                    modifier = badgeModifier,
                    content = badge,
                )
            }

            trailing?.let {
                Column(modifier = Modifier.align(CenterVertically)) {
                    it()
                }
            }
        }
    }
}

@Composable
private fun ListRowIcon(
    @DrawableRes iconResId: Int?,
    contentDescription: String?,
) {
    if (iconResId != null) {
        Image(painter = painterResource(id = iconResId), contentDescription = contentDescription)
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

data class ListIconConfig(
    @DrawableRes val iconResId: Int? = null,
    val showIconCircle: Boolean = false,
    val iconContentDescription: String? = null,
) {

    @Composable
    fun Draw() {
        when (showIconCircle) {
            true -> Circle {
                ListRowIcon(iconResId = iconResId, contentDescription = iconContentDescription)
            }

            false -> ListRowIcon(iconResId = iconResId, contentDescription = iconContentDescription)
        }
    }

}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun ListRowItemPreview() {
    MisticaTheme(brand = MovistarBrand) {
        val checkedState = remember { mutableStateOf(true) }
        Column {
            ListRowItem(
                headline = Tag("Promo"),
                icon = {
                    Icon(
                        painterResource(id = R.drawable.icn_arrow),
                        contentDescription = null
                    )
                },
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
                icon = {
                    Circle {
                        Icon(
                            painterResource(id = R.drawable.icn_arrow),
                            contentDescription = null
                        )
                    }
                },
                trailing = { Chevron() }
            )
            ListRowItem(
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                icon = {
                    Circle {}
                },
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
                icon = {
                    Circle {}
                },
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
