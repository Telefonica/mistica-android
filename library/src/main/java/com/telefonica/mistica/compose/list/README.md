# Lists  
`ListRowItems` are a continuous group of text or images. They are composed of items containing primary and supplemental actions, which are represented by icons and text.
This component is designed to be used inside lists, that in Compose are built using `Column` or `LazyColumn`.

```kotlin 
@Composable  
fun ListRowItem(
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    backgroundType: BackgroundType = BackgroundType.TYPE_NORMAL,
    badge: String? = null,  
    isBadgeVisible: Boolean = false,  
    headline: @Composable (() -> Unit)? = null,  
    trailing: @Composable (() -> Unit)? = null,  
    onClick: () -> Unit = {},
)
```
## Structure
The general structure is divided in 3 zones as described in the following picture:

![image](https://user-images.githubusercontent.com/944814/143044758-3443c06b-e25a-4658-88ba-5201b87790d1.png)

- Section A is dedicated to show a `@Composable` in the left side of the component.
- Section B is dedicated to show `title`, `subtitle` or `description` parameters. It's possible to add a `headline` appearing above the `title`.
- Section C is dedicated to show extra content in the right side of the row, in this zone you could show an inline `badge` or add any `@Composable` with the parameter `action`.

## Types
This component has 3 general types: normal, boxed and boxed-inverse; it could be changed with the `backgroundType` parameter:
```kotlin
enum class BackgroundType {  
    TYPE_NORMAL,  
    TYPE_BOXED,  
    TYPE_BOXED_INVERSE,  
}
```
![image](https://user-images.githubusercontent.com/944814/143042336-6d013705-5176-466f-8e95-31358958fdfd.png)

Following the order in the image, the types are: normal, boxed and boxed-inverse. Take into account that `normal` is full width.

## Icon
Image to be showed at the first section of list row.
There are 4 types of icons:
- `NormalIcon`: it's a normal icon, it should be a `Drawable` with a `description` parameter.
- `CircleIcon`: it's a circle icon, it should be a `Drawable` with a `description` parameter. It's possible to define the `backgroundColor` of the circle.
- `SmallAsset`: it's a circle icon, it could be a `Drawable` resource or a external url with a `description` parameter inside.
- `LargeAsset`: it's a custom image, it could be a `Drawable` resource or a external url with a `description` parameter inside. It's possible to define the
  `aspectRatio` of the image and the `contentScale` type
- `ImageAsset`: it's a custom image, it could be a `Drawable` resource or a external url with a `description` parameter inside. It's possible to define the
  `dimensions` which is of type `ImageDimensions`.

![image](https://user-images.githubusercontent.com/944814/143047368-3494885c-6324-4b4b-bcc0-4177525208bf.png)


```kotlin
  ListRowItem(
      title = "Title",
      listRowIcon = ListRowIcon.NormalIcon(
          iconResId = R.drawable.icn_arrow,
          description = null
      )
  )
```
## Headline
Any `@Composable` could be used as `headline`.

![image](https://user-images.githubusercontent.com/944814/143047154-444ec1a0-165c-4a8a-a9f6-41570f6d8104.png)

```kotlin
  ListRowItem(
      title = "Title",
      headline = { Tag() },
      listRowIcon = ListRowIcon.CircleIcon(
        iconResId = R.drawable.icn_arrow,
        backgroundColor = MisticaTheme.colors.neutralLow,
        description = null
      )
  )
```

## Divider
Remember that if you need to add dividers inside a `Column` or `LazyColumn`, it's needed to use `Divider` component. For example:
```kotlin
  Column {
      ListRowItem(
          title = "Title",
      )
      Divider()
      ListRowItem(
          title = "Title",
      )
      Divider()
      ListRowItem(
          title = "Title",
      )
  }
```

## Badge
Show a `badge` in the right side of the component could be done with the parameter `isBadgeVisible` to control the visibility and the parameter `badge` to define the content. When the content is empty an smaller version of the badge is shown, a simple dot.

![image](https://user-images.githubusercontent.com/944814/143047865-998d2c6a-07d6-4ace-9f30-5f611352df6d.png)

```kotlin
  ListRowItem(
      title = "Title",
      isBadgeVisible = true,
      icon = {
        Circle {
          Icon(
            painterResource(id = R.drawable.icn_cross)
          )
        }
      }
  )
  ListRowItem(
      title = "Title",
      isBadgeVisible = true,
      badge = "9",
      icon = {
        Circle {
          Icon(
            painterResource(id = R.drawable.icn_cross)
          )
        }
      }
  )
```
Internally, `Badge` is a custom component that wraps the Material component `androidx.compose.material.Badge` to handle the specific definition when the content is empty. If you need to use the badge to notice another view remember to use `androidx.compose.material.BadgeBox` and use this custom component as `badge` parameter.
> [!NOTE] 
> Please note that this component is ignored in terms of accessibility. If you want to provide accessibility support for the Badge, please refer to the [Custom Content Description](#custom-content-description) section.

## Trailing
Any `@Composable` is allowed to be used as `trailing` parameter. This will show the composable in the right side of the row, after the badge when visible.

```kotlin
  ListRowItem(
      title = "Title",
      trailing = { Chevron() }
  )
  ListRowItem(
      title = "Title",
      trailing = {
        Checkbox(
          checked = checkedState.value,
          onCheckedChange = { checkedState.value = it }
        )
      }
  )
```

## Toggleables
There are two new sub-components from ListRowItem to handle Action Layouts with toggleable views like Switch or CheckBox components.
Take a look to the new available sub-components:
* [ListRowItemWithSwitch](ListRowItemWithSwitch.kt)
* [ListRowItemWithCheckBox](ListRowItemWithCheckBox.kt)

These two new sub-components have been created in order to handle the main accessibility actions according to Google standards with Toggleable views.
So please, consider replacing and start using these two new sub-components if you need to use a list element with a Switch or CheckBox view.

```kotlin
var switchState by remember {
    mutableStateOf(false)
}
ListRowItemWithSwitch(
    title = "Title",
    subtitle = "Subtitle",
    checked = switchState,
    onCheckedChange = { switchState = it },
    listRowIcon = ListRowIcon.NormalIcon(painter = painterResource(id = R.drawable.ic_lists)),
)
```

## Custom Content Description
By default, `ListRowItem` attempts to generate a coherent content description (`contentDescription`) for accessibility services.

> [!NOTE]
> Using a custom contentDescription can be useful for specific accessibility cases, but it's recommended to use the default value whenever possible to ensure the best user experience.

### Customizing the `contentDescription`

For scenarios where the automatic description is insufficient or more precise control over what screen readers announce is needed, this component now 
supports configuring a **custom `contentDescription`**, which will override the internally managed default value. By default, the component automatically assigns and manages an accessible `contentDescription`.

This is achieved through the `customContentDescription` parameter, which accepts a `CustomContentDescriptionConfig` object.

**`CustomContentDescriptionConfig`:**

This data class allows configuration of:

*   `contentDescription: String`: The exact text you want accessibility services to announce for the entire `ListRowItem`. When provided, this **completely overrides** the automatic description generation.
*   `ignoreBottomSlot: Boolean` (defaults to `true`): If `true`, the content of the `bottom` slot will be ignored for accessibility purposes when a custom `contentDescription` is used. This is useful if the custom description already covers the information in the `bottom` slot, or if the `bottom` slot is purely decorative in this context. If `false`, the `bottom` slot will maintain its own semantics and will be focusable/announceable separately if it has semantic content.
*   `ignoreTrailingSlot: Boolean` (defaults to `true`): Similar to `ignoreBottomSlot`, but for the `trailing` slot. If `true`, the semantics of the `trailing` element are ignored when a `customContentDescription` is defined. If `false`, the `trailing` element will be independent in terms of accessibility.

**Example Usage:**
```kotlin
ListRowItem(
    title = "Special Offer", 
    subtitle = "Valid until end of month", 
    bottom = { CustomComposable() },
    trailing = { Chevron() },
    onClick = { /* ... */ }, 
    customContentDescription = CustomContentDescriptionConfig(
        contentDescription = "Special offer: Valid until end of month. Tap to see details and conditions of the offer.",
        ignoreBottomSlot = false, // We want to maintain the semantics of the CustomComposable alongside the custom ContentDescription.
    ) 
)
```
> [!CAUTION]
> If the component uses a badge and you need to provide accessibility support for it, you must use a custom contentDescription as the component's default
> behavior will ignore the badge.

> [!CAUTION]
> If your CustomComposable contains clickable elements like buttons, you'll need to disable ignoreSlot by setting it to "false" as shown below.
