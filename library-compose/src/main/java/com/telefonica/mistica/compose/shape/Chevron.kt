package com.telefonica.mistica.compose.shape

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Chevron(isInverse: Boolean = false) {
    val colorFilter = ColorFilter.tint(color = MisticaTheme.colors.inverse)
    Image(
        painter = painterResource(id = R.drawable.icn_arrow),
        contentDescription = null,
        colorFilter = if (isInverse) colorFilter else null
    )
}
