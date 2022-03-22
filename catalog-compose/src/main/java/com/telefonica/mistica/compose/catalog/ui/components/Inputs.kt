package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.input.EmailInput
import com.telefonica.mistica.compose.input.PhoneInput
import com.telefonica.mistica.compose.input.TextInput
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Inputs() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 8.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Title("Text input")
        TextInputStandard()
        Title("Text input with error")
        TextInputWithError()
        Title("Text Input With Assertive Text that is way too long to fit in the given space")
        TextInputWithHelperText()
        Title("Password input")
        PasswordInput()
        Title("Phone input")
        PhoneInputSample()
        Title("Email input")
        EmailInputSample()
        Title("Email input with validation")
        EmailInputWithValidation()
        Title("Phone input with validation")
        PhoneInputWithValidation()
        Title("Inverse inputs")
        Column(
            modifier = Modifier
                .background(MisticaTheme.colors.backgroundBrand)
                .padding(bottom = 16.dp)
        ) {
            TextInputWithError(isInverse = true)
            TextInputWithHelperText(isInverse = true)
        }
    }
}

@Composable
private fun ColumnScope.Title(text: String) {
    Text(
        modifier = Modifier
            .align(Alignment.Start)
            .padding(start = 16.dp, end = 16.dp)
        ,
        text = text.uppercase(),
        style = MisticaTheme.typography.preset1Medium,
        color = MisticaTheme.colors.textSecondary
    )
}

@Composable
private fun TextInputStandard() {
    var text by remember {
        mutableStateOf("")
    }

    TextInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
        ,
        value = text,
        onValueChange = {
            text = it
        },
        label = "Type Something",
    )
}

@Composable
private fun TextInputWithError(
    isInverse: Boolean = false
) {
    var text by remember {
        mutableStateOf("")
    }

    TextInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
        ,
        value = text,
        onValueChange = {
            text = it
        },
        isError = text.isEmpty(),
        errorText = "With Error!",
        label = "Type Something",
        isInverse = isInverse
    )
}

@Composable
private fun TextInputWithHelperText(
    isInverse: Boolean = false
) {
    var text by remember {
        mutableStateOf("")
    }

    TextInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
        ,
        value = text,
        onValueChange = {
            text = it
        },
        helperText = "This is a helper text",
        label = "Type Something",
        isInverse = isInverse
    )
}

@Composable
private fun PasswordInput() {
    var text by remember {
        mutableStateOf("")
    }

    TextInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
        ,
        value = text,
        onValueChange = {
            text = it
        },
        label = "Type Something"
    )
}

@Composable
private fun PhoneInputSample() {
    var text by remember {
        mutableStateOf("")
    }

    PhoneInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
        ,
        value = text,
        onValueChange = {
            text = it
        },
        label = "Type Something"
    )
}

@Composable
private fun EmailInputSample() {
    var text by remember {
        mutableStateOf("")
    }

    EmailInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
        ,
        value = text,
        onValueChange = {
            text = it
        },
        label = "Type Something"
    )
}

@Composable
private fun ColumnScope.EmailInputWithValidation() {
    var text by remember {
        mutableStateOf("")
    }
    var isError by remember {
        mutableStateOf(false)
    }

    EmailInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
        ,
        value = text,
        onValueChange = {
            if (it.isNotEmpty()) {
                isError = false
            }
            text = it
        },
        isError = isError,
        errorText = "Email invalid",
        label = "Type Something"
    )
    Button(
        modifier = Modifier
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
            .align(Alignment.Start),
        text = "Validate email",
        onClickListener = {
            isError = text.isEmpty()
        },
        buttonStyle = ButtonStyle.PRIMARY_SMALL
    )
}

@Composable
private fun ColumnScope.PhoneInputWithValidation() {
    var text by remember {
        mutableStateOf("")
    }
    var isError by remember {
        mutableStateOf(false)
    }

    PhoneInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp),
        value = text,
        onValueChange = {
            if (it.isNotEmpty()) {
                isError = false
            }
            text = it
        },
        isError = isError,
        errorText = "Phone invalid",
        label = "Type Something"
    )
    Button(
        modifier = Modifier
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
            .align(Alignment.Start),
        text = "Validate phone",
        onClickListener = {
            isError = text.isEmpty()
        },
        buttonStyle = ButtonStyle.PRIMARY_SMALL
    )
}
