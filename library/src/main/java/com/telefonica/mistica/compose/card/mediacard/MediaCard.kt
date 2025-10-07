package com.telefonica.mistica.compose.card.mediacard

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.Card
import com.telefonica.mistica.compose.card.CardActions
import com.telefonica.mistica.compose.card.CardContent
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage.MediaCardImageBitmap
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage.MediaCardImageResource
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.util.PreviewTheme

@Composable
fun MediaCard(
    image: MediaCardImage,
    modifier: Modifier = Modifier,
    tag: Tag? = null,
    preTitle: String? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    primaryButton: Action? = null,
    linkButton: Action? = null,
    customContent: @Composable () -> Unit = {},
) {
    Card(
        modifier = modifier,
        header = { CardImage(image) }
    ) {
        CardContent(tag, preTitle, title, subtitle, description)
        customContent()
        CardActions(primaryButton, linkButton)
    }
}

sealed class MediaCardImage(val contentDescription: String?) {
    class MediaCardImageResource(@DrawableRes val imageRes: Int, contentDescription: String? = null) : MediaCardImage(contentDescription)
    class MediaCardImageBitmap(val imageBitmap: ImageBitmap, contentDescription: String? = null) : MediaCardImage(contentDescription)
}

@Composable
private fun CardImage(mediaCardImage: MediaCardImage) {
    when (mediaCardImage) {
        is MediaCardImageBitmap -> Image(
            mediaCardImage.imageBitmap,
            contentDescription = mediaCardImage.contentDescription,
            contentScale = ContentScale.FillHeight
        )

        is MediaCardImageResource -> Image(
            painterResource(id = mediaCardImage.imageRes),
            contentDescription = mediaCardImage.contentDescription,
            contentScale = ContentScale.FillHeight
        )
    }
}

@Preview
@Composable
fun CardPreview() {
    PreviewTheme {
        MediaCard(
            image = MediaCardImageResource(R.drawable.bg_list_image),
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