package com.telefonica.mistica.compose.stepper

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.stepper.IndeterminateStepperView

@Composable
fun IndeterminateStepper(
    modifier: Modifier = Modifier,
    progress: Int,
) {
    val context = LocalContext.current

    AndroidView(
        modifier = modifier,
        factory = {
            IndeterminateStepperView(context).also {
                it.setProgress(progress, animate = false)
            }
        },
        update = {
            it.setProgress(progress, animate = true)
        }
    )
}
