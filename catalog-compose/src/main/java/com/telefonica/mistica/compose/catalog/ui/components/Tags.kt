package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.tag.TagView

@ExperimentalFoundationApi
@Composable
fun Tags() {
    val customText = remember { mutableStateOf(TextFieldValue("Promotion")) }

    Column(
        modifier = Modifier.padding(vertical = 32.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Surface(
                color = MisticaTheme.colors.brand,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Tag(text = "Inverse", style = TagView.TYPE_INVERSE, modifier = Modifier.padding(8.dp))
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.padding(16.dp)
            ) {
                item { Tag(text = "Promotion", style = TagView.TYPE_PROMO, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Active", style = TagView.TYPE_ACTIVE, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Inactive", style = TagView.TYPE_INACTIVE, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Success", style = TagView.TYPE_SUCCESS, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Warning", style = TagView.TYPE_WARNING, modifier = Modifier.padding(4.dp)) }
                item { Tag(text = "Error", style = TagView.TYPE_ERROR, modifier = Modifier.padding(4.dp)) }
            }
            Surface(
                color = MisticaTheme.colors.brand,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .height(60.dp)
            ) {
                Tag(text = "Inverse", style = TagView.TYPE_INVERSE, modifier = Modifier.padding(8.dp), icon = android.R.drawable.ic_lock_power_off)
            }
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.padding(16.dp)
            ) {
                item { Tag(text = "Promotion", style = TagView.TYPE_PROMO, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Active", style = TagView.TYPE_ACTIVE, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Inactive", style = TagView.TYPE_INACTIVE, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Success", style = TagView.TYPE_SUCCESS, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Warning", style = TagView.TYPE_WARNING, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
                item { Tag(text = "Error", style = TagView.TYPE_ERROR, modifier = Modifier.padding(4.dp), icon = android.R.drawable.ic_lock_power_off) }
            }
        }

        Divider(thickness = 2.dp)

        Tag(text = customText.value.text, style = TagView.TYPE_PROMO, modifier = Modifier.padding(top = 16.dp))
        Tag(text = customText.value.text, style = TagView.TYPE_PROMO, modifier = Modifier.padding(top = 8.dp), icon = android.R.drawable.ic_lock_power_off)

        Surface(
            color = MisticaTheme.colors.brand,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
                .height(96.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Tag(text = customText.value.text, style = TagView.TYPE_INVERSE)
                Tag(text = customText.value.text, style = TagView.TYPE_INVERSE, modifier = Modifier.padding(top = 8.dp), icon = android.R.drawable
                    .ic_lock_power_off)
            }
        }

        TextField(
            value = customText.value,
            onValueChange = { customText.value = it },
            label = { Text(text = "Type something...") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = MisticaTheme.colors.backgroundContainer),
        )
    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun TagPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Column(
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .background(MisticaTheme.colors.backgroundContainer),
        ) {
            Tags()
        }
    }
}
