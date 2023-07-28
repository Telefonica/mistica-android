package com.telefonica.mistica.compose.title

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
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
        modifier = modifier.testTag(TitleTestTag.TITLE),
    ) {
        TitleText(
            modifier = Modifier
                .weight(1F)
                .alignByBaseline(),
            text = text,
            style = style
        )

        linkText?.let {
            Button(
                modifier = modifier.testTag(TitleTestTag.TITLE_LINK),
                text = text,
                buttonStyle = ButtonStyle.LINK,
                onClickListener = { onLinkClicked?.invoke() }
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
        modifier = modifier.testTag(TitleTestTag.TITLE_TEXT),
        text = if (isAllCaps) text.uppercase() else text,
        style = preset,
        color = textColor
    )
}

enum class TitleStyle {
    TITLE_1,
    TITLE_2
}

object TitleTestTag {
    const val TITLE = "title"
    const val TITLE_TEXT = "title_text"
    const val TITLE_LINK = "title_link"
}
