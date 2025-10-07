package com.telefonica.mistica.compose.badge

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.util.PreviewTheme
import androidx.compose.material.Badge as MaterialBadge

@Composable
fun Badge(
    modifier: Modifier = Modifier,
    textSize: TextUnit = TextUnit.Unspecified,
    content: String? = null,
    contentDescription: String? = null,
) {
    if (content.isNullOrEmpty()) {
        Surface(
            shape = CircleShape,
            color = MisticaTheme.colors.badge,
            modifier = modifier
                .testTag(BadgeTestTags.BADGE)
                .size(8.dp),
        ) { }
    } else {
        MaterialBadge(
            backgroundColor = MisticaTheme.colors.badge,
            modifier = modifier
                .testTag(BadgeTestTags.BADGE_NUMBER)
                .clearAndSetSemantics {
                    contentDescription?.let {
                        this.contentDescription = getBadgeContent(it)
                    }
                },
        ) {
            Text(
                modifier = Modifier.testTag(BadgeTestTags.BADGE_NUMBER_VALUE),
                text = getBadgeContent(content),
                fontSize = textSize,
                color = MisticaTheme.colors.textPrimaryInverse,
            )
        }
    }
}

private fun getBadgeContent(content: String) = if (content.all { it.isDigit() }) {
    if (content.toLong() > 9) {
        "+9"
    } else {
        content
    }
} else {
    content
}

object BadgeTestTags {
    const val BADGE = "badge"
    const val BADGE_NUMBER = "badge_number"
    const val BADGE_NUMBER_VALUE = "badge_number_value"
}

@Preview(showBackground = true)
@Composable
fun BadgePreview() {
    PreviewTheme {
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.padding(16.dp)
        ) {
            Badge(content = "2")
            Spacer(modifier = Modifier.height(8.dp))
            Badge(content = "")
            Spacer(modifier = Modifier.height(8.dp))
            Badge()
        }
    }
}
