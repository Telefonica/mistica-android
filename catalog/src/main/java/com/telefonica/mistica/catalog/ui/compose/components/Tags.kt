package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.tag.TagColors
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.util.PreviewTheme

private const val TAG_CUSTOM_COLOR_BACKGROUND = 0xFF00CAB3
private const val TAG_CUSTOM_COLOR_TEXT = 0XFFFFFFFF

@Composable
fun Tags() {
    val customText = remember { mutableStateOf(TextFieldValue("Promotion")) }

    Column(
        modifier = Modifier.padding(vertical = 32.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.padding(16.dp)
            ) {
                item { Tag(text = "Promotion", style = TagView.TYPE_PROMO, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Info", style = TagView.TYPE_INFO, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Active", style = TagView.TYPE_ACTIVE, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Inactive", style = TagView.TYPE_INACTIVE, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Success", style = TagView.TYPE_SUCCESS, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Warning", style = TagView.TYPE_WARNING, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Error", style = TagView.TYPE_ERROR, modifier = Modifier.padding(4.dp)) }
                item {
                    Tag(
                        text = "Custom",
                        style = TagView.TYPE_ERROR,
                        customColors =
                            TagColors(
                                backgroundColor = Color(TAG_CUSTOM_COLOR_BACKGROUND),
                                textColor = Color(TAG_CUSTOM_COLOR_TEXT),
                            ),
                        modifier = Modifier
                            .padding(4.dp)
                    )
                }
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.padding(16.dp)
            ) {
                item { Tag(text = "Promotion", style = TagView.TYPE_PROMO, modifier = Modifier.padding(4.dp), icon = R.drawable.icn_cross) }
                item { Tag(text = "Info", style = TagView.TYPE_INFO, modifier = Modifier.padding(4.dp), icon = R.drawable.icn_cross) }
                item { Tag(text = "Active", style = TagView.TYPE_ACTIVE, modifier = Modifier.padding(4.dp), icon = R.drawable.icn_cross) }
                item { Tag(text = "Inactive", style = TagView.TYPE_INACTIVE, modifier = Modifier.padding(4.dp), icon = R.drawable.icn_cross) }
                item { Tag(text = "Success", style = TagView.TYPE_SUCCESS, modifier = Modifier.padding(4.dp), icon = R.drawable.icn_cross) }
                item { Tag(text = "Warning", style = TagView.TYPE_WARNING, modifier = Modifier.padding(4.dp), icon = R.drawable.icn_cross) }
                item { Tag(text = "Error", style = TagView.TYPE_ERROR, modifier = Modifier.padding(4.dp), icon = R.drawable.icn_cross) }
                item {
                    Tag(
                        text = "Custom",
                        style = TagView.TYPE_ERROR,
                        customColors =
                            TagColors(
                                backgroundColor = Color(TAG_CUSTOM_COLOR_BACKGROUND),
                                textColor = Color.White,
                            ),
                        modifier = Modifier
                            .padding(4.dp),
                        icon = R.drawable.icn_cross,
                    )
                }
            }
        }

        Divider(thickness = 2.dp)

        Tag(text = customText.value.text, style = TagView.TYPE_PROMO, modifier = Modifier.padding(top = 16.dp))
        Tag(text = customText.value.text, style = TagView.TYPE_PROMO, modifier = Modifier.padding(top = 8.dp), icon = R.drawable.icn_cross)

        TextField(
            value = customText.value,
            onValueChange = { customText.value = it },
            label = { Text(text = "Type something...") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = MisticaTheme.colors.backgroundContainer),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TagPreview() {
    PreviewTheme {
        Column(
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .background(MisticaTheme.colors.backgroundContainer),
        ) {
            Tags()
        }
    }
}
