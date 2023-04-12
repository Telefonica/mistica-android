package com.telefonica.mistica.compose.title

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Title(
    modifier: Modifier = Modifier,
    style: TitleStyle = MisticaTheme.values.titleStyle,
    text: String,
    linkText: String? = null,
    onLinkClicked: (() -> Unit)? = null,
) {
    Row(
        modifier = modifier,
    ) {
        TitleText(
            modifier = Modifier
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
            preset = MisticaTheme.typography.preset1
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
    onClick: (() -> Unit)? = null,
) {
    val linkModifier = if (onClick != null) {
        modifier.then(Modifier.clickable { onClick() })
    } else {
        modifier
    }

    Text(
        modifier = linkModifier,
        text = text,
        style = MisticaTheme.typography.preset2Medium,
        color = MisticaTheme.colors.textLink
    )
}

enum class TitleStyle {
    TITLE_1,
    TITLE_2
}
