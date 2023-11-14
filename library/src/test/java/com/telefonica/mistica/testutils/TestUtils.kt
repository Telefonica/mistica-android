package com.telefonica.mistica.testutils

import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import org.junit.Test

object TestUtils {
    fun findRunningTestMethodName(): String {
        val stackTrace = Thread.currentThread().stackTrace
        for (element in stackTrace) {
            val methodName = element.methodName
            val className = element.className
            val testClass = Class.forName(className)
            val methods = testClass.declaredMethods
            for (method in methods) {
                if (method.name == methodName && method.isAnnotationPresent(Test::class.java)) {
                    return methodName.replace(
                        oldValue = " ",
                        newValue = "_"
                    )
                }
            }
        }
        throw IllegalStateException("Could not find running test method name")
    }
    fun getAllBrands() = listOf(
        MovistarBrand,
        VivoBrand,
        O2Brand,
        BlauBrand,
        TelefonicaBrand,
    )

    fun getAllButtonStyles() = listOf(
        ButtonStyle.PRIMARY, ButtonStyle.PRIMARY_SMALL, ButtonStyle.SECONDARY, ButtonStyle.SECONDARY_SMALL, ButtonStyle.DANGER,
        ButtonStyle.DANGER_SMALL, ButtonStyle.LINK, ButtonStyle.PRIMARY_INVERSE, ButtonStyle.PRIMARY_SMALL_INVERSE, ButtonStyle.SECONDARY_INVERSE,
        ButtonStyle.SECONDARY_SMALL_INVERSE, ButtonStyle.LINK_INVERSE
    )

    fun ButtonStyle.isInverse() = when(this) {
        ButtonStyle.PRIMARY_INVERSE,
        ButtonStyle.PRIMARY_SMALL_INVERSE,
        ButtonStyle.SECONDARY_INVERSE,
        ButtonStyle.SECONDARY_SMALL_INVERSE,
        ButtonStyle.LINK_INVERSE -> true
        else -> false
    }
}