package com.telefonica.mistica.catalog.ui.compose.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.ui.viewmodel.ComponentComposeViewModel
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.Brand

class ComponentComposeFragment(private val theme: Brand, private val component: @Composable (isVisible: Boolean) -> Unit) : Fragment() {

    private val viewModel = ComponentComposeViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return ComposeView(requireContext()).apply {
            setContent {
                MisticaTheme(theme) {
                    val isVisible by viewModel.isComposeComponentSelected.collectAsState(initial = false)
                    component(isVisible)
                }
            }
        }
    }
}