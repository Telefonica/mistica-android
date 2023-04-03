package com.telefonica.mistica.compose.input

import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.telefonica.mistica.R

@Composable
fun PasswordVisibleIcon(
    passwordVisible: Boolean,
    onIconClicked: (Boolean) -> Unit,
    showContentDescription: String? = null,
    hideContentDescription: String? = null,
) {
    IconToggleButton(checked = passwordVisible, onCheckedChange = onIconClicked) {
        Icon(
            painter = if (passwordVisible) {
                painterResource(id = R.drawable.icn_visibility_off)
            } else {
                painterResource(id = R.drawable.icn_visibility)
            },
            contentDescription = if (passwordVisible) hideContentDescription else showContentDescription,
        )
    }
}