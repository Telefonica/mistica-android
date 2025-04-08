package com.telefonica.mistica.catalog.ui.compose.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.telefonica.mistica.compose.link.SingleLink
import com.telefonica.mistica.compose.link.TextLink

@Composable
fun TextLinks() {
    val context = LocalContext.current
    TextLink(
        originalText = "Single Link",
        link = SingleLink {
            Toast.makeText(context, "Link clicked", Toast.LENGTH_SHORT).show()
        }
    )
}

