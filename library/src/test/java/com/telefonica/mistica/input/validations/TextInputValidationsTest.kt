package com.telefonica.mistica.input.validations

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TextInputValidationsTest {

    @Test
    fun `should return Success when validate a valid email`() {
        val emailTextInputValidation = givenAnEmailTextInputValidation()

        val validationResult = emailTextInputValidation.isValid(validEmail)

        assertTrue(validationResult is TextInputValidationResult.Success)
    }

    @Test
    fun `should return Invalid with message when validate an invalid email`() {
        val emailTextInputValidation = givenAnEmailTextInputValidation()

        val validationResult = emailTextInputValidation.isValid(invalidEmail)

        (validationResult as TextInputValidationResult.Invalid).apply {
            assertEquals(invalidMessageEmail, this.invalidMessage)
        }
    }

    @Test
    fun `should return Invalid with message when validate a null email`() {
        val emailTextInputValidation = givenAnEmailTextInputValidation()

        val validationResult = emailTextInputValidation.isValid(null)

        assertTrue(validationResult is TextInputValidationResult.Invalid)
    }

    @Test
    fun `should return Invalid with message when validate an empty email`() {
        val emailTextInputValidation = givenAnEmailTextInputValidation()

        val validationResult = emailTextInputValidation.isValid("")

        assertTrue(validationResult is TextInputValidationResult.Invalid)
    }

    @Test
    fun `should return Success when validate a valid phone`() {
        val phoneTextInputValidation = givenAPhoneTextInputValidation()

        val validationResult = phoneTextInputValidation.isValid(validPhone)

        assertTrue(validationResult is TextInputValidationResult.Success)
    }

    @Test
    fun `should return Invalid with message when validate an invalid phone`() {
        val phoneTextInputValidation = givenAPhoneTextInputValidation()

        val validationResult = phoneTextInputValidation.isValid(invalidPhone)

        (validationResult as TextInputValidationResult.Invalid).apply {
            assertEquals(invalidMessagePhone, this.invalidMessage)
        }
    }

    @Test
    fun `should return Invalid with message when validate a null phone`() {
        val phoneTextInputValidation = givenAPhoneTextInputValidation()

        val validationResult = phoneTextInputValidation.isValid(null)

        assertTrue(validationResult is TextInputValidationResult.Invalid)
    }

    @Test
    fun `should return Invalid with message when validate an empty phone`() {
        val phoneTextInputValidation = givenAPhoneTextInputValidation()

        val validationResult = phoneTextInputValidation.isValid("")

        assertTrue(validationResult is TextInputValidationResult.Invalid)
    }

    @Test
    fun `should return Success when validate with a custom validator a valid String`() {
        val customTextInputValidation = givenACustomTextInputValidation()

        val validationResult = customTextInputValidation.isValid(validReversedText)

        assert(validationResult is TextInputValidationResult.Success)
    }

    @Test
    fun `should return Invalid when validate with a custom validator an invalid String`() {
        val customTextInputValidation = givenACustomTextInputValidation()

        val validationResult = customTextInputValidation.isValid(invalidReversedText)

        (validationResult as TextInputValidationResult.Invalid).apply {
            assertEquals(invalidReversedTextMessage, this.invalidMessage)
        }
    }

    @Test
    fun `should return Invalid when validate with a custom validator a null String`() {
        val customTextInputValidation = givenACustomTextInputValidation()

        val validationResult = customTextInputValidation.isValid(null)

        assertTrue(validationResult is TextInputValidationResult.Invalid)
    }

    @Test
    fun `should return Invalid when validate with a custom validator an empty String`() {
        val customTextInputValidation = givenACustomTextInputValidation()

        val validationResult = customTextInputValidation.isValid("")

        assertTrue(validationResult is TextInputValidationResult.Invalid)
    }

    private fun givenAnEmailTextInputValidation() = EmailTextInputValidation(invalidMessageEmail)

    private fun givenAPhoneTextInputValidation() = PhoneTextInputValidation(invalidMessagePhone)

    private fun givenACustomTextInputValidation(): TextInputValidation =
        object : TextInputValidation {
            override fun isValid(text: String?): TextInputValidationResult =
                if (text?.equals(text.reversed()) == true && !text.isNullOrEmpty()) {
                    TextInputValidationResult.Success
                } else {
                    TextInputValidationResult.Invalid(invalidReversedTextMessage)
                }
        }

    companion object {
        const val invalidMessageEmail = "Invalid email"
        const val invalidMessagePhone = "Invalid phone"
        const val validEmail = "email@telefonica.com"
        const val invalidEmail = "email.telefonica.com"
        const val validPhone = "666666666"
        const val invalidPhone = "66"
        const val invalidReversedTextMessage = "Invalid palindrome"
        const val validReversedText = "qwertyuiopoiuytrewq"
        const val invalidReversedText = "qwertyuiopqwertyuiop"
    }

}