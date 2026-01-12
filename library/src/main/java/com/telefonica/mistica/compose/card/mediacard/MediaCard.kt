package com.telefonica.mistica.compose.card.mediacard

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.Card
import com.telefonica.mistica.compose.card.CardActions
import com.telefonica.mistica.compose.card.CardActionsOrientation
import com.telefonica.mistica.compose.card.CardContent
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage.MediaCardImageBitmap
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage.MediaCardImageResource
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.util.PreviewTheme

private val SIDE_IMAGE_WIDTH = 150.dp

@Composable
public fun MediaCard(
    image: MediaCardImage,
    modifier: Modifier = Modifier,
    tag: Tag? = null,
    preTitle: String? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    primaryButton: Action? = null,
    linkButton: Action? = null,
    imagePosition: MediaCardImagePosition = MediaCardImagePosition.Top,
    imageContentScale: ContentScale = ContentScale.Crop,
    customContent: @Composable () -> Unit = {},
) {
    when (imagePosition) {
        MediaCardImagePosition.Top -> {
            Card(
                modifier = modifier,
                header = {
                    CardImage(
                        mediaCardImage = image,
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = imageContentScale,
                    )
                }
            ) {
                CardContent(tag, preTitle, title, subtitle, description)
                customContent()
                CardActions(primaryButton, linkButton)
            }
        }
        MediaCardImagePosition.Left -> {
            Card(
                modifier = modifier,
                invalidatePaddings = true,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min)
                ) {
                    CardImage(
                        mediaCardImage = image,
                        modifier = Modifier
                            .width(SIDE_IMAGE_WIDTH)
                            .fillMaxHeight(),
                        contentScale = imageContentScale,
                    )
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 24.dp)
                    ) {
                        CardContent(tag, preTitle, title, subtitle, description)
                        customContent()
                        CardActions(primaryButton, linkButton, orientation = CardActionsOrientation.Vertical)
                    }
                }
            }
        }
        MediaCardImagePosition.Right -> {
            Card(
                modifier = modifier,
                invalidatePaddings = true,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min)
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 24.dp)
                    ) {
                        CardContent(tag, preTitle, title, subtitle, description)
                        customContent()
                        CardActions(primaryButton, linkButton, orientation = CardActionsOrientation.Vertical)
                    }
                    CardImage(
                        mediaCardImage = image,
                        modifier = Modifier
                            .width(SIDE_IMAGE_WIDTH)
                            .fillMaxHeight(),
                        contentScale = imageContentScale,
                    )
                }
            }
        }
    }
}

public sealed class MediaCardImage(public val contentDescription: String?) {
    public class MediaCardImageResource(public @DrawableRes val imageRes: Int, contentDescription: String? = null) : MediaCardImage(contentDescription)
    public class MediaCardImageBitmap(public val imageBitmap: ImageBitmap, contentDescription: String? = null) : MediaCardImage(contentDescription)
}

public enum class MediaCardImagePosition {
    Top,
    Left,
    Right
}

@Composable
private fun CardImage(mediaCardImage: MediaCardImage, modifier: Modifier = Modifier, contentScale: ContentScale) {
    when (mediaCardImage) {
        is MediaCardImageBitmap -> Image(
            mediaCardImage.imageBitmap,
            contentDescription = mediaCardImage.contentDescription,
            contentScale = contentScale,
            modifier = modifier,
        )

        is MediaCardImageResource -> Image(
            painterResource(id = mediaCardImage.imageRes),
            contentDescription = mediaCardImage.contentDescription,
            contentScale = contentScale,
            modifier = modifier,
        )
    }
}

@Preview
@Composable
private fun PreviewMediaCardImageTop() {
    PreviewTheme {
        MediaCard(
            image = MediaCardImageResource(R.drawable.mistica_placeholder),
            tag = Tag("HEADLINE").withStyle(TagView.TYPE_PROMO),
            preTitle = "Pretitle",
            title = "Title",
            subtitle = "Subtitle",
            description = "Description",
            primaryButton = Action("Primary") {},
            linkButton = Action("Link") {}
        )
    }
}

@Preview
@Composable
private fun PreviewMediaCardImageLeft() {
    PreviewTheme {
        MediaCard(
            image = MediaCardImageResource(R.drawable.mistica_placeholder),
            tag = Tag("HEADLINE").withStyle(TagView.TYPE_PROMO),
            preTitle = "Pretitle",
            title = "Title",
            subtitle = "Subtitle",
            description = "Description",
            primaryButton = Action("Primary") {},
            linkButton = Action("Link") {},
            imagePosition = MediaCardImagePosition.Left,
        )
    }
}

@Preview
@Composable
private fun PreviewMediaCardImageRight() {
    PreviewTheme {
        MediaCard(
            image = MediaCardImageResource(R.drawable.mistica_placeholder),
            tag = Tag("HEADLINE").withStyle(TagView.TYPE_PROMO),
            preTitle = "Pretitle",
            title = "Title",
            subtitle = "Subtitle",
            description = "Description",
            primaryButton = Action("Primary") {},
            linkButton = Action("Link") {},
            imagePosition = MediaCardImagePosition.Right,
        )
    }
}