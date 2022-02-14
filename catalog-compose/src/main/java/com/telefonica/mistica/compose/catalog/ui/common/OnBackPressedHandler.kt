package com.telefonica.mistica.compose.catalog.ui.common

import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.platform.LocalLifecycleOwner

@Composable
fun OnBackPressedHandler(
    shouldHandleBack: Boolean,
    onBackPressed: () -> Unit
) {
    val currentOnBack by rememberUpdatedState(newValue = {
        onBackPressed()
    })
    val backCallback = remember {
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                this.remove()
                currentOnBack()
            }
        }
    }
    val backDispatcher = checkNotNull(LocalOnBackPressedDispatcherOwner.current) {
        "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"
    }.onBackPressedDispatcher
    val lifecycleOwner = LocalLifecycleOwner.current

    DisposableEffect(lifecycleOwner, backDispatcher, shouldHandleBack) {
        if (shouldHandleBack) {
            backDispatcher.addCallback(lifecycleOwner, backCallback)
        }
        onDispose {
            backCallback.remove()
        }
    }
}