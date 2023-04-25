# Upgrading guide

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


## Upgrade to version 8.3.0

### Removed 'catalog-compose' component

From version 8.3.0 and higher 'catalog-compose' has been removed and migrated into 'catalog' module.<br/>
Note that if your project is implementing 'catalog-compose', please consider to change it into 'catalog' module which now supports both XML and Compose catalog components.

~~debugImplementation "com.telefonica:mistica-catalog-compose:$mistica_version"~~
```groovy
debugImplementation "com.telefonica:mistica-catalog:$mistica_version"
```
