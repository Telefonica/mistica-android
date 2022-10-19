# Sheet

Bottom sheets are surfaces containing supplementary content that are anchored to the bottom of the screen.

<p align="center">
    <img width="25%" src="../../../../../../../../doc/images/bottom_sheet/bottom_sheet.gif">
</p>

To use it, use `com.telefonica.mistica.sheet.Sheet`

```kotlin
Sheet(context)
    .withHeader(
        title = "Title",
        subtitle = "Subtitle",
        description = "Description",
    )
    .withList(
        id = "list-0",
        elements = listOf()
    )
    .withOnSheetTappedListener(object: OnSheetTapped {
        override fun onTapped(sheet: SheetView,  childrenId: String, itemId: String) {
            Toast
                .makeText(context, "Onclicked: [Children: $childrenId, item:$itemId]", Toast.LENGTH_SHORT)
                .show()
            MainScope().launch {
                delay(500)
                bottomSheet.dismiss()
            }
        }
    })
    .withOnCancelListener {
        Toast
            .makeText(context, "onCancel", Toast.LENGTH_SHORT)
            .show()
    }
    .withOnDismissListener {
        Toast
            .makeText(context, "onDismiss", Toast.LENGTH_SHORT)
            .show()
    }
    .show()
```

There are different sheet components:

## Selection
A list of selectable row items:
```kotlin
mutableListOf(
    RowSelectable(
        id = "0",
        title = "Title",
        asset = getIcon(),
        description = getDescription(),
        selected = true,
    )
)
```

## Informative
A list of description items with a title, a description and an icon that can be a bullet, small or bigger icon:
```kotlin
mutableListOf(
    RowInformative(
        id = "0",
        title = "Title",
        description = getDescription(),
        icon = getInformativeIcon(),
    )
)
```

## Action
A list of different actions with a name, an icon (optional) and a style (regular or destructive)
```kotlin
mutableListOf(
    RowAction(
        id = "0",
        title = "Title",
        asset = getActionIcon()
    )
)
```