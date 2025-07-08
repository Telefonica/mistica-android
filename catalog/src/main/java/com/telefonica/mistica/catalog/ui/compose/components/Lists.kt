package com.telefonica.mistica.catalog.ui.compose.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.list.BackgroundType
import com.telefonica.mistica.compose.list.ListRowIcon
import com.telefonica.mistica.compose.list.ListRowItem
import com.telefonica.mistica.compose.list.ListRowItemWithCheckBox
import com.telefonica.mistica.compose.list.ListRowItemWithSwitch
import com.telefonica.mistica.compose.shape.Chevron
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO

const val TITLE = "Title"
const val SUBTITLE = "Subtitle"
const val DESCRIPTION = "Description"

@Composable
fun samples(): List<ListItem> {
    val context = LocalContext.current

    return listOf(
        ListItem(
            title = TITLE,
            isTitleHeading = true,
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            isBadgeVisible = true,
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            isBadgeVisible = true,
            badge = "1",
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            isTitleHeading = true,
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            action = { Chevron() },
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            action = { Chevron() },
            bottom = { CustomSlot() },
            onClick = sampleClickHandler(context)
        ),

        ListItem(
            title = TITLE,
            listRowIcon = ListRowIcon.CircleIcon(painterResource(id = R.drawable.ic_lists)),
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            listRowIcon = ListRowIcon.CircleIcon(painterResource(id = R.drawable.ic_lists)),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            isBadgeVisible = true,
            listRowIcon = ListRowIcon.CircleIcon(painterResource(id = R.drawable.ic_lists)),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            isBadgeVisible = true,
            badge = "1",
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            action = { Chevron() },
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            bottom = { CustomSlot() },
        ),

        ListItem(
            title = TITLE,
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            isBadgeVisible = true,
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            action = { Chevron() },
            isBadgeVisible = true,
            badge = "1",
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            action = { Chevron() },
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            title = TITLE,
            subtitle = SUBTITLE,
            action = { Chevron() },
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            bottom = { CustomSlot() },
            onClick = sampleClickHandler(context)
        ),

        ListItem(
            headline = Tag(content = "PROMO").withStyle(TYPE_PROMO),
            title = TITLE,
            subtitle = SUBTITLE,
            action = { Chevron() },
            listRowIcon = ListRowIcon.CircleIcon(
                painterResource(id = R.drawable.ic_lists),
                backgroundColor = MisticaTheme.colors.backgroundAlternative
            ),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            headline = Tag("PROMO").withStyle(TYPE_PROMO),
            title = TITLE,
            subtitle = SUBTITLE,
            description = DESCRIPTION,
            action = { Chevron() },
            isBadgeVisible = true,
            badge = "1",
            listRowIcon = ListRowIcon.SmallAsset(painter = painterResource(id = R.drawable.list_row_drawable)),
            onClick = sampleClickHandler(context)
        ),
        ListItem(
            headline = Tag("PROMO").withStyle(TYPE_PROMO),
            title = TITLE,
            subtitle = SUBTITLE,
            description = DESCRIPTION,
            action = { Avatar(IMAGE_URL) },
            isBadgeVisible = true,
            badge = "1",
            listRowIcon = ListRowIcon.SmallAsset(painter = painterResource(id = R.drawable.list_row_drawable)),
        ),
    )
}

private fun sampleClickHandler(context: Context): () -> Unit {
    return { Toast.makeText(context, "Click!", Toast.LENGTH_SHORT).show() }
}

const val IMAGE_URL = "https://www.fotoaparat.cz/imgs/a/26/2639/0n1wjdf0-cr-em13-09-1200x627x9.jpg"

@Composable
fun Lists() {
    val samples = samples()
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        item {
            SectionTitle("Full Width List")
        }
        items(samples) { item ->
            ListRowItem(
                backgroundType = item.backgroundType,
                badge = item.badge,
                isBadgeVisible = item.isBadgeVisible,
                listRowIcon = item.listRowIcon,
                headline = item.headline,
                title = item.title,
                isTitleHeading = item.isTitleHeading,
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
        item {
            SectionTitle("Boxed List")
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
        item {
            SectionTitle("Boxed Inverse List")
        }
        items(samples.map {
            it.copy(
                backgroundType = BackgroundType.TYPE_BOXED_INVERSE,
                action = { if (it.onClick != null) Chevron(isInverse = true) },
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
        item {
            SectionTitle("Clickable Asset")
            ClickableAssetSample(
                context = context,
                onRowClick = {},
            )
            ClickableAssetSample(
                context = context,
                onRowClick = { Toast.makeText(context, "Row Clicked", Toast.LENGTH_SHORT).show() },
            )
        }
        item {
            SectionTitle("Toggleables")
            var switchState by remember { mutableStateOf(false) }
            ListRowItemWithSwitch(
                title = "Title",
                subtitle = "Subtitle",
                checked = switchState,
                onCheckedChange = { switchState = it },
                listRowIcon = ListRowIcon.NormalIcon(painter = painterResource(id = R.drawable.ic_lists)),
            )
            var checkBoxState by remember { mutableStateOf(false) }
            ListRowItemWithCheckBox(
                title = "Title",
                subtitle = "Subtitle",
                checked = checkBoxState,
                onCheckedChange = { checkBoxState = it },
                listRowIcon = ListRowIcon.NormalIcon(painter = painterResource(id = R.drawable.ic_lists)),
            )
        }
    }
}

data class ListItem(
    val listRowIcon: ListRowIcon? = null,
    val title: String? = null,
    val isTitleHeading: Boolean = false,
    val subtitle: String? = null,
    val description: String? = null,
    val backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    val badge: String? = null,
    val isBadgeVisible: Boolean = false,
    val headline: Tag? = null,
    val action: @Composable (() -> Unit)? = null,
    val onClick: (() -> Unit)? = null,
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
        contentDescription = "Image content description",
        modifier = Modifier.size(40.dp)
    )
}

@Composable
private fun SectionTitle(title: String) {
    Text(
        text = title.uppercase(),
        style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        modifier = Modifier.padding(16.dp)
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
            .semantics { contentDescription = "Custom slot content description" },
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 16.dp, horizontal = 8.dp)
                .align(Alignment.Center),
            text = "Custom Slot"
        )
    }
}

@Composable
private fun ClickableAssetSample(context: Context, onRowClick: () -> Unit) {
    ListRowItem(
        title = "Clickable Asset in Clickable Row",
        subtitle = "Subtitle",
        description = "Description",
        isBadgeVisible = true,
        badge = "1",
        onClick = onRowClick,
        listRowIcon = ListRowIcon.CircleIcon(
            painterResource(id = R.drawable.ic_lists),
            backgroundColor = MisticaTheme.colors.backgroundAlternative,
            modifier = Modifier.clickable {
                Toast.makeText(context, "Asset Clicked", Toast.LENGTH_SHORT).show()
            }
        ),
    )
}
