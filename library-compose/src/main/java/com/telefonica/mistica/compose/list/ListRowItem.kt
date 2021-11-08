package com.telefonica.mistica.compose.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

@Composable
fun ListRowItem(
    leftImage: LeftImage? = null,
    title: String,
    subtitle: String? = null,
    description: String? = null,
) {
    Row(
        modifier = Modifier.padding(16.dp)
    ) {
        LeftImageComposable(leftImage)

        Column {
            Text(
                text = title,
//                modifier = Modifier.
            )
        }

    }
}

@Composable
private fun LeftImageComposable(image: LeftImage?) {
    if (image != null) {
        when (image) {
            is Icon -> {
                Image(
                    painter = image.painter,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .let {
                            if (image.withBackground) {
                                it.background(MisticaTheme.colors.neutralLow, shape = CircleShape)
                            } else {
                                it
                            }
                        }
                )
            }
            is ResourceImage -> {
                Image(
                    painter = image.painter,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
            }
        }

        Spacer(modifier = Modifier.width(16.dp))
    }

}

@Preview
@Composable
fun ListRowItemPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Column {
//            ListRowItem(
//                leftImage = ResourceImage(painterResource(id = R.drawable.icn_arrow))
//            )
//            ListRowItem(
//                leftImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = true)
//            )
//            ListRowItem(
//                leftImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false)
//            )
        }
    }
}

sealed class LeftImage(val painter: Painter)

class ResourceImage(painter: Painter) : LeftImage(painter)
class Icon(painter: Painter, val withBackground: Boolean) : LeftImage(painter)