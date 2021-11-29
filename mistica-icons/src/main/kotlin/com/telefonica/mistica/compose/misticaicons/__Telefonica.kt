package com.telefonica.mistica.compose.misticaicons

import androidx.compose.ui.graphics.vector.ImageVector
import com.telefonica.mistica.compose.MisticaIcons
import com.telefonica.mistica.compose.misticaicons.telefonica.AllIcons
import com.telefonica.mistica.compose.misticaicons.telefonica.Filled
import com.telefonica.mistica.compose.misticaicons.telefonica.Light
import com.telefonica.mistica.compose.misticaicons.telefonica.Regular
import kotlin.collections.List as ____KtList

public object TelefonicaGroup

public val MisticaIcons.Telefonica: TelefonicaGroup
  get() = TelefonicaGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TelefonicaGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Regular.AllIcons + Filled.AllIcons + Light.AllIcons + listOf()
    return __AllIcons!!
  }
