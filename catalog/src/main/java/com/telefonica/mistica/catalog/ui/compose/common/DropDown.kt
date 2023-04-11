package com.telefonica.mistica.catalog.ui.compose.common

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ContentAlpha
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp

@Composable
inline fun <reified T : Enum<T>> DropDown(
    modifier: Modifier,
    selectedValue: T,
    crossinline onValueChanged: (newSelectedValue: T) -> Unit,
) {
    var expanded by remember { mutableStateOf(false) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .clickable { expanded = true }
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.onSurface.copy(
                    alpha = ContentAlpha.disabled
                ),
                shape = MaterialTheme.shapes.small
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .padding(16.dp)
                .weight(8F),
            text = selectedValue.name,
        )
        IconButton(
            modifier = Modifier
                .alpha(ContentAlpha.medium)
                .weight(1.5F),
            onClick = { expanded = true }
        ) {
            Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = null)
        }
        DropdownMenu(
            modifier = Modifier.fillMaxWidth(fraction = 0.94F),
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            enumValues<T>().forEach { value ->
                DropdownMenuItem(
                    onClick = {
                        expanded = false
                        onValueChanged(value)
                    }
                ) {
                    Text(text = value.name)
                }
            }
        }
    }
}