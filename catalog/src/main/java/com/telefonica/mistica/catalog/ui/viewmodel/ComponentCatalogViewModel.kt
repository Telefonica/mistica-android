package com.telefonica.mistica.catalog.ui.viewmodel

import com.telefonica.mistica.catalog.ui.domain.ComponentTabType
import com.telefonica.mistica.catalog.ui.domain.SetSelectedComponentTab

class ComponentCatalogViewModel {
    private val setSelectedComponentTab = SetSelectedComponentTab()

    fun onTabChanged(selectedTab: ComponentTabType) {
        setSelectedComponentTab(selectedTab)
    }
}
