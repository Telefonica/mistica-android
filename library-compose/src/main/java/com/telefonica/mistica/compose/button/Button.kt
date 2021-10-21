package com.telefonica.mistica.compose.button

import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.button.Button

@Composable
fun Button(
    buttonText: String = "",
    buttonIcon: Drawable? = null,
    style: Int? = null,
    onClickListener: () -> Unit = {},
) {
    AndroidView(
        modifier = Modifier.wrapContentSize(),
        factory = { context ->
            val button = if (style != null) {
                Button(context, null, style)
            } else {
                Button(context)
            }
            button.apply {
                text = buttonText
                icon = buttonIcon
                setOnClickListener { onClickListener() }
            }
        },
        update = { view -> view }
    )
}