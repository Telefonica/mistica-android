package com.telefonica.mistica.compose.misticaicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.telefonica.mistica.compose.MisticaIcons
import com.telefonica.mistica.compose.misticaicons.o2.AllIcons
import com.telefonica.mistica.compose.misticaicons.o2.Filled
import com.telefonica.mistica.compose.misticaicons.o2.Light
import com.telefonica.mistica.compose.misticaicons.o2.Regular
import kotlin.collections.List as ____KtList

public object O2Group

public val MisticaIcons.O2: O2Group
  get() = O2Group

private var __AllIcons: ____KtList<ImageVector>? = null

public val O2Group.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Regular.AllIcons + Filled.AllIcons + Light.AllIcons + listOf()
    return __AllIcons!!
  }
