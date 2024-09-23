package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
        DefaultTitles()
        TitleStyle.entries.forEach {
            Spacer(modifier = Modifier.height(24.dp))
            TitlesWithStyleOverridden(it)
        }
    }
}

@Composable
private fun DefaultTitles() {
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        text = "Short default title",
        isTitleHeading = true,
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        text = "Short default title",
        linkText = "Some link",
        onLinkClicked = {}
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        text = "Some default title that can get really long and almost fill the whole line",
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        text = "Some default title that can get really long and almost fill the whole line",
        linkText = "Some link",
        onLinkClicked = {}
    )
}

@Composable
private fun TitlesWithStyleOverridden(
    style: TitleStyle,
) {
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        text = "Short title $style",
        isTitleHeading = true,
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        text = "Short title $style",
        linkText = "Some link",
        onLinkClicked = {}
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        text = "Some title $style that can get really long and almost fill the whole line",
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        linkText = "Some link",
        text = "Some title $style that can get really long and almost fill the whole line",
        onLinkClicked = {}
    )
    Title(
        modifier = Modifier.padding(bottom = 8.dp),
        style = style,
        linkText = "Some link",
        withChevron = true,
        text = "Some title $style with chevron",
        onLinkClicked = {}
    )
}
