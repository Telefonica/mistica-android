# Carousel

This view is implemented using a wrapper over a composable implementation. Check [Carousel (Compose)](../compose/carousel/README.md) for more info.

## Layout
There are two views to create a carousel, the carousel itself and the page indicator:

```xml
<com.telefonica.mistica.carousel.CarouselView
        android:id="@+id/carousel_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />

<com.telefonica.mistica.carousel.CarouselPageIndicatorView
        android:id="@+id/carousel_page_indicator_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        />
```

## Code
And they can be configured in the code:

```kotlin
val carouselState = CarouselState(PagerState(0))
val pages = 6
binding.carouselView
    .setContent { page -> CarouselItem(page) }
    .setState(carouselState)
    .setItemCount(pages)

binding.carouselPageIndicatorView
    .setState(carouselState)
    .setPageCount(pages)

@Composable
private fun CarouselItem(page: Int) { ... }
```