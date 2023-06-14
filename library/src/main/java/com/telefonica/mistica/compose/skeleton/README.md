# Skeletons  

There are different skeleton shapes:

```kotlin
 val infiniteTransition: InfiniteTransition =
    rememberInfiniteTransition(label = "skeleton transition")

LineSkeleton(
    infiniteTransition = infiniteTransition
)

TextSkeleton(
    infiniteTransition = infiniteTransition
)

CircleSkeleton(
    infiniteTransition = infiniteTransition,
)

RowSkeleton(
    infiniteTransition = infiniteTransition,
)

RectangleSkeleton(
    infiniteTransition = infiniteTransition,
    modifier = Modifier.height(100.dp)
)
```
