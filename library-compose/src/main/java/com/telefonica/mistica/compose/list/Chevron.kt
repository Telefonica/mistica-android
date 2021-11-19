package com.telefonica.mistica.compose.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

@Composable
fun Chevron(isInverse: Boolean = false) {
    Box(
        modifier = Modifier
            .wrapContentHeight(align = Alignment.CenterVertically)
    ) {
        val colorFilter = ColorFilter.tint(color = MisticaTheme.colors.inverse)
        Image(
            painter = painterResource(id = R.drawable.icn_arrow),
            contentDescription = null,
            colorFilter = if (isInverse) colorFilter else null
        )
    }
}
