package com.telefonica.mistica.catalog.ui.compose.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.fragment.app.Fragment
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.Brand

@OptIn(ExperimentalComposeUiApi::class)
class ComponentComposeFragment(private val theme: Brand, private val component: @Composable () -> Unit) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return ComposeView(requireContext()).apply {
            setContent {
                MisticaTheme(theme) {
                    Surface(
                        modifier = Modifier.semantics {
                            testTagsAsResourceId = true
                        }
                    ) {
                        component()
                    }
                }
            }
        }
    }
}
