package com.telefonica.mistica.input.validations

import java.util.regex.Pattern

interface TextInputValidation {
    fun isValid(text: String?): TextInputValidationResult
}

sealed class TextInputValidationResult {
    object Success : TextInputValidationResult()
    class Invalid(val invalidMessage: String) : TextInputValidationResult()
}

class EmailTextInputValidation(private val invalidMessage: String) : TextInputValidation {
    override fun isValid(text: String?): TextInputValidationResult =
        if (!text.isNullOrBlank() && emailPattern.matcher(text).matches()) {
            TextInputValidationResult.Success
        } else {
            TextInputValidationResult.Invalid(invalidMessage)
        }
}

class PhoneTextInputValidation(private val invalidMessage: String) : TextInputValidation {
    override fun isValid(text: String?): TextInputValidationResult =
        if (!text.isNullOrBlank() && phonePattern.matcher(text).matches()) {
            TextInputValidationResult.Success
        } else {
            TextInputValidationResult.Invalid(invalidMessage)
        }

}

class NoValidation : TextInputValidation {
    override fun isValid(text: String?) = TextInputValidationResult.Success
}

private val emailPattern = Pattern.compile(
    """[a-zA-Z0-9\+\.\_\%\-\+]{1,256}\@[a-zA-Z0-9][a-zA-Z0-9\-]{0,64}(\.[a-zA-Z0-9][a-zA-Z0-9\-]{0,25})+"""
)

private val phonePattern: Pattern = Pattern.compile(
    """(\+[0-9]+[\- \.]*)?(\([0-9]+\)[\- \.]*)?([0-9][0-9\- \.]+[0-9])"""
)