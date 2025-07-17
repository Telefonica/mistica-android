package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.telefonica.mistica.compose.input.DropDownInput
import com.telefonica.mistica.compose.popover.PopOver2
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun PopOvers() {

    var title: String by remember { mutableStateOf("Title of the pop over") }
    var subtitle: String by remember { mutableStateOf("Popover long description text") }
    var addImage by remember { mutableStateOf(true) }
    val orientationItems = remember { PopoverPosition.values().map { it.name } }
    var selectedItemIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(MisticaTheme.colors.background)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "POPOVER TESTER",
            style = MisticaTheme.typography.preset1Medium,
            color = MisticaTheme.colors.textSecondary,
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = title,
            onValueChange = { title = it },
            label = { Text("PopOver Title test") }
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = subtitle,
            onValueChange = { subtitle = it },
            label = { Text("PopOver Message text") }
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = addImage, onCheckedChange = { addImage = !addImage })
            Text("Add Image")
        }
        PopOver2(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            imageResource = if (addImage) R.drawable.ic_popovers else null,
            title = title,
            subtitle = subtitle,
        ) {
            Button(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                text = "Test",
                onClickListener = {
                    when (PopoverPosition.getPositionByName(orientationItems[selectedItemIndex])) {
                        PopoverPosition.AUTO -> it.showAlignAuto()
                        PopoverPosition.TOP -> it.showAlignTop()
                        PopoverPosition.BOTTOM -> it.showAlignBottom()
                    }
                }
            )
        }
        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, start = 16.dp, end = 16.dp),
            hint = "Force PopOver position",
            currentItemIndex = selectedItemIndex,
            items = orientationItems,
            onItemSelected = {
                selectedItemIndex = it
            }
        )
    }
}

enum class PopoverPosition {
    AUTO, TOP, BOTTOM;

    companion object {
        fun getPositionByName(name: String) = values().first { it.name == name }
    }
}
