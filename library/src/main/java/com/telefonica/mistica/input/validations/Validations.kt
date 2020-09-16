package com.telefonica.mistica.input.validations

import android.util.Patterns

interface TextInputValidation {
    fun isValid(text: String?): Boolean
}

object EmailTextInputValidation : TextInputValidation {

    override fun isValid(text: String?): Boolean =
        !text.isNullOrBlank() && Patterns.EMAIL_ADDRESS.matcher(text).matches()

}

object PhoneTextInputValidation : TextInputValidation {

    override fun isValid(text: String?): Boolean =
        !text.isNullOrBlank() && Patterns.PHONE.matcher(text).matches()

}