package com.telefonica.mistica.input

import com.telefonica.mistica.input.validations.EmailTextInputValidation
import com.telefonica.mistica.input.validations.PhoneTextInputValidation

fun TextInput.isEmailValid() = isValid(EmailTextInputValidation)

fun TextInput.isPhoneValid() = isValid(PhoneTextInputValidation)