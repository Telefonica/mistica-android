package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.list.BackgroundType
import com.telefonica.mistica.compose.list.ListRowIcon
import com.telefonica.mistica.compose.list.ListRowItem
import com.telefonica.mistica.compose.shape.Chevron
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO

const val TITLE = "Title"
const val SUBTITLE = "Subtitle"
const val DESCRIPTION = "Description"

@Composable
fun samples() = listOf(
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
        subtitle = SUBTITLE,
        action = { Chevron() },
        bottom = { CustomSlot() },
    ),

    ListItem(
        title = TITLE,
        listRowIcon = ListRowIcon.CircleIcon(iconResId = R.drawable.ic_lists),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        listRowIcon = ListRowIcon.CircleIcon(iconResId = R.drawable.ic_lists),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        listRowIcon = ListRowIcon.CircleIcon(iconResId = R.drawable.ic_lists),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
        bottom = { CustomSlot() },
    ),

    ListItem(
        title = TITLE,
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
        bottom = { CustomSlot() },
    ),

    ListItem(
        headline = Tag(content = "PROMO").withStyle(TYPE_PROMO),
        title = TITLE,
        subtitle = SUBTITLE,
        action = { Chevron() },
        listRowIcon = ListRowIcon.CircleIcon(
            iconResId = R.drawable.ic_lists,
            backgroundColor = MisticaTheme.colors.backgroundAlternative
        ),
    ),
    ListItem(
        headline = Tag("PROMO").withStyle(TYPE_PROMO),
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Chevron() },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.SmallAsset(iconResId = R.drawable.list_row_drawable),
    ),
    ListItem(
        headline = Tag("PROMO").withStyle(TYPE_PROMO),
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Avatar(IMAGE_URL) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.SmallAsset(iconResId = R.drawable.list_row_drawable),
    ),
    ListItem(
        headline = Tag("PROMO").withStyle(TYPE_PROMO),
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.SmallAsset(iconResId = R.drawable.list_row_drawable),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.SmallAsset(iconUrl = IMAGE_URL),
        bottom = { CustomSlot() },
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.LargeAsset(
            iconResId = R.drawable.list_row_drawable,
            aspectRatio = ListRowIcon.AspectRatio.RATIO_1_1
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.LargeAsset(
            iconResId = R.drawable.list_row_drawable,
            aspectRatio = ListRowIcon.AspectRatio.RATIO_16_9,
            contentScale = ContentScale.Crop
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.LargeAsset(
            iconResId = R.drawable.list_row_drawable,
            aspectRatio = ListRowIcon.AspectRatio.RATIO_7_10
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.LargeAsset(
            iconUrl = IMAGE_URL,
            aspectRatio = ListRowIcon.AspectRatio.RATIO_1_1
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.LargeAsset(
            iconUrl = IMAGE_URL,
            aspectRatio = ListRowIcon.AspectRatio.RATIO_16_9,
            contentScale = ContentScale.Crop
        ),
    ),
    ListItem(
        title = TITLE,
        subtitle = SUBTITLE,
        description = DESCRIPTION,
        action = { Switch(checked = true, onCheckedChange = {}) },
        isBadgeVisible = true,
        badge = "1",
        listRowIcon = ListRowIcon.LargeAsset(
            iconUrl = IMAGE_URL,
            aspectRatio = ListRowIcon.AspectRatio.RATIO_7_10
        ),
    ),
)

const val IMAGE_URL = "https://www.fotoaparat.cz/imgs/a/26/2639/0n1wjdf0-cr-em13-09-1200x627x9.jpg"

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Lists() {
    val samples = samples()
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        items(samples) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                listRowIcon = item.listRowIcon,
                headline = item.headline,
                title = item.title,
                subtitle = item.subtitle,
                description = item.description,
                trailing = item.action,
                onClick = item.onClick,
                bottom = item.bottom,
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
                listRowIcon = item.listRowIcon,
                headline = item.headline,
                title = item.title,
                subtitle = item.subtitle,
                description = item.description,
                trailing = item.action,
                onClick = item.onClick,
                bottom = item.bottom,
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
                listRowIcon = item.listRowIcon,
                headline = item.headline,
                title = item.title,
                subtitle = item.subtitle,
                description = item.description,
                trailing = item.action,
                onClick = item.onClick,
                bottom = item.bottom,
            )
        }
    }
}

data class ListItem(
    val listRowIcon: ListRowIcon? = null,
    val title: String? = null,
    val subtitle: String? = null,
    val description: String? = null,
    val backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    val badge: String? = null,
    val isBadgeVisible: Boolean = false,
    val headline: Tag? = null,
    val action: @Composable (() -> Unit)? = null,
    val onClick: () -> Unit = {},
    val bottom: @Composable (() -> Unit)? = null,
)

@Composable
fun Avatar(url: String) {
    Image(
        painter = rememberAsyncImagePainter(
            ImageRequest.Builder(LocalContext.current)
                .data(url)
                .apply { transformations(CircleCropTransformation()) }
                .build()
        ),
        contentDescription = null,
        modifier = Modifier.size(40.dp)
    )
}

@Composable
private fun CustomSlot() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = MisticaTheme.colors.border,
                shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius)
            )
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius)
            )
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 16.dp, horizontal = 8.dp)
                .align(Alignment.Center),
            text = "Custom Slot"
        )
    }
}
