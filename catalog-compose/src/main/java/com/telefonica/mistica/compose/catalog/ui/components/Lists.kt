package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.telefonica.mistica.compose.catalog.R
import com.telefonica.mistica.compose.list.BackgroundType
import com.telefonica.mistica.compose.list.Chevron
import com.telefonica.mistica.compose.list.Chip
import com.telefonica.mistica.compose.list.Circle
import com.telefonica.mistica.compose.list.ListRowItem
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
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        icon = { ListIcon() },
    ),

    ListItem(
        title = TITLE,
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        icon = { ListIcon() },
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        icon = { ListIcon() },
    ),

    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        icon = { ListIcon() },
    ),
    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        icon = { Avatar() },
    ),
    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Avatar("https://www.fotoaparat.cz/imgs/a/26/2639/0n1wjdf0-cr-em13-09-1200x627x9.jpg") },
        isBadgeVisible = true,
        badge = "1",
        icon = { Avatar() },
    ),
    ListItem(
        headline = { Chip("PROMO", MisticaTheme.colors.promo) },
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        icon = { Avatar() },
    ),
)

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun Lists() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        items(samples) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                icon = item.icon,
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
        items(samples.map {
            it.copy(backgroundType = BackgroundType.TYPE_BOXED)
        }) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                icon = item.icon,
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
        items(samples.map {
            it.copy(
                backgroundType = BackgroundType.TYPE_BOXED_INVERSE,
                action = { Chevron(isInverse = true) },
            )
        }) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                icon = item.icon,
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

data class ListItem(
    val icon: @Composable (() -> Unit)? = null,
    val title: String? = null,
    val subtitle: String? = null,
    val description: String? = null,
    val backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    val badge: String? = null,
    val isBadgeVisible: Boolean = false,
    val headline: @Composable (() -> Unit)? = null,
    val action: @Composable (() -> Unit)? = null,
    val onClick: () -> Unit = {},
)

@Composable
fun ListIcon() {
    Circle {
        Icon(
            painterResource(id = R.drawable.ic_lists),
            contentDescription = null
        )
    }
}

@Composable
fun Avatar() {
    Image(
        painter = painterResource(id = R.drawable.list_row_drawable),
        contentDescription = null,
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop,
    )
}

@Composable
fun Avatar(url: String) {
    Image(
        painter = rememberImagePainter(
            data = url,
            builder = {
                transformations(CircleCropTransformation())
            }
        ),
        contentDescription = null,
        modifier = Modifier.size(40.dp)
    )
}
