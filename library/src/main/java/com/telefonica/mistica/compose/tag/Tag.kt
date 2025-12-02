package com.telefonica.mistica.compose.tag

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.tag.TagStyle
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ERROR
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INFO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_SUCCESS
import com.telefonica.mistica.tag.TagView.Companion.TYPE_WARNING
import com.telefonica.mistica.util.PreviewTheme

@Composable
fun Tag(
    text: String,
    modifier: Modifier = Modifier,
    @TagStyle style: Int = TYPE_PROMO,
    customColors: TagColors? = null,
    @DrawableRes icon: Int? = null,
) {
    val (background, textColor) = if (customColors == null) style.getStyle()
    else customColors.backgroundColor to customColors.textColor

    Surface(
        modifier = modifier
            .wrapContentSize()
            .defaultMinSize(minWidth = 48.dp)
            .height(42.dp),
        shape = RoundedCornerShape(MisticaTheme.radius.tagBorderRadius),
        color = background,
    ) {
        Row(
            modifier = Modifier
                .testTag(TagTestTags.TAG)
                .padding(start = if (icon != null) 8.dp else 12.dp, end = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            if (icon != null) {
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    colorFilter = ColorFilter.tint(textColor),
                    contentScale = ContentScale.Fit
                )
            }

            Text(
                text = text,
                modifier = Modifier
                    .testTag(TagTestTags.TAG_TEXT)
                    .padding(start = if (icon != null) 4.dp else 0.dp),
                style = MisticaTheme.typography.presetIndicator,
                color = textColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

object TagTestTags {
    const val TAG = "tag"
    const val TAG_TEXT = "tag_text"
}

class Tag(
    private val content: String,
) {
    private var modifier: Modifier = Modifier

    @TagStyle
    private var style: Int = TYPE_PROMO

    @DrawableRes
    private var icon: Int? = null

    private var customColors: TagColors? = null

    fun withModifier(modifier: Modifier) = apply { this.modifier = this.modifier.then(modifier) }
    fun withStyle(@TagStyle style: Int) = apply { this.style = style }
    fun withIcon(@DrawableRes icon: Int?) = apply { this.icon = icon }
    fun withCustomColors(customColors: TagColors?) = apply { this.customColors = customColors }

    @SuppressLint("ComposableNaming")
    @Composable
    fun build() {
        Tag(text = content, modifier = modifier, style = style, icon = icon, customColors = customColors)
    }
}

@Preview(showBackground = true)
@Composable
internal fun TagPreview() {
    PreviewTheme {
        Column(
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .background(MisticaTheme.colors.backgroundContainer),
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.padding(16.dp)
            ) {
                item { Tag(text = "Promotion", style = TYPE_PROMO, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Info", style = TYPE_INFO, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Active", style = TYPE_ACTIVE, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Inactive", style = TYPE_INACTIVE, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Success", style = TYPE_SUCCESS, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Warning", style = TYPE_WARNING, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Error", style = TYPE_ERROR, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
            }
        }
    }
}

@Composable
@Suppress("CyclomaticComplexMethod")
private fun Int.getStyle() = when (this) {
    TYPE_PROMO -> with(MisticaTheme.colors) { tagBackgroundPromo to tagTextPromo }
    TYPE_INFO -> with(MisticaTheme.colors) { tagBackgroundInfo to tagTextInfo }
    TYPE_ACTIVE -> with(MisticaTheme.colors) { tagBackgroundActive to tagTextActive }
    TYPE_INACTIVE -> with(MisticaTheme.colors) { tagBackgroundInactive to tagTextInactive }
    TYPE_SUCCESS -> with(MisticaTheme.colors) { tagBackgroundSuccess to tagTextSuccess }
    TYPE_WARNING -> with(MisticaTheme.colors) { tagBackgroundWarning to tagTextWarning }
    TYPE_ERROR -> with(MisticaTheme.colors) { tagBackgroundError to tagTextError }
    else -> with(MisticaTheme.colors) { tagBackgroundPromo to tagTextPromo }
}
