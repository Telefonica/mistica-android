# Upgrading guide

**For versions newer than 11.1.1, breaking changes and corresponding upgrade guides will be published with their respective [releases](https://github.com/Telefonica/mistica-android/releases)**

This document is just kept for reference for older versions, but it should not be modified.

## Upgrade to version 11.1.1
Both `preset9FontWeight` and `preset10FontWeight` have been added to `Brand` interface.
We should add these new values to our brand implementations.

## Upgrade to version 10.0.0
`calloutIcon` has been replaced with `calloutAsset` and `calloutAssetType` to allow the use of images and circular images in the `Callout` component

## Upgrade to version 9.3.0
button2.Button is a wrapper to be used in traditional views that uses under the hood the Button() composable.
We should start migrating the links that have to use chevron from button.Button to button2.Button
Watch out that the new app:style attribute is needed to set the button style (with LINK / LINK_INVERSE for links).
Later on we'll deprecate the button.Button in favour of button2.Button and start migrating the rest.

When this new compose wrapper is used on dialogs the ViewTreeLifecycle should be provided (see initViewTreeOwners() in Sheet.kt).

## Upgrade to version 9.0.0

### Some colors have been renamed and deleted

In order to align the color names with the one defined by UX team, some colors have been renamed. Some examples:
- `buttonSecondaryBackgroundSelectedInverse` -> `buttonSecondaryBackgroundInverseSelected`
- In XML implementation:
  - `promoLow` -> `colorPromoLow`
  - `brandLow` -> `colorBrandLow`
  - `successLow` -> `colorSuccessLow`
  - `warningLow` -> `colorWarningLow`
  - `errorLow` -> `colorErrorLow`
  - `promoHigh` -> `colorPromoHigh`
  - `successHigh` -> `colorSuccessHigh`
  - `warningHigh` -> `colorWarningHigh`
  - `errorHigh` -> `colorErrorHigh`
- In compose implementation:
  - `controlActive` ->`controlActivated`

Other colors have been removed because UX team has decided to remove them from the design system. Some examples:
- `carouselIndicatorActiveColor` -> `controlActivated`
- `carouselIndicatorInactiveColor` -> `control`

### Changes in FeedbackScreenView
- `TYPE_CUSTOM` has been removed. Use `TYPE_INFO` instead, it allows custom icon or animation.
- `shouldAnimateOnAttachedToWindow` is now private. Use method `setShouldAnimateOnAttached()` or xml attribute `app:shouldAnimateOnAttached` instead.


## Upgrade to version 8.3.0

### Removed 'catalog-compose' component

From version 8.3.0 and higher 'catalog-compose' has been removed and migrated into 'catalog' module.<br/>
Note that if your project is implementing 'catalog-compose', please consider to change it into 'catalog' module which now supports both XML and Compose catalog components.

~~debugImplementation "com.telefonica:mistica-catalog-compose:$mistica_version"~~
```groovy
debugImplementation "com.telefonica:mistica-catalog:$mistica_version"
```

## Upgrade from 1.x to 2.x

### Dark mode support

2.0.0 is the first version of Mistica that supports [dark mode](https://developer.android.com/guide/topics/ui/look-and-feel/darktheme) in Android 10 (API level 29) and higher. In order to do so, every Mistica theme passes from extending `Theme.MaterialComponents.Light.NoActionBar` to extend `Theme.MaterialComponents.DayNight.NoActionBar`. This means that if you're using `MisticaTheme` or any of the brand variants(`MisticaTheme.Movistar`, `MisticaTheme.O2`, `MisticaTheme.O2Classic` or `MisticaTheme.Vivo`) in your app, the moment you use the 2.x version of Mistica your app will support dark mode and automatically change the colors of the Mistica components when the device is set to dark mode.

If your app still doesn't support dark mode you will want to read the official documentation https://developer.android.com/guide/topics/ui/look-and-feel/darktheme and adapt your app accordingly before using Mistica 2.x.

### I need to use a new component, but don't want to support dark mode

If you need to upgrade to Mistica 2.x or higher to use a new component but still don't want to support dark mode, you can always force light mode in your app by using `AppCompatDelegate` as explained in the official docs https://developer.android.com/guide/topics/ui/look-and-feel/darktheme#change-themes
 
 In your `Application` code add:
 
```kotlin
AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
```

And your app will be forced to always use light themes.

### SectionTitleView replaced by TitleView component

`SectionTitleView` has been replaced by [TitleView](https://github.com/Telefonica/mistica-android/blob/main/library/src/main/java/com/telefonica/mistica/title/README.md) component.
