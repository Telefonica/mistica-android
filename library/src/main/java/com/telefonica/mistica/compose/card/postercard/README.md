# Poster Card

This component allows you to display content organized by the following sections:
* Tag
* Pretitle
* Title
* Subtitle
* Description

Whose background can be a color (solid or gradient) or an image.
In addition, up to a maximum of 2 actions can be defined, which will be displayed in the upper right corner inside.

```kotlin
PosterCard(
    firstTopAction = TopActionData(iconRes = R.drawable.icn_visibility),
    secondTopAction = TopActionData(iconRes = R.drawable.ic_close_regular),
    aspectRatio = PosterCardAspectRatio.AR_16_9,
    backgroundType = PosterCardBackgroundType.Color(brush = SolidColor(MisticaTheme.colors.background), inverseDisplay = false),
    headline = Tag(content = "Headline"),
    preTitle = "Pretitle",
    title = "Title",
    subtitle = "Subtitle",
    description = "Description"
)
```