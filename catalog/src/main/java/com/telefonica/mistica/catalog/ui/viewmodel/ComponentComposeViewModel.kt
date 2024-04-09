package com.telefonica.mistica.catalog.ui.viewmodel

import com.telefonica.mistica.catalog.ui.domain.ComponentTabType
import com.telefonica.mistica.catalog.ui.domain.GetSelectedComponentTab
import kotlinx.coroutines.flow.map

class ComponentComposeViewModel {
    private val getSelectedComponentTab = GetSelectedComponentTab()
    val isComposeComponentSelected = getSelectedComponentTab().map { it == ComponentTabType.COMPOSE }
}
