package com.telefonica.mistica.catalog.ui.domain

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

object SelectedComponentTabRepository {
    private val _selectedTab = MutableStateFlow<ComponentTabType?>(null)
    val selectedTab: Flow<ComponentTabType?> = _selectedTab

    fun setSelectedTab(selectedTab: ComponentTabType) {
        _selectedTab.value = selectedTab
    }
}