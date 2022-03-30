package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.stepper.IndeterminateStepper

@Composable
fun Steppers() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scrollState)
    ) {
        IndeterminateStepper(
            modifier = Modifier.fillMaxWidth(),
            progress = 0
        )
        IndeterminateStepper(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            progress = 50
        )
        IndeterminateStepperDemo(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
        )
    }
}

@Composable
private fun IndeterminateStepperDemo(modifier: Modifier) {
    var progress by remember {
        mutableStateOf(0)
    }

    Column(modifier = modifier) {
        IndeterminateStepper(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            progress = progress
        )
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(
                text = "Previous",
                onClickListener = {
                    if (progress - STEPPER_DEMO_PROGRESS_INTERVAL >= 0) {
                        progress -= STEPPER_DEMO_PROGRESS_INTERVAL
                    }
                }
            )
            Button(
                text = "Next",
                onClickListener = {
                    if (progress + STEPPER_DEMO_PROGRESS_INTERVAL <= 100) {
                        progress += STEPPER_DEMO_PROGRESS_INTERVAL
                    }
                }
            )
        }
    }
}

const val STEPPER_DEMO_PROGRESS_INTERVAL = 20