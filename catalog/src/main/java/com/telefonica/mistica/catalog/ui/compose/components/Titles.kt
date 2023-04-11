package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.title.Title
import com.telefonica.mistica.compose.title.TitleStyle

@Composable
fun Titles() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        TitleStyle.values().forEach {
            Titles(it)
        }
    }
}

@Composable
private fun Titles(
    style: TitleStyle
) {
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        text = "Short title",
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        text = "Short title",
        linkText = "Some link",
        onLinkClicked = {}
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        text = "Some title that can get really long and almost fill the whole line",
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        linkText = "Some link",
        text = "Some title that can get really long and almost fill the whole line",
        onLinkClicked = {}
    )
}