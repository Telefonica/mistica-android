package com.telefonica.mistica.compose.misticaicons.telefonica

import androidx.compose.ui.graphics.vector.ImageVector
import com.telefonica.mistica.compose.misticaicons.TelefonicaGroup
import com.telefonica.mistica.compose.misticaicons.telefonica.filled.AcademicFilled
import kotlin.collections.List as ____KtList

public object FilledGroup

public val TelefonicaGroup.Filled: FilledGroup
    get() = FilledGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FilledGroup.AllIcons: ____KtList<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons = listOf(AcademicFilled)
        return __AllIcons!!
    }
