package com.telefonica.mistica.compose.catalog.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.RoundedCornersTransformation
import com.telefonica.mistica.compose.catalog.R
import com.telefonica.mistica.compose.list.BackgroundType
import com.telefonica.mistica.compose.list.Chevron
import com.telefonica.mistica.compose.list.Chip
import com.telefonica.mistica.compose.list.Icon
import com.telefonica.mistica.compose.list.ListRowItem
import com.telefonica.mistica.compose.list.ResourceImage
import com.telefonica.mistica.compose.list.RowImage
import com.telefonica.mistica.compose.theme.MisticaTheme

const val TITLE = "Title"
const val SUBTITLE = "Subtitle"
const val DESCRIPTION = "Description"

val samples = listOf(
    ListItem(
        title = TITLE,
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
    ),

    ListItem(
        title = TITLE,
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, true),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, true),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, true),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, true),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, true),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        rowImage = ListItemImage.Icon(R.drawable.icn_arrow, true),
    ),

    ListItem(
        title = TITLE,
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, false),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, false),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, false),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, false),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, false),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, false),
    ),


    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        rowImage = ListItemImage.Icon(R.drawable.ic_lists, false),
    ),
    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        rowImage = ListItemImage.Resource(R.drawable.list_row_drawable),
    ),
    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = {
            Image(
                painter = rememberImagePainter(
                    data = "https://www.fotoaparat.cz/imgs/a/26/2639/0n1wjdf0-cr-em13-09-1200x627x9.jpg",
                    builder = {
                        transformations(RoundedCornersTransformation(4f, 4f, 4f, 4f))
                    }
                ),
                contentDescription = null,
                modifier = Modifier.size(88.dp)
            )
        },
        isBadgeVisible = true,
        badge = "1",
        rowImage = ListItemImage.Resource(R.drawable.list_row_drawable),
    ),
    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = {
            Switch(checked = true, onCheckedChange = {})
        },
        isBadgeVisible = true,
        badge = "1",
        rowImage = ListItemImage.Resource(R.drawable.list_row_drawable),
    ),
)


@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun Lists() {
    val scrollState = rememberLazyListState()
    LazyColumn(
        state = scrollState,
        modifier = Modifier.fillMaxSize(),
    ) {
        items(samples) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                rowImage = listItemImage(item.rowImage),
                headline = item.headline,
                title = item.title,
                subtitle = item.subtitle,
                description = item.description,
                action = item.action,
                onClick = item.onClick,
            )
            Divider(
                modifier = Modifier.padding(horizontal = 16.dp),
                color = MisticaTheme.colors.divider
            )
        }
        items(samples.map { it.copy(backgroundType = BackgroundType.TYPE_BOXED) }) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                rowImage = listItemImage(item.rowImage),
                headline = item.headline,
                title = item.title,
                subtitle = item.subtitle,
                description = item.description,
                action = item.action,
                onClick = item.onClick,
            )
            Divider(
                modifier = Modifier.padding(horizontal = 16.dp),
                color = MisticaTheme.colors.divider
            )
        }
        items(samples.map { it.copy(backgroundType = BackgroundType.TYPE_BOXED_INVERSE) }) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                rowImage = listItemImage(item.rowImage),
                headline = item.headline,
                title = item.title,
                subtitle = item.subtitle,
                description = item.description,
                action = item.action,
                onClick = item.onClick,
            )
            Divider(
                modifier = Modifier.padding(horizontal = 16.dp),
                color = MisticaTheme.colors.divider
            )
        }
    }
}

@Composable
private fun listItemImage(img: ListItemImage?): RowImage? = when (img) {
    is ListItemImage.Icon -> Icon(painterResource(id = img.drawableRes), withBackground = img.withBackground)
    is ListItemImage.Resource -> ResourceImage(painterResource(id = img.drawableRes))
    is ListItemImage.Url -> null
    else -> null
}

data class ListItem(
    val rowImage: ListItemImage? = null,
    val title: String? = null,
    val subtitle: String? = null,
    val description: String? = null,
    val backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    val badge: String? = null,
    val isBadgeVisible: Boolean = false,
    val headline: @Composable (() -> Unit)? = null,
    val action: @Composable (ColumnScope.() -> Unit)? = null,
    val onClick: () -> Unit = {},
)

sealed class ListItemImage {
    data class Icon(@DrawableRes val drawableRes: Int, val withBackground: Boolean) : ListItemImage()
    data class Resource(@DrawableRes val drawableRes: Int) : ListItemImage()
    data class Url(val url: String) : ListItemImage()
}
