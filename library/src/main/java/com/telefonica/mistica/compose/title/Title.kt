package com.telefonica.mistica.compose.title

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Title(
    modifier: Modifier = Modifier,
    isTitleHeading: Boolean = false,
    style: TitleStyle = MisticaTheme.values.titleStyle,
    text: String,
    linkText: String? = null,
    withChevron: Boolean = false,
    onLinkClicked: (() -> Unit)? = null,
) {
    Row(
        modifier = modifier,
    ) {
        TitleText(
            modifier = Modifier
                .then(
                    if (isTitleHeading) {
                        Modifier.semantics { heading() }
                    } else {
                        Modifier
                    }
                )
                .weight(1F)
                .alignByBaseline(),
            text = text,
            style = style
        )

        linkText?.let {
            Link(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .alignByBaseline(),
                text = it,
                withChevron = withChevron,
                onClick = onLinkClicked
            )
        }
    }
}

@Composable
private fun TitleText(
    modifier: Modifier,
    text: String,
    style: TitleStyle,
) {
    val preset: TextStyle
    val textColor: Color
    val isAllCaps: Boolean

    when (style) {
        TitleStyle.TITLE_1 -> {
            preset = MisticaTheme.typography.presetTitle1
            textColor = MisticaTheme.colors.textSecondary
            isAllCaps = true
        }

        TitleStyle.TITLE_2 -> {
            preset = MisticaTheme.typography.preset5
            textColor = MisticaTheme.colors.textPrimary
            isAllCaps = false
        }
    }

    Text(
        modifier = modifier,
        text = if (isAllCaps) text.uppercase() else text,
        style = preset,
        color = textColor
    )
}

@Composable
private fun Link(
    modifier: Modifier,
    text: String,
    withChevron: Boolean,
    onClick: (() -> Unit)? = null,
) {
    val linkModifier = if (onClick != null) {
        modifier.then(Modifier.clickable { onClick() })
    } else {
        modifier
    }
    Row(
        modifier = linkModifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = MisticaTheme.typography.presetLink,
            color = MisticaTheme.colors.textLink
        )
        if (withChevron) {
            Image(
                painterResource(id = R.drawable.icn_chevron),
                null,
                modifier = Modifier
                    .padding(start = dimensionResource(id = R.dimen.button_chevron_padding)),
                colorFilter = ColorFilter.tint(MisticaTheme.colors.textLink),
            )
        }
    }
}

enum class TitleStyle {
    TITLE_1,
    TITLE_2
}
