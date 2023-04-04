package com.telefonica.mistica.compose.input

import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.telefonica.mistica.R

internal const val TOGGLE_VISIBILITY_TEST_TAG = "ToggleVisibility"

@Composable
fun PasswordVisibleIcon(
    passwordVisible: Boolean,
    onIconClicked: (Boolean) -> Unit,
    showContentDescription: String? = null,
    hideContentDescription: String? = null,
) {
    IconToggleButton(
        checked = passwordVisible,
        onCheckedChange = onIconClicked,
        modifier = Modifier.testTag(TOGGLE_VISIBILITY_TEST_TAG),
    ) {
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

@Preview(showBackground = true)
@Composable
fun PreviewPasswordVisibleIconVisible() {
    PasswordVisibleIcon(
        passwordVisible = true,
        onIconClicked = {},
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPasswordVisibleIconInVisible() {
    PasswordVisibleIcon(
        passwordVisible = false,
        onIconClicked = {},
    )
}
