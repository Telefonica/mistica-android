package com.telefonica.mistica.compose.tag

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand

@Composable
fun Tag(
    content: String,
    modifier: Modifier = Modifier,
    color: Color = MisticaTheme.colors.badge,
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(4.dp),
        color = color,
    ) {
        Text(
            text = content.uppercase(),
            style = MisticaTheme.typography.preset1Medium,
            color = Color.White,
            modifier = Modifier.padding(
                horizontal = 8.dp,
            ),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TagPreview() {
    MisticaTheme(brand = TelefonicaBrand) {
        Column {
            Box(
                modifier = Modifier
                    .size(150.dp, 100.dp)
                    .background(MisticaTheme.colors.backgroundContainer),
            ) {
                Tag(
                    content = "new",
                    color = MisticaTheme.colors.promo,
                    modifier = Modifier
                        .padding(8.dp)
                        .shadow(
                            elevation = 2.dp,
                            shape = RoundedCornerShape(4.dp)
                        ),
                )
            }
        }
    }
}
