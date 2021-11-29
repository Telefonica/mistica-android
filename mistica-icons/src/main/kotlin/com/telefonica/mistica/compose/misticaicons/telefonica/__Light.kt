package com.telefonica.mistica.compose.misticaicons.telefonica

import androidx.compose.ui.graphics.vector.ImageVector
import com.telefonica.mistica.compose.misticaicons.TelefonicaGroup
import com.telefonica.mistica.compose.misticaicons.telefonica.light.AcademicLight
import kotlin.collections.List as ____KtList

public object LightGroup

public val TelefonicaGroup.Light: LightGroup
    get() = LightGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LightGroup.AllIcons: ____KtList<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons = listOf(AcademicLight)
        return __AllIcons!!
    }
