# Lists  
`ListRowItems` are a continuous group of text or images. They are composed of items containing primary and supplemental actions, which are represented by icons and text.
This component is designed to be used inside lists, that in Compose are built using `Column` or `LazyColumn`.

```kotlin
@ExperimentalMaterialApi  
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
            painterResource(id = R.drawable.icn_cross),
            contentDescription = null
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
            painterResource(id = R.drawable.icn_cross),
            contentDescription = null
          )
        }
      }
  )
```
Internally, `Badge` is a custom component that wraps the Material component `androidx.compose.material.Badge` to handle the specific definition when the content is empty. If you need to use the badge to notice another view remember to use `androidx.compose.material.BadgeBox` and use this custom component as `badge` parameter.

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
