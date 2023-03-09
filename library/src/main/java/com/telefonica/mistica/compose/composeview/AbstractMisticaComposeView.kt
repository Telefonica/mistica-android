package com.telefonica.mistica.compose.composeview

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.IntDef
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_BLAU
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_MOVISTAR
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_O2
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_TELEFONICA
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_VIVO
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand

abstract class AbstractMisticaComposeView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    val brand: Brand = TelefonicaBrand,
) : AbstractComposeView(
    context,
    attrs,
    defStyleAttr,
) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        BRAND_VALUE_MOVISTAR,
        BRAND_VALUE_O2,
        BRAND_VALUE_VIVO,
        BRAND_VALUE_TELEFONICA,
        BRAND_VALUE_BLAU,
    )
    annotation class BrandConfig

    @BrandConfig
    private var brandConfig: Int = BRAND_VALUE_TELEFONICA

    init {
        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(attrs, R.styleable.AbstractMisticaComposeView, defStyleAttr, 0)
            brandConfig = styledAttrs.getInteger(R.styleable.AbstractMisticaComposeView_composeBrand, brandConfig)
        }
    }

    @Composable
    open fun Theme(brand: Brand = calculateBrand(), body: @Composable () -> Unit) {
        MisticaTheme(brand) {
            body()
        }
    }

    private fun calculateBrand(): Brand = MisticaComposeCustomBrand.customBrand ?: brandConfig.mapToComposeBrand()

    companion object {
        const val BRAND_VALUE_MOVISTAR = 0
        const val BRAND_VALUE_O2 = 1
        const val BRAND_VALUE_VIVO = 3
        const val BRAND_VALUE_TELEFONICA = 4
        const val BRAND_VALUE_BLAU = 5
    }
}

fun Int.mapToComposeBrand(): Brand = when (this) {
    BRAND_VALUE_MOVISTAR -> MovistarBrand
    BRAND_VALUE_O2 -> O2Brand
    BRAND_VALUE_VIVO -> VivoBrand
    BRAND_VALUE_TELEFONICA -> TelefonicaBrand
    BRAND_VALUE_BLAU -> BlauBrand
    else -> TelefonicaBrand
}