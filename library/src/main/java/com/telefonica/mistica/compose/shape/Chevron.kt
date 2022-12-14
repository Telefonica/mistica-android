package com.telefonica.mistica.compose.shape

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Chevron(isInverse: Boolean = false) {
    val colorFilter = ColorFilter.tint(color = MisticaTheme.colors.inverse)
    Image(
        modifier = Modifier.testTag(ChevronTestTags.CHEVRON),
        painter = painterResource(id = R.drawable.icn_arrow),
        contentDescription = null,
        colorFilter = if (isInverse) colorFilter else null
    )
}

object ChevronTestTags {
    const val CHEVRON = "chevron"
}
