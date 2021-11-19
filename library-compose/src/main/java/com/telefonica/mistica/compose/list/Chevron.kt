package com.telefonica.mistica.compose.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.telefonica.mistica.compose.R

@Composable
fun Chevron() {
    Box(
        modifier = Modifier.wrapContentHeight(align = Alignment.CenterVertically)
    ) {
        Image(
            painter = painterResource(id = R.drawable.icn_arrow),
            contentDescription = null,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ChevronPreview() {
    Chevron()
}
