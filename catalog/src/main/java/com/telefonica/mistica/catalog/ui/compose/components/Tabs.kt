package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.tabs.Tab
import com.telefonica.mistica.compose.tabs.Tabs
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun TabsCatalog() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(MisticaTheme.colors.background),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        var currentIndex by remember { mutableStateOf(0) }
        var tabs by remember {
            mutableStateOf(
                listOf(
                    Tab("Tab1"),
                    Tab("Tab2"),
                    Tab("Tab3"),
                )
            )
        }

        Tabs(
            modifier = Modifier
                .padding(bottom = 16.dp),
            selectedIndex = currentIndex,
            tabs = tabs,
            onSelectedTabChanged = {
                currentIndex = it
            }
        )

        tabs.forEachIndexed { index, tab ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .weight(1F),
                    value = tab.text,
                    onValueChange = { text ->
                        tabs = tabs.toMutableList().also {
                            it[index] = tab.copy(
                                text = text
                            )
                        }
                    },
                    label = { Text("Tab Text") }
                )
                Checkbox(
                    checked = tab.iconResource != null,
                    onCheckedChange = { enabled ->
                        val iconResource: Int? = if (enabled) {
                            R.drawable.ic_tab
                        } else {
                            null
                        }
                        tabs = tabs.toMutableList().also {
                            it[index] = tab.copy(
                                iconResource = iconResource
                            )
                        }
                    }
                )
                Text("Icon")
            }
        }

        Button(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            text = "Add new tab",
            onClickListener = {
                tabs = tabs.toMutableList().also {
                    it.add(Tab("New Tab"))
                }
            }
        )

        Button(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            text = "Remove last tab",
            onClickListener = {
                if (tabs.size > 1) {
                    tabs = tabs.toMutableList().apply {
                        removeAt(lastIndex)
                    }
                    if (currentIndex >= tabs.size) {
                        currentIndex = tabs.size - 1
                    }
                }
            }
        )
    }
}

