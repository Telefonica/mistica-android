package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.feedback.LoadErrorFeedback
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun LoadErrorFeedbacks() {

    var showFeedback by remember { mutableStateOf(false) }

    var title: String by remember { mutableStateOf("Title") }
    var description: String by remember { mutableStateOf("Something went wrong, this is the description of the failure. Try to retry if you want.") }
    var buttonText: String by remember { mutableStateOf("Reload!") }
    var buttonLoadingText: String by remember { mutableStateOf("Loading") }

    var isLoading by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            modifier = Modifier.padding(horizontal = 50.dp),
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") }
        )
        OutlinedTextField(
            modifier = Modifier.padding(horizontal = 50.dp),
            value = description,
            onValueChange = { description = it },
            label = { Text("Description") }
        )
        OutlinedTextField(
            modifier = Modifier.padding(horizontal = 50.dp),
            value = buttonText,
            onValueChange = { buttonText = it },
            label = { Text("Button Text") }
        )
        OutlinedTextField(
            modifier = Modifier.padding(horizontal = 50.dp),
            value = buttonLoadingText,
            onValueChange = { buttonLoadingText = it },
            label = { Text("Button Loading Text") }
        )
        Button(text = "Show feedback", onClickListener = { showFeedback = true })

        Spacer(modifier = Modifier.width(16.dp))

        if (showFeedback) {
            val scope = rememberCoroutineScope()

            LoadErrorFeedback(
                titleText = title,
                descriptionText = description,
                isLoading = isLoading,
                buttonText = buttonText,
                buttonLoadingText = buttonLoadingText
            ) {
                isLoading = true
                scope.launch {
                    delay(1000)
                    MainScope().launch { isLoading = false }
                }
            }
        }
    }

}
