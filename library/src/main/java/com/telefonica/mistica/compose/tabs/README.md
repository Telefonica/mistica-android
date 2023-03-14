# Tabs

Tabs component is provided through a single composable function that allows setting current selected index, tabs content and allows listening for current 
selected tab changes.

## Available parameters

```kotlin
@Composable
@UiComposable
fun Tabs(
    modifier: Modifier = Modifier,
    selectedIndex: Int,
    tabs: List<Tab>,
    onSelectedTabChanged: (index: Int) -> Unit,
)
```

## Tab content

```kotlin
data class Tab(
    val text: String,
    @DrawableRes val iconResource: Int? = null,
    val iconContentDescription: String? = null,
)
```

## Example

```kotlin
fun TabsExample() {
    var currentIndex by remember { mutableStateOf(0) }
    var tabs by remember {
        mutableStateOf(
            listOf(
                Tab("Tab1"),
                Tab("Tab2"),
                Tab("Tab3"),
            )
        )
    }
    Tabs(
        selectedIndex = currentIndex,
        tabs = tabs,
        onSelectedTabChanged = { currentIndex = it }
    )
}
```