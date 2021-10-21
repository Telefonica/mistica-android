# Badges

Badges are placed on an overlay, at the top right side of any other view:

<p align="center">
    <img width="25%" src="../../../../../../../../doc/images/badges/badges.gif">
</p>

To use it, use `com.telefonica.mistica.badge.Badge`

There are two groups of methods corresponding to the two different badge styles, numeric and non-numeric:

### Prior to `3.0.0` version
```kotlin
fun showBadgeIn(anchor: View): BadgeDrawable
fun showBadgeIn(anchor: View, parent: ViewGroup): BadgeDrawable

fun showNumericBadgeIn(anchor: View, count: Int): BadgeDrawable
fun showNumericBadgeIn(anchor: View, parent: ViewGroup, count: Int): BadgeDrawable
```
That will add a badge on the top right side of `anchor` view. The badge will be presented without a number, unless count is specified (and it has a positive number). All numbers bigger than 9 will be cropped to `9+`. If count is specified with 0 value the badge will be removed/hidden. 

Also, you can specify a `parent`, which will be the layout where `anchor` is presented. This is useful only when you need to do something custom, like positioning the badge closer to the view. (See `showProfileBadge` as an example)

`showBadgeIn` will return a BadgeDrawable, that should be kept referenced in order to remove it from the view.

```kotlin
fun removeBadge(badgeDrawable: BadgeDrawable, anchor: View)
fun removeBadge(badgeDrawable: BadgeDrawable, parent: ViewGroup)
```
Use these methods to delete the badge from the anchor/parent. You will need to decide which one to call based on how you added the badge to your anchor.

### Since `3.0.0` version

`fun showBadgeIn(anchor: View): BadgeDrawable` and `fun showNumericBadgeIn(anchor: View, count: Int): BadgeDrawable` methods have been removed so now `parent` parameter is mandatory and it has to be a `FrameLayout`. Current methods to show the badge look like this:

```kotlin
fun showBadgeIn(anchor: View, parent: FrameLayout): BadgeDrawable

fun showNumericBadgeIn(anchor: View, parent: FrameLayout, count: Int): BadgeDrawable
```
