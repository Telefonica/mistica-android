package com.telefonica.mistica.compose.misticaicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.telefonica.mistica.compose.MisticaIcons
import com.telefonica.mistica.compose.misticaicons.blau.AllIcons
import com.telefonica.mistica.compose.misticaicons.blau.Regular
import kotlin.collections.List as ____KtList

public object BlauGroup

public val MisticaIcons.Blau: BlauGroup
  get() = BlauGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BlauGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Regular.AllIcons + listOf()
    return __AllIcons!!
  }
