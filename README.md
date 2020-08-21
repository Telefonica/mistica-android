<br>
<br>
<img height="64" alt="Mística for Android" src="./doc/images/mistica-logo.svg">
<br>

#  Mistica for Android

[![Platform](https://img.shields.io/badge/Platform-Android-brightgreen)](https://github.com/Telefonica/mistica-android)
[![Version](https://img.shields.io/badge/Version-0.2.2-blue)](https://github.com/Telefonica/mistica-android)
[![Support](https://img.shields.io/badge/Support-%3E%3D%20Android%205.0-brightgreen)](https://github.com/Telefonica/mistica-android)
[![Kotlin version badge](https://img.shields.io/badge/kotlin-1.3-blue.svg)](https://kotlinlang.org/docs/reference/whatsnew13.html)

Mistica is a framework that contains reusable UI components and utilities.

## Instalation

Inside the dependency block in your build.gradle, add this line to add the library:

```gradle
dependencies {
    ...
    implementation 'com.telefonica.mistica:mistica:$version'
    ...
}
```

In case you also want to include also the components catalog in your application:

```gradle
dependencies {
    ...
    implementation 'com.telefonica.mistica:mistica:$version'
    implementation 'com.telefonica.mistica:mistica-catalog:$version'
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
* [Chips](library/src/main/java/com/telefonica/mistica/chips)

## Demo app

Included in this repository is a demo of currently implemented components. A full list of implemented components can be found here: [Components](library/src/main/java/com/telefonica/mistica).

To see samples of all of our implemented components, run the [App](app) module in Android Studio.

<p align="left">
    <img width="25%" src="./doc/images/catalog/catalog.png">
</p>

## Contributing

Check [General Guidelines for Mística Contribution](https://github.com/Telefonica/mistica/blob/master/mistica-site/CONTRIBUTING.md).

To create or modify components on this repository, follow the next steps:

1. Clone this repo

2. Open project with Android Studio

3. Place the new component under `library` module, under `com.telefonica.mistica` package. The component should have a proper definition by the design team. When implementing the component, follow these guidelines:
   - The component should be implemented to be reusable. Make it **generic** enough so that other teams can also use it.
   - If it is designed to be part of a layout definition (It's not a floating element), it should be implemented as a **Custom View**.
     - It must allow **configuration with layout attributes**.
     - It must provide **databinding support** for these attributes.
     - It must also provide relevant **public methods to configure the view programatically**.
   - In case it is a floating element, provide **necessary classes/builders to configure it** before display.
   - Make sure the component **resizes correctly**, so it adapts correctly to any screen size (including rotation).
   - If possible, take into account **accessibility** (TalkBack, Font size modification).
   - Take into account provided **themes**, and check your view is correctly displayed for all them.

4. To help other developers, add (or update) associated documentation.
   - Place this documentation under a `README.md` file at package directory where component was defined.
  
5. Add your component to the catalog, by including it and its variants inside `catalog` module, so other developers can quickly test it.
   - Add a new entry to the main section list.
   - Add a new fragment to show the different component variants.
 
