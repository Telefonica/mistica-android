package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Checkbox
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
import com.telefonica.mistica.compose.feedback.Feedback
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Feedbacks(

) {

    val retryDelay = 2000L
    var showFeedback by remember { mutableStateOf(false) }

    var title: String by remember { mutableStateOf("") }
    var subtitle: String by remember { mutableStateOf("") }
    var errorReference: String by remember { mutableStateOf("") }
    var firstButtonText: String? by remember { mutableStateOf(null) }
    var firstButtonLoadingText: String? by remember { mutableStateOf(null) }
    var secondButtonText: String? by remember { mutableStateOf(null) }
    var showFirstButtonLoading: Boolean by remember { mutableStateOf(false) }
    var isFirstButtonLoading: Boolean by remember { mutableStateOf(false) }
    var type: Int by remember { mutableStateOf(FeedbackScreenView.TYPE_INFO) }
    val coroutineScope = rememberCoroutineScope()

    if (showFeedback) {
        Feedback(
            type = type,
            title = title,
            subtitle = subtitle,
            errorReference = errorReference,
            firstButtonText = firstButtonText,
            firstButtonLoadingText = firstButtonLoadingText,
            secondButtonText = secondButtonText,
            firstButtonOnClick = {
                if (showFirstButtonLoading) {
                    isFirstButtonLoading = true
                    coroutineScope.launch {
                        delay(retryDelay)
                        isFirstButtonLoading = false
                    }
                }
            },
            secondButtonOnClick = {},
            isFirstButtonLoading = isFirstButtonLoading,
            onBackPressed = { showFeedback = false }
        )
    } else {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedTextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
            OutlinedTextField(value = subtitle, onValueChange = { subtitle = it }, label = { Text("Subtitle") })
            OutlinedTextField(value = errorReference, onValueChange = { errorReference = it }, label = { Text("Error Reference") })
            OutlinedTextField(value = firstButtonText ?: "", onValueChange = { firstButtonText = it }, label = { Text("First Button") })
            OutlinedTextField(value = firstButtonLoadingText ?: "", onValueChange = { firstButtonLoadingText = it }, label = { Text("First Button Loading") })
            OutlinedTextField(value = secondButtonText ?: "", onValueChange = { secondButtonText = it }, label = { Text("Second Button") })
            Row {
                Text("First button loading")
                Checkbox(checked = showFirstButtonLoading, onCheckedChange = { showFirstButtonLoading = it })
            }
            Row {
                Text("Info")
                Checkbox(checked = type == FeedbackScreenView.TYPE_INFO, onCheckedChange = { type = FeedbackScreenView.TYPE_INFO })
                Text("Success")
                Checkbox(checked = type == FeedbackScreenView.TYPE_SUCCESS, onCheckedChange = { type = FeedbackScreenView.TYPE_SUCCESS })
                Text("Error")
                Checkbox(checked = type == FeedbackScreenView.TYPE_ERROR, onCheckedChange = { type = FeedbackScreenView.TYPE_ERROR })
            }
            Button(
                text = "Show feedback",
                onClickListener = { showFeedback = true }
            )
        }
    }
}