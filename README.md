![Mistica for Android](doc/images/mistica-android-light.svg#gh-light-mode-only)
![Mistica for Android](doc/images/mistica-android-dark.svg#gh-dark-mode-only)

[![Platform](https://img.shields.io/badge/Platform-Android-brightgreen)](https://github.com/Telefonica/mistica-android)
[![Version](https://maven-badges.herokuapp.com/maven-central/com.telefonica/mistica/badge.png)](https://search.maven.org/artifact/com.telefonica/mistica)
[![Support](https://img.shields.io/badge/Support-%3E%3D%20Android%205.0-brightgreen)](https://github.com/Telefonica/mistica-android)
[![Kotlin version badge](https://img.shields.io/badge/kotlin-1.3-blue.svg)](https://kotlinlang.org/docs/reference/whatsnew13.html)

Mistica is a framework that contains reusable UI components and utilities.

## Compose support

There is a currently work in progress compose version of the library. Check the documentation [here](library-compose)

## Installation


Inside the dependency block in the `build.gradle` of your application, add this line to add the library:

```groovy
repositories {
    mavenCentral()
}
dependencies {
    ...
    implementation 'com.telefonica:mistica:$version'
    ...
}
```

In case you also want to include also the components catalog in your application:

```groovy
dependencies {
    ...
    implementation 'com.telefonica:mistica:$version'
    implementation 'com.telefonica:mistica-catalog:$version'
    ...
}
```

## Configuration

Mistica provides an Android theme for each brand supported by telefonica.
Just set your App or any specific activity to use any of the following:

* MisticaTheme.Movistar
* MisticaTheme.Movistar.Prominent
* MisticaTheme.O2
* MisticaTheme.O2Classic
* MisticaTheme.Vivo
* MisticaTheme.Telefonica
* MisticaTheme.Blau

```xml
<manifest ...>
    <application
        ...
        android:theme="@style/MisticaTheme.Movistar" />
</manifest>
```

```xml
...
<activity
    ...
    android:theme="@style/MisticaTheme.Movistar.Prominent" />
...
```

## Components

* [Buttons](library/src/main/java/com/telefonica/mistica/button)
* [Inputs](library/src/main/java/com/telefonica/mistica/input)
* [Snackbars](library/src/main/java/com/telefonica/mistica/feedback)
* [Screen Feedbacks](library/src/main/java/com/telefonica/mistica/feedback/screen)
* [Load Error Feedback](library/src/main/java/com/telefonica/mistica/feedback/error)
* [Pop Overs](library/src/main/java/com/telefonica/mistica/feedback/popover)
* [Badges](library/src/main/java/com/telefonica/mistica/badge)
* [Scroll Content Indicator](library/src/main/java/com/telefonica/mistica/contentindicator)
* [Tags](library/src/main/java/com/telefonica/mistica/tag)
* [Lists](library/src/main/java/com/telefonica/mistica/list)
* [Headers](library/src/main/java/com/telefonica/mistica/header)
* [Sections](library/src/main/java/com/telefonica/mistica/section)
* [Filters](library/src/main/java/com/telefonica/mistica/filters)
* [Highlighted Cards](library/src/main/java/com/telefonica/mistica/highlightedcard)
* [Controls](library/src/main/java/com/telefonica/mistica/control)
* [Media Cards](library/src/main/java/com/telefonica/mistica/card/mediacard)
* [Data Cards](library/src/main/java/com/telefonica/mistica/card/datacard)
* [Steppers](library/src/main/java/com/telefonica/mistica/stepper)
* [Tabs](library/src/main/java/com/telefonica/mistica/tabs)
* [Empty States](library/src/main/java/com/telefonica/mistica/emptystate/screen)
* [Empty State Cards](library/src/main/java/com/telefonica/mistica/emptystate/card)
* [Callout](library/src/main/java/com/telefonica/mistica/callout)
* [Title](library/src/main/java/com/telefonica/mistica/title)
* [Bottom Sheet](library/src/main/java/com/telefonica/mistica/bottomsheet)

## Text Presets Styles

Library includes a set of available [Text Appearance](library/src/main/res/values/styles_fonts.xml) styles, applicable for all kind of TextViews.

## Using fonts

Mistica defines 3 typographic styles to be used along with the library, these typefaces are defined as attributes and can be override using some allowed fonts.
More info [here](library/src/main/java/com/telefonica/mistica/fonts)

## Demo app

There is a demo of currently implemented components in this repository. A full list of implemented components can be found here: [Components](library/src/main/java/com/telefonica/mistica).

The app can be downloaded [here](https://install.appcenter.ms/orgs/tuenti-organization/apps/mistica/distribution_groups/public) or manually built.

To compile the app manually run the [App](app) module in Android Studio.

<p align="left">
    <img width="25%" src="./doc/images/catalog/catalog.png">
</p>

## Library size

Library aar size is around **270 KB**, without including transitive dependencies (Lottie, material and kotlin).

Your app size increase may depend on which of these transitive libraries are already being used, and also, the usage of them, so proguard can shrink more or less code.

Just to put an example, in a common scenario where your app is already using material and kotlin libs, app size increase should be around 400 KB

## Contributing

See [CONTRIBUTING.md](./CONTRIBUTING.md)
 
## Upgrading guide

See [UPGRADING.md](./UPGRADING.md)
