package com.telefonica.mistica.compose.composeview

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.IntDef
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_BLAU
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_MOVISTAR
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_MOVISTAR_NEW
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_O2_NEW
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_TELEFONICA
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_TU
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView.Companion.BRAND_VALUE_VIVO_NEW
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.MovistarNewBrand
import com.telefonica.mistica.compose.theme.brand.O2NewBrand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.TuBrand
import com.telefonica.mistica.compose.theme.brand.VivoNewBrand

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
        BRAND_VALUE_TELEFONICA,
        BRAND_VALUE_BLAU,
        BRAND_VALUE_O2_NEW,
        BRAND_VALUE_VIVO_NEW,
        BRAND_VALUE_TU,
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
    open fun Theme(body: @Composable () -> Unit) {
        MisticaTheme(brand = calculateBrand()) {
            body()
        }
    }

    private fun calculateBrand(): Brand = MisticaComposeCustomBrand.customBrand ?: brandConfig.mapToComposeBrand()

    companion object {
        const val BRAND_VALUE_MOVISTAR = 0
        const val BRAND_VALUE_TELEFONICA = 1
        const val BRAND_VALUE_BLAU = 2
        const val BRAND_VALUE_O2_NEW = 3
        const val BRAND_VALUE_VIVO_NEW = 4
        const val BRAND_VALUE_TU = 5
        const val BRAND_VALUE_MOVISTAR_NEW = 6
    }
}

fun Int.mapToComposeBrand(): Brand = when (this) {
    BRAND_VALUE_MOVISTAR -> MovistarBrand
    BRAND_VALUE_TELEFONICA -> TelefonicaBrand
    BRAND_VALUE_BLAU -> BlauBrand
    BRAND_VALUE_O2_NEW -> O2NewBrand
    BRAND_VALUE_VIVO_NEW -> VivoNewBrand
    BRAND_VALUE_TU -> TuBrand
    BRAND_VALUE_MOVISTAR_NEW -> MovistarNewBrand
    else -> TelefonicaBrand
}