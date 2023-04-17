package com.telefonica.mistica.catalog.ui.compose.components

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.input.CheckBoxInput
import com.telefonica.mistica.compose.input.DropDownInput
import com.telefonica.mistica.compose.input.EmailInput
import com.telefonica.mistica.compose.input.LimitCharacters
import com.telefonica.mistica.compose.input.PasswordInput
import com.telefonica.mistica.compose.input.PhoneInput
import com.telefonica.mistica.compose.input.TextAreaInput
import com.telefonica.mistica.compose.input.TextInput
import com.telefonica.mistica.compose.input.TextLink
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
        Title("Empty disabled Text input")
        TextInputStandard(enabled = false)
        Title("Disabled Text input with content")
        TextInputStandard(enabled = false, initialText = "Something")
        Title("Text input with error")
        TextInputWithError()
        Title("Text Input With Assertive Text that is way too long to fit in the given space")
        TextInputWithHelperText()
        Title("Text input with transformation")
        TextInputWithTransformation()
        Title("Password input")
        PasswordInputSample()
        Title("Phone input")
        PhoneInputSample()
        Title("Email input")
        EmailInputSample()
        Title("Email input with validation")
        EmailInputWithValidation()
        Title("Phone input with validation")
        PhoneInputWithValidation()
        Title("Text Area input")
        TextAreaInputSample()
        Title("Check Box input")
        CheckBoxInputSample()
        Title("Dropdown")
        DropDownSample()
        Title("Disable Dropdown")
        DropDownSample(enabled = false)
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
private fun TextInputStandard(
    enabled: Boolean = true,
    initialText: String = "",
) {
    var text by remember {
        mutableStateOf(initialText)
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
        enabled = enabled,
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
private fun PasswordInputSample() {
    var text by remember {
        mutableStateOf("")
    }

    PasswordInput(
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
private fun TextInputWithTransformation() {
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
        label = "Your name",
        visualTransformation = PhoneVisualTransformation
    )
}

object PhoneVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val newText = AnnotatedString("$PREFIX$text")
        return TransformedText(newText, object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int =
                offset + PREFIX_LENGTH

            override fun transformedToOriginal(offset: Int): Int =
                offset - PREFIX_LENGTH
        })
    }

    private const val PREFIX = "Hola,  "
    private const val PREFIX_LENGTH = PREFIX.length
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

@Composable
fun TextAreaInputSample() {
    var text by remember {
        mutableStateOf("")
    }

    TextAreaInput(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp),
        value = text,
        onValueChange = {
            text = it
        },
        label = "Type Something",
        helperText = "Helper Text",
        maxChars = LimitCharacters.Limited(200),
    )
}

@Composable
fun CheckBoxInputSample() {
    val message =
        "I have read and agree to the promotion's Legal Grounds and Privacy Policy legal warning. (Tap on links to show error)."
    var errorText by remember { mutableStateOf("") }
    val links = listOf(
        TextLink(
            link = "Legal Grounds",
            onLinkTapped = { errorText = "Error Text! Tapped on Legal Grounds" },
        ),
        TextLink(
            link = "Privacy Policy",
            onLinkTapped = { errorText = "Error Text! Tapped on Privacy Policy" },
        ),
    )
    var checked by remember { mutableStateOf(false) }
    CheckBoxInput(
        checked = checked,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp),
        text = message,
        errorText = errorText,
        links = links,
        onCheckedChange = { checked = !checked },
    )
}

@Composable
private fun DropDownSample(enabled: Boolean = true) {
    val items = remember {
        listOf("Item 1", "Item 2", "Item 3")
    }
    var selectedItemIndex by remember {
        mutableStateOf<Int?>(null)
    }
    DropDownInput(
        modifier = Modifier.fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp),
        hint = "Select something",
        currentItemIndex = selectedItemIndex,
        items = items,
        onItemSelected = {
            selectedItemIndex = it
        },
        enabled = enabled
    )
}