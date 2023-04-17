package com.telefonica.mistica.compose.tag

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.tag.TagStyle
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ERROR
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INVERSE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_SUCCESS
import com.telefonica.mistica.tag.TagView.Companion.TYPE_WARNING

@Composable
fun Tag(
    text: String,
    modifier: Modifier = Modifier,
    @TagStyle style: Int = TYPE_PROMO,
    @DrawableRes icon: Int? = null,
) {
    val (background, textColor) = style.getStyle()

    Surface(
        modifier = modifier
            .wrapContentSize()
            .defaultMinSize(minWidth = 48.dp)
            .height(28.dp),
        shape = RoundedCornerShape(50.dp),
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
                style = MisticaTheme.typography.preset2Medium,
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

class Tag constructor(
    private val content: String,
) {
    private var modifier: Modifier = Modifier

    @TagStyle
    private var style: Int = TYPE_PROMO

    @DrawableRes
    private var icon: Int? = null

    fun withModifier(modifier: Modifier) = apply { this.modifier = this.modifier.then(modifier) }
    fun withStyle(@TagStyle style: Int) = apply { this.style = style }
    fun withIcon(@DrawableRes icon: Int?) = apply { this.icon = icon }

    @SuppressLint("ComposableNaming")
    @Composable
    fun build() {
        Tag(text = content, modifier = modifier, style = style, icon = icon)
    }
}

@Preview(showBackground = true)
@Composable
internal fun TagPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Column(
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .background(MisticaTheme.colors.backgroundContainer),
        ) {
            Surface(
                color = MisticaTheme.colors.brand,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Tag(text = "Inverse", style = TYPE_INVERSE, modifier = Modifier.padding(8.dp), icon = android.R.drawable.ic_lock_power_off)
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.padding(16.dp)
            ) {
                item { Tag(text = "Promotion", style = TYPE_PROMO, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
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
private fun Int.getStyle() = when (this) {
    TYPE_PROMO -> with(MisticaTheme.colors) { promoLow to promoHigh }
    TYPE_ACTIVE -> with(MisticaTheme.colors) { brandLow to brand }
    TYPE_INACTIVE -> with(MisticaTheme.colors) { neutralLow to neutralMedium }
    TYPE_SUCCESS -> with(MisticaTheme.colors) { successLow to successHigh }
    TYPE_WARNING -> with(MisticaTheme.colors) { warningLow to warningHigh }
    TYPE_ERROR -> with(MisticaTheme.colors) { errorLow to errorHigh }
    TYPE_INVERSE -> with(MisticaTheme.colors) { inverse to brand }
    else -> with(MisticaTheme.colors) { promoLow to promoHigh }
}
