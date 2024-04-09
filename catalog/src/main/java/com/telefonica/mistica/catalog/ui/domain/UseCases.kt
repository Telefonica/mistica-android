package com.telefonica.mistica.catalog.ui.domain

import kotlinx.coroutines.flow.Flow

class GetSelectedComponentTab {
    operator fun invoke(): Flow<ComponentTabType?> =
        SelectedComponentTabRepository.selectedTab
}

class SetSelectedComponentTab {
    operator fun invoke(selectedTab: ComponentTabType) {
        SelectedComponentTabRepository.setSelectedTab(selectedTab)
    }
}
