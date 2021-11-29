package com.telefonica.mistica.compose

import androidx.compose.ui.graphics.vector.ImageVector
import com.telefonica.mistica.compose.misticaicons.AllIcons
import com.telefonica.mistica.compose.misticaicons.Blau
import com.telefonica.mistica.compose.misticaicons.O2
import com.telefonica.mistica.compose.misticaicons.Telefonica
import kotlin.collections.List as ____KtList

public object MisticaIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val MisticaIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= O2.AllIcons + Blau.AllIcons + Telefonica.AllIcons + listOf()
    return __AllIcons!!
  }
