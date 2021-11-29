package com.telefonica.mistica.compose.misticaicons.telefonica

import androidx.compose.ui.graphics.vector.ImageVector
import com.telefonica.mistica.compose.misticaicons.TelefonicaGroup
import com.telefonica.mistica.compose.misticaicons.telefonica.regular.AcademicRegular
import kotlin.collections.List as ____KtList

public object RegularGroup

public val TelefonicaGroup.Regular: RegularGroup
    get() = RegularGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val RegularGroup.AllIcons: ____KtList<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons = listOf(AcademicRegular)
        return __AllIcons!!
    }
