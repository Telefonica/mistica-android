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