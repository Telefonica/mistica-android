# Media Card

Media cards combine an image with textual content and actions, providing a rich visual component for displaying content.

## Examples

| Description                             |                                               Preview                                                |
|-----------------------------------------|:----------------------------------------------------------------------------------------------------:|
| Image Position Top                      | ![MediaCard Top Light](../../../../../../../../../../doc/images/media_cards/media_card_compose1.png) |
| Image Position Top with tag and buttons | ![MediaCard Top Dark](../../../../../../../../../../doc/images/media_cards/media_card_compose2.png)  |
| Image Position Left                     |   ![MediaCard Left](../../../../../../../../../../doc/images/media_cards/media_card_compose3.png)    |
| Image Position Right                    |   ![MediaCard Right](../../../../../../../../../../doc/images/media_cards/media_card_compose4.png)   |

## Usage

To create a Media Card, use the [`MediaCard()`](https://github.com/Telefonica/mistica-android/blob/main/library/src/main/java/com/telefonica/mistica/compose/card/mediacard/MediaCard.kt#L24) composable:

```kotlin
MediaCard(
    image = MediaCardImageResource(R.drawable.my_image),
    tag = Tag("PROMO").withStyle(TagView.TYPE_PROMO),
    preTitle = "Pre-title text",
    title = "Card Title",
    subtitle = "Card subtitle",
    description = "A detailed description of the content",
    primaryButton = Action("Primary") { /* action */ },
    linkButton = Action("Link") { /* action */ }
)
```

## Image Configuration

### Image Types

Media Card supports two image types via the sealed class `MediaCardImage`:

- **`MediaCardImageResource`**: Display an image from drawable resources
  ```kotlin
  MediaCardImageResource(
      imageRes = R.drawable.my_image,
      contentDescription = "Description for accessibility"
  )
  ```

- **`MediaCardImageBitmap`**: Display an `ImageBitmap` directly
  ```kotlin
  MediaCardImageBitmap(
      imageBitmap = myImageBitmap,
      contentDescription = "Description for accessibility"
  )
  ```

### Image Position

Control where the image appears using the `imagePosition` parameter:

- **`MediaCardImagePosition.Top`** (default): Image spans the full width at the top
- **`MediaCardImagePosition.Left`**: Image on the left side (150dp width)
- **`MediaCardImagePosition.Right`**: Image on the right side (150dp width)

```kotlin
MediaCard(
    image = MediaCardImageResource(R.drawable.my_image),
    imagePosition = MediaCardImagePosition.Left,
    // ... other parameters
)
```

### Image Content Scale

Customize how the image scales using the `imageContentScale` parameter (default: `ContentScale.Crop`):

```kotlin
MediaCard(
    image = MediaCardImageResource(R.drawable.my_image),
    imageContentScale = ContentScale.Fit,
    // ... other parameters
)
```

## Content Elements

All content elements are optional:

- **`tag`**: A `Tag` displayed at the top (e.g., "NEW", "PROMO")
- **`preTitle`**: Text displayed above the title
- **`title`**: The main heading
- **`subtitle`**: Secondary text below the title
- **`description`**: Detailed description text

## Actions

Add up to two action buttons:

- **`primaryButton`**: Primary call-to-action button
- **`linkButton`**: Secondary link-style button

When the image is positioned at `Left` or `Right`, buttons stack vertically. With `Top` image position, buttons are arranged horizontally.

```kotlin
MediaCard(
    image = MediaCardImageResource(R.drawable.my_image),
    primaryButton = Action("Buy Now") { /* handle action */ },
    linkButton = Action("Learn More") { /* handle action */ }
)
```

## Custom Content

Inject custom composable content between the description and actions using the `customContent` parameter:

```kotlin
MediaCard(
    image = MediaCardImageResource(R.drawable.my_image),
    title = "Card with Custom Content",
    customContent = {
        // Your custom composable content here
        Text("Custom content")
    }
)
```
