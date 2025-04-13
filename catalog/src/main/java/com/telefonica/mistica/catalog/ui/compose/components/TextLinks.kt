package com.telefonica.mistica.catalog.ui.compose.components

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.link.MultiLink
import com.telefonica.mistica.compose.link.SingleLink
import com.telefonica.mistica.compose.link.TextLink
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun TextLinks() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextLink(
            originalText = "Single link",
            link = SingleLink {
                Toast.makeText(context, "Link clicked", Toast.LENGTH_SHORT).show()
            }
        )
        TextLink(
            originalText = "Custom color link",
            link = SingleLink {
                Toast.makeText(context, "Link clicked", Toast.LENGTH_SHORT).show()
            },
            linkColor = MisticaTheme.colors.promoHigh,
        )
        TextLink(
            originalText = "Custom style link",
            link = SingleLink {
                Toast.makeText(context, "Link clicked", Toast.LENGTH_SHORT).show()
            },
            textStyle = MisticaTheme.typography.presetTitle3,
        )

        Spacer(modifier = Modifier.size(16.dp))

        TextLink(
            modifier = Modifier.fillMaxWidth(),
            originalText = "This a text showing first link and second link",
            links = listOf(
                MultiLink(linkedText = "first link") {
                    Toast.makeText(context, "First link clicked!", Toast.LENGTH_SHORT).show()
                },
                MultiLink(linkedText = "second link") {
                    Toast.makeText(context, "First link clicked!", Toast.LENGTH_SHORT).show()
                },
            ),
        )

        TextLink(
            modifier = Modifier.fillMaxWidth(),
            originalText = "This a text showing first link and second link with custom colors",
            links = listOf(
                MultiLink(linkedText = "first link") {
                    Toast.makeText(context, "First link clicked!", Toast.LENGTH_SHORT).show()
                },
                MultiLink(linkedText = "second link") {
                    Toast.makeText(context, "First link clicked!", Toast.LENGTH_SHORT).show()
                },
            ),
            linkColor = MisticaTheme.colors.promoHigh,
        )

        TextLink(
            modifier = Modifier.fillMaxWidth(),
            originalText = "This a text showing first link and second link with custom style",
            links = listOf(
                MultiLink(linkedText = "first link") {
                    Toast.makeText(context, "First link clicked!", Toast.LENGTH_SHORT).show()
                },
                MultiLink(linkedText = "second link") {
                    Toast.makeText(context, "First link clicked!", Toast.LENGTH_SHORT).show()
                },
            ),
            textStyle = MisticaTheme.typography.presetTitle3,
        )
    }
}
