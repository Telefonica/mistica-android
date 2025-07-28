package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.badge.Badge
import com.telefonica.mistica.compose.button.Button

@Composable
fun Badges() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var badgeContent: String? by rememberSaveable { mutableStateOf(null) }
        var show: Boolean by rememberSaveable { mutableStateOf(false) }

        Spacer(modifier = Modifier.height(16.dp))
        BadgedBox(
            badge = {
                if (show) {
                    Badge(content = badgeContent, contentDescription = if ((badgeContent?.length ?: 0) > 1) "+9" else "$badgeContent")
                }
            },
            modifier = Modifier.semantics(mergeDescendants = true) {}
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icn_creditcard),
                contentDescription = "image",
            )
        }
        Button(
            text = "Toggle",
            onClickListener = {
                badgeContent = ""
                show = !show
            }
        )

        Button(
            text = "Show with one digit number",
            onClickListener = {
                show = true
                badgeContent = (0..9).random().toString()
            }
        )

        Button(
            text = "Show with two digit number",
            onClickListener = {
                show = true
                badgeContent = (10..99).random().toString()
            }
        )
    }
}
