package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.list.BackgroundType
import com.telefonica.mistica.compose.list.Chevron
import com.telefonica.mistica.compose.list.Chip
import com.telefonica.mistica.compose.list.Icon
import com.telefonica.mistica.compose.list.ListRowItem

@ExperimentalMaterialApi
@Composable
fun Lists() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        items(1) {
            ListRowItem(
                title = "Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title Title ",
                subtitle = "Subtitle",
                description = "Description",
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = true)
            )
            ListRowItem(
                headline = { Chip() },
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                action = {
                    Button(
                        onClick = { }) {
                        Text("hola")
                    }
                },
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false)
            )
            ListRowItem(
                headline = { Chip() },
                backgroundType = BackgroundType.TYPE_BOXED,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                action = { Chevron() },
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false)
            )
            ListRowItem(
                headline = { Chip() },
                backgroundType = BackgroundType.TYPE_BOXED_INVERSE,
                badge = "2",
                isBadgeVisible = true,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                action = { Chevron() },
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false)
            )
            ListRowItem(
                headline = { Chip() },
                badge = "",
                isBadgeVisible = true,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                action = { Chevron() },
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false)
            )
            ListRowItem(
                headline = { Chip() },
                badge = "0",
                isBadgeVisible = true,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                action = { Chevron() },
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false)
            )
            ListRowItem(
                headline = { Chip() },
                badge = "2",
                isBadgeVisible = false,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                action = { Chevron() },
                rowImage = Icon(painterResource(id = R.drawable.icn_arrow), withBackground = false)
            )
        }
    }
}