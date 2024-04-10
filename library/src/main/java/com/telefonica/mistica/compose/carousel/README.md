# Carousel

Carousels are divided in two composables, the `Carousel` and the `CarouselPagerIndicator`. Both can be used together sharing the same `CarouselState` to display a full carousel.

```kotlin
fun Carousels() {
    val carouselState = rememberCarouselState()
    val itemCount by remember { mutableStateOf(6)}
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Carousel(
            itemCount = itemCount,
            carouselState = carouselState,
        ) { page ->
            CarouselItem(page)
        }
        CarouselPagerIndicator(
            carouselState = carouselState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            pagerCount = itemCount,
            debug = true,
        )
    }
}
```

## Carousel composable
It has the next parameters:
```kotlin
modifier: Modifier = Modifier,
carouselState: CarouselState = rememberCarouselState(),
contentPadding: PaddingValues = PaddingValuesWithStartAndEndMargin(carouselState, start = 16.dp, end = 16.dp),
itemCount: Int,
autoPlay: Boolean = false,
autoPlaySpeed: Long = 5000L,
loop: Boolean = false,
content: @Composable (page: Int) -> Unit,
```

`PaddingValues` is the interface to define the padding of all the items. For a customization where the first and last items have an extra padding, please use
`PaddingValuesWithStartAndEndMargin` implementation.

`content` is the composable shown inside the Carousel.

Set `autoPlay` to `true` (`false` by default) to make the carousel automatically swipe to the next card after `autoPlaySpeed` milliseconds (5000 by default).
When the last card is reached and `loop` is set to `true` (`false` by default), the carousel will return to the first card automatically. Note: Cards will only be automatically swiped when carousel is fully visible inside the current viewport.

## CarouselPagerIndicator composable
It has the next parameters:
```kotlin
modifier: Modifier = Modifier,
maximumVisibleItems: Int = Constants.MAX_WINDOW_SIZE,
carouselState: CarouselState,
pagerCount: Int,
activeColor: Color = MisticaTheme.colors.carouselIndicatorActiveColor,
inactiveColor: Color = MisticaTheme.colors.carouselIndicatorInactiveColor,
indicatorSelectedWidth: Dp = 6.dp*2,
indicatorSelectedHeight: Dp = indicatorSelectedWidth,
indicatorUnselectedWidth: Dp = 4.dp*2,
indicatorUnselectedHeight: Dp = indicatorUnselectedWidth,
indicatorUnselectedSmallWidth: Dp = 3.dp*2,
indicatorUnselectedSmallHeight: Dp = indicatorUnselectedSmallWidth,
indicatorUnselectedVerySmallWidth: Dp = 2.dp*2,
indicatorUnselectedVerySmallHeight: Dp = indicatorUnselectedVerySmallWidth,
spacing: Dp = 8.dp,
indicatorShape: Shape = CircleShape,
debug: Boolean = false,
```
By default, the pager indicator is configured to work as the specs. 5 items maximum of the visible window. If you want to customize the color, size or visible elements in the window. It is possible by modifying the parameters.
