package com.telefonica.mistica.compose.list

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.badge.Badge
import com.telefonica.mistica.compose.chip.Chip
import com.telefonica.mistica.compose.shape.Chevron
import com.telefonica.mistica.compose.shape.Circle
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
    headline: @Composable (() -> Unit)? = null,
    trailing: @Composable (() -> Unit)? = null,
    onClick: () -> Unit = {},
) {
    val badgeVisible by remember { mutableStateOf(isBadgeVisible) }

    val boxModifier = when (backgroundType) {
        BackgroundType.TYPE_NORMAL -> Modifier
        BackgroundType.TYPE_BOXED,
        BackgroundType.TYPE_BOXED_INVERSE,
        -> modifier
            .padding(16.dp)
    }
        .fillMaxWidth()
        .clip(shape = RoundedCornerShape(4.dp))
        .clickable(onClick = onClick)

    val rowModifier = when (backgroundType) {
        BackgroundType.TYPE_NORMAL -> Modifier
        BackgroundType.TYPE_BOXED -> Modifier
            .border(
                width = 1.dp,
                color = MisticaTheme.colors.border,
                shape = RoundedCornerShape(4.dp),
            )
        BackgroundType.TYPE_BOXED_INVERSE -> Modifier
            .background(
                color = MisticaTheme.colors.backgroundBrand,
                shape = RoundedCornerShape(4.dp),
            )
            .border(
                width = 1.dp,
                color = MisticaTheme.colors.border,
                shape = RoundedCornerShape(4.dp),
            )
    }
        .fillMaxWidth()
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
        modifier = boxModifier
    ) {
        Row(
            modifier = rowModifier
        ) {
            if (icon != null) {
                icon()
                Spacer(modifier = Modifier.width(16.dp))
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .absolutePadding(right = 16.dp)
                    .align(CenterVertically)
            ) {
                headline?.let {
                    it()
                    Spacer(modifier = Modifier.height(8.dp))
                }
                title?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset3Light,
                        color = textColorPrimary,
                    )
                }
                subtitle?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset2,
                        color = textColorSecondary,
                        modifier = Modifier
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
                            .padding(vertical = 2.dp)
                            .defaultMinSize(minHeight = 20.dp),
                    )
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

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun ListRowItemPreview() {
    MisticaTheme(brand = MovistarBrand) {
        val checkedState = remember { mutableStateOf(true) }
        Column {
            ListRowItem(
                headline = { Chip() },
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
                    Icon(
                        painterResource(id = R.drawable.list_row_background),
                        contentDescription = null
                    )
                },
                trailing = { Chevron() }
            )
            ListRowItem(
                title = "Title",
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
                trailing = {
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it }
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
