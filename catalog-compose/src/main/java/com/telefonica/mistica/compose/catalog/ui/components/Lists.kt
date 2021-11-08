package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.list.Icon
import com.telefonica.mistica.compose.list.ListRowItem
import com.telefonica.mistica.compose.list.ResourceImage

@Composable
fun Lists() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        ListRowItem(
            leftImage = ResourceImage(painterResource(id = R.drawable.card_view_background)),
            title = "Test",
        )
        ListRowItem(
            leftImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = true),
            title = "Test",
        )
        ListRowItem(
            leftImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false),
            title = "Test",
        )
    }
}