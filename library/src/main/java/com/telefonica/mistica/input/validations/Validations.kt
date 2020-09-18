package com.telefonica.mistica.input.validations

import android.util.Patterns

interface TextInputValidation {
    fun isValid(text: String?): TextInputValidationResult
}

sealed class TextInputValidationResult {
    object Success : TextInputValidationResult()
    class Invalid(val invalidMessage: String) : TextInputValidationResult()
}

class EmailTextInputValidation(private val invalidMessage: String) : TextInputValidation {
    override fun isValid(text: String?): TextInputValidationResult =
        if (!text.isNullOrBlank() && Patterns.EMAIL_ADDRESS.matcher(text).matches()) {
            TextInputValidationResult.Success
        } else {
            TextInputValidationResult.Invalid(invalidMessage)
        }

}

class PhoneTextInputValidation(private val invalidMessage: String) : TextInputValidation {
    override fun isValid(text: String?): TextInputValidationResult =
        if (!text.isNullOrBlank() && Patterns.PHONE.matcher(text).matches()) {
            TextInputValidationResult.Success
        } else {
            TextInputValidationResult.Invalid(invalidMessage)
        }

}

class NoValidation() : TextInputValidation {
    override fun isValid(text: String?) = TextInputValidationResult.Success
}