package com.telefonica.mistica.compose.button

import android.widget.AdapterView
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.R
import com.telefonica.mistica.input.DropDownInput

@Composable
fun DropDownInput(
    modifier: Modifier = Modifier,
    items: List<String>,
    currentItemIndex: Int,
    onItemSelected: (Int) -> Unit = {},
    hint: String? = null,
    error: String? = null,
    helperText: String? = null,
    enabled: Boolean = true,
    inverse: Boolean = false,
) {
    var itemsChanged = false
    val rememberedItems = remember(key1 = items) {
        itemsChanged = true
        items
    }

    AndroidView(
        modifier = modifier,
        factory = { context ->
            DropDownInput(context = context).apply {
                dropDown.onItemClickListener =
                    AdapterView.OnItemClickListener { _, _, position, _ ->
                        onItemSelected(position)
                    }
            }
        },
        update = {
            if (itemsChanged) {
                it.dropDown.apply {
                    setAdapter(
                        DropDownInput.Adapter(
                            it.context,
                            R.layout.dropdown_menu_popup_item,
                            rememberedItems
                        )
                    )
                }
            }
            it.dropDown.setText(if (currentItemIndex >= 0) rememberedItems[currentItemIndex] else "")
            it.hint = hint
            it.error = error
            it.helperText = helperText
            it.isEnabled = enabled
            it.setInverse(inverse)
        }
    )
}
