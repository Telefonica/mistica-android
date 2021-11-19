# Lists

Lists Items


### Example
```kotlin
MisticaTheme(brand = MovistarBrand) {
        val checkedState = remember { mutableStateOf(true) }
        Column {
            ListRowItem(
                headline = { Chip() },
                isBadgeVisible = true,
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                action = { Chevron() },
            )
            ListRowItem(
                title = "Title",
                isBadgeVisible = true,
                badge = "2",
                subtitle = "Subtitle",
                description = "Description",
                icon = {
                    Icon(
                        painterResource(id = R.drawable.list_row_background),
                        contentDescription = null
                    )
                },
                action = { Chevron() }
            )
            ListRowItem(
                title = "Title",
                subtitle = "Subtitle",
                description = "Description",
                icon = {
                    Circle {
                        Icon(
                            painterResource(id = R.drawable.icn_arrow),
                            contentDescription = null
                        )
                    }
                },
                action = {
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it }
                    )
                }
            )
        }
    }
```
