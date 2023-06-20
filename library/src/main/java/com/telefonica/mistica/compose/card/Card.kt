package com.telefonica.mistica.compose.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Card(
    modifier: Modifier = Modifier,
    header: @Composable () -> Unit = {},
    content: @Composable () -> Unit = {},
) {

    androidx.compose.material.Card(
        backgroundColor = MisticaTheme.colors.backgroundContainer,
        modifier = modifier
            .focusable()
            .widthIn(min = 184.dp),
        elevation = 0.dp,
        shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius),
        border = BorderStroke(width = 1.dp, color = MisticaTheme.colors.border)
    ) {
        Column {
            header()
            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 24.dp,
                ),
            ) {
                content()
            }
        }
    }
}

@Composable
internal fun CardActions(primaryButton: Action?, linkButton: Action?) {
    if (primaryButton != null || linkButton != null) {
        Row(
            modifier = Modifier
                .padding(top = 16.dp)
                .width(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,

            ) {
            primaryButton?.let {
                Button(
                    text = it.text,
                    onClickListener = it.onTapped,
                    buttonStyle = ButtonStyle.PRIMARY_SMALL,
                )
            }
            linkButton?.let {
                Button(
                    modifier = if (primaryButton == null) Modifier.offset(x = (-8).dp) else Modifier,
                    text = it.text,
                    onClickListener = it.onTapped,
                    buttonStyle = ButtonStyle.LINK,
                )
            }
        }
    }
}

@Composable
internal fun CardContent(
    tag: Tag?,
    preTitle: String?,
    title: String?,
    subtitle: String?,
    description: String?,
) {
    Column {
        if (tag != null) {
            Box(modifier = Modifier
                .padding(top = 8.dp, bottom = 8.dp)
            ) {
                tag.build()
            }
        }

        preTitle?.let {
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = preTitle,
                style = MisticaTheme.typography.preset1,
                color = MisticaTheme.colors.highlight
            )
        }

        title?.let {
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = title,
                style = MisticaTheme.typography.presetCardTitle,
            )
        }
        subtitle?.let {
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = subtitle,
                style = MisticaTheme.typography.preset2,
            )
        }
        description?.let {
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = description,
                style = MisticaTheme.typography.preset2,
                color = MisticaTheme.colors.textSecondary,
            )
        }
    }
}

data class Action(
    val text: String,
    val onTapped: () -> Unit,
)
