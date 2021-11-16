package com.telefonica.mistica.compose.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BadgeBox
import androidx.compose.material.Checkbox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

@ExperimentalMaterialApi
@Composable
fun ListRowItem(
    rowImage: RowImage? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    badge: String? = null,
    isBadgeVisible: Boolean = false,
    headline: @Composable (() -> Unit)? = null,
    action: @Composable (ColumnScope.() -> Unit)? = null,
    onClick: () -> Unit = {},
) {
    val badgeVisible by remember { mutableStateOf(isBadgeVisible) }

    val boxModifier = when (backgroundType) {
        BackgroundType.TYPE_NORMAL -> Modifier
        BackgroundType.TYPE_BOXED,
        BackgroundType.TYPE_BOXED_INVERSE,
        -> Modifier
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
            RowImage(rowImage)

            Column(
                modifier = Modifier
                    .weight(1f)
                    .absolutePadding(right = 4.dp)
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
                    )
                }
                description?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset2,
                        color = textColorSecondary,
                    )
                }
            }

            if (badgeVisible) {
                val badgeModifier = Modifier
                    .align(CenterVertically)
                    .padding(4.dp)
                if (badge.isNullOrEmpty()) {
                    Surface(
                        shape = RoundedCornerShape(50),
                        color = MisticaTheme.colors.badge,
                        modifier = badgeModifier
                            .height(8.dp)
                            .width(8.dp)
                    ) { }
                } else {
                    BadgeBox(
                        badgeContent = { Text(text = badge) },
                        backgroundColor = MisticaTheme.colors.badge,
                        modifier = badgeModifier
                    ) { }
                }
            }

            action?.let {
                Column(modifier = Modifier.align(CenterVertically)) {
                    it()
                }
            }
        }
    }
}

@Composable
private fun RowImage(image: RowImage?) {
    if (image != null) {
        when (image) {
            is Icon -> {
                Image(
                    painter = image.painter,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .let {
                            if (image.withBackground) {
                                it.background(MisticaTheme.colors.neutralLow, shape = CircleShape)
                            } else {
                                it
                            }
                        }
                )
            }
            is ResourceImage -> {
                Image(
                    painter = image.painter,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
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
                title = "Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title ",
                subtitle = "Subtitle",
                description = "Description",
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = true)
            )
            ListRowItem(
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false),
                action = { Chevron() }
            )
            ListRowItem(
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false),
                action = {
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

sealed class RowImage(val painter: Painter)

class ResourceImage(painter: Painter) : RowImage(painter)
class Icon(painter: Painter, val withBackground: Boolean) : RowImage(painter)

@Composable
fun Chip(
    name: String = "Chip",
    color: Color = MisticaTheme.colors.badge,
) {
    Surface(
        shape = RoundedCornerShape(4.dp),
        color = color,
    ) {
        Text(
            text = name.uppercase(),
            style = MisticaTheme.typography.preset1Medium,
            color = Color.White,
            modifier = Modifier.padding(
                horizontal = 8.dp,
            ),
        )
    }
}

@Composable
fun Chevron() {
    Row(
        modifier = Modifier.wrapContentHeight(align = CenterVertically)
    ) {
        Image(
            painter = painterResource(id = R.drawable.icn_arrow),
            contentDescription = null,
            modifier = Modifier
                .align(CenterVertically)
                .absolutePadding(
                    left = 8.dp
                )
        )
    }
}

fun Modifier.`if`(
    condition: Boolean,
    then: Modifier.() -> Modifier,
): Modifier =
    if (condition) {
        then()
    } else {
        this
    }
