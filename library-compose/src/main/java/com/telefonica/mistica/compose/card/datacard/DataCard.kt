package com.telefonica.mistica.compose.card.datacard

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.Card
import com.telefonica.mistica.compose.card.CardActions
import com.telefonica.mistica.compose.card.CardContent
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.tag.TagView

@Composable
fun DataCard(
    modifier: Modifier = Modifier,
    iconPainter: IconPainter = IconPainter.NoIconPainter,
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
        iconPainter.Paint()
        CardContent(tag, preTitle, title, subtitle, description)
        customContent()
        CardActions(primaryButton, linkButton)
    }
}

@Preview
@Composable
fun CardPreview() {
    MisticaTheme(brand = MovistarBrand) {
        DataCard(
            iconPainter = resourceIconPainter(R.drawable.bg_list_image),
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

