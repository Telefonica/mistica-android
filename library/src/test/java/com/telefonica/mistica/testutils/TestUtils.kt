package com.telefonica.mistica.testutils

import androidx.annotation.StyleRes
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2NewBrand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.TuBrand
import com.telefonica.mistica.compose.theme.brand.VivoNewBrand
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
        error("Could not find running test method name")
    }
    fun getAllBrands() = listOf(
        MovistarBrand,
        BlauBrand,
        TelefonicaBrand,
        TuBrand,
        O2NewBrand,
        VivoNewBrand,
    )

    fun ButtonStyle.isInverse() = when(this) {
        ButtonStyle.PRIMARY_INVERSE,
        ButtonStyle.PRIMARY_SMALL_INVERSE,
        ButtonStyle.SECONDARY_INVERSE,
        ButtonStyle.SECONDARY_SMALL_INVERSE,
        ButtonStyle.LINK_INVERSE -> true
        else -> false
    }

    @StyleRes
    fun getBaseThemeForBrand(brand: Brand): Int = when (brand) {
        MovistarBrand -> R.style.MisticaTheme_Movistar
        BlauBrand -> R.style.MisticaTheme_Blau
        TuBrand -> R.style.MisticaTheme_Tu
        TelefonicaBrand -> R.style.MisticaTheme_Telefonica
        O2NewBrand -> R.style.MisticaTheme_O2New
        VivoNewBrand -> R.style.MisticaTheme_VivoNew
        else -> error("No tests defined for brand $this")
    }
}