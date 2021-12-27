package com.telefonica.mistica.compose.card.datacard

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.Card
import com.telefonica.mistica.compose.card.CardActions
import com.telefonica.mistica.compose.card.CardContent
import com.telefonica.mistica.compose.shape.Circle
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.tag.TagView

@Composable
fun DataCard(
    modifier: Modifier = Modifier,
    @DrawableRes iconRes: Int? = null,
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
    ) {
        CardIcon(iconRes)
        CardContent(tag, preTitle, title, subtitle, description)
        customContent()
        CardActions(primaryButton, linkButton)
    }
}

@Composable
private fun CardIcon(iconRes: Int?) {
    iconRes?.let {
        Box(
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
        ) {
        Circle {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        }
    }
}


@Preview
@Composable
fun CardPreview() {
    MisticaTheme(brand = MovistarBrand) {
        DataCard(
            iconRes = R.drawable.bg_list_image,
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