package com.telefonica.mistica.compose.list

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.tag.Tag

@Composable
fun ListRowItemWithSwitch(
    modifier: Modifier = Modifier,
    listRowIcon: ListRowIcon? = null,
    title: String? = null,
    isTitleHeading: Boolean = false,
    subtitle: String? = null,
    description: String? = null,
    backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    badge: String? = null,
    isBadgeVisible: Boolean = false,
    headline: Tag? = null,
    checked: Boolean = false,
    onCheckedChange: (Boolean) -> Unit,
    bottom: @Composable (() -> Unit)? = null,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
) {
    ListRowItemImp(
        modifier = modifier.toggleable(
            value = checked,
            onValueChange = { onCheckedChange(!checked)},
            role = Role.Switch,
        ),
        icon = { listRowIcon?.Draw() },
        title = title,
        isTitleHeading = isTitleHeading,
        subtitle = subtitle,
        description = description,
        backgroundType = backgroundType,
        badge = badge,
        isBadgeVisible = isBadgeVisible,
        isToggleable = true,
        headline = headline,
        trailing = {
            Switch(
                checked = checked,
                onCheckedChange = null,
            )
        },
        onClick = null,
        bottom = bottom,
        contentPadding = contentPadding
    )
}
