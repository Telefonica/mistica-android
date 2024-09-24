![Mistica for Android](doc/images/mistica-android-light.svg#gh-light-mode-only)
![Mistica for Android](doc/images/mistica-android-dark.svg#gh-dark-mode-only)

[![Platform](https://img.shields.io/badge/Platform-Android-brightgreen)](https://github.com/Telefonica/mistica-android)
[![Version](https://img.shields.io/maven-metadata/v.svg?label=maven-central&metadataUrl=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Fcom%2Ftelefonica%2Fmistica%2Fmaven-metadata.xml)](https://search.maven.org/artifact/com.telefonica/mistica)
[![Support](https://img.shields.io/badge/Support-%3E%3D%20Android%205.0-brightgreen)](https://github.com/Telefonica/mistica-android)
[![Kotlin version badge](https://img.shields.io/badge/kotlin-1.8.20-blue.svg)](https://kotlinlang.org/docs/whatsnew1820.html)

Mistica is a framework that contains reusable UI components and utilities.

## Compose support

There is a currently work in progress compose version of the library. Check the documentation [here](library/src/main/java/com/telefonica/mistica/compose)

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
* MisticaTheme.O2
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

## Components

* [Badges](library/src/main/java/com/telefonica/mistica/badge)
* [Buttons](library/src/main/java/com/telefonica/mistica/button)
* [Callout](library/src/main/java/com/telefonica/mistica/callout)
* [Carousel](library/src/main/java/com/telefonica/mistica/carousel)
* [Controls](library/src/main/java/com/telefonica/mistica/control)
* [Data Cards](library/src/main/java/com/telefonica/mistica/card/datacard)
* [Empty State Cards](library/src/main/java/com/telefonica/mistica/emptystate/card)
* [Empty States](library/src/main/java/com/telefonica/mistica/emptystate/screen)
* [Filters](library/src/main/java/com/telefonica/mistica/filters)
* [Headers](library/src/main/java/com/telefonica/mistica/header)
* [Highlighted Cards](library/src/main/java/com/telefonica/mistica/highlightedcard)
* [Inputs](library/src/main/java/com/telefonica/mistica/input)
* [Lists](library/src/main/java/com/telefonica/mistica/list)
* [Load Error Feedback](library/src/main/java/com/telefonica/mistica/feedback/error)
* [Media Cards](library/src/main/java/com/telefonica/mistica/card/mediacard)
* [Pop Overs](library/src/main/java/com/telefonica/mistica/feedback/popover)
* [Screen Feedbacks](library/src/main/java/com/telefonica/mistica/feedback/screen)
* [Scroll Content Indicator](library/src/main/java/com/telefonica/mistica/contentindicator)
* [Sheet](library/src/main/java/com/telefonica/mistica/sheet)
* [Skeletons](library/src/main/java/com/telefonica/mistica/compose/skeleton)
* [Snackbars](library/src/main/java/com/telefonica/mistica/feedback)
* [Steppers](library/src/main/java/com/telefonica/mistica/stepper)
* [Tabs](library/src/main/java/com/telefonica/mistica/tabs)
* [Tags](library/src/main/java/com/telefonica/mistica/tag)
* [Title](library/src/main/java/com/telefonica/mistica/title)
* [HighLightedCard (Compose version)](library/src/main/java/com/telefonica/mistica/compose/card/highlightedcard)

## Text Presets Styles

Library includes a set of available [Text Appearance](library/src/main/res/values/styles_fonts.xml) styles, applicable for all kind of TextViews.

## Using fonts

Mistica defines 3 typographic styles to be used along with the library, these typefaces are defined as attributes and can be override using some allowed fonts.
More info [here](library/src/main/java/com/telefonica/mistica/fonts)

## Working with semantic colors/gradients

For each supported brand, Mistica exposes a set of theme properties (attributes in xml) customized accordingly for each brand.

More info [here](library/src/main/java/com/telefonica/mistica/theme)

## Demo app

There is a demo of currently implemented components in this repository. A full list of implemented components can be found here: [Components](library/src/main/java/com/telefonica/mistica).

The app can be downloaded [here](https://install.appcenter.ms/orgs/tuenti-organization/apps/mistica/distribution_groups/public) or manually built.

To compile the app manually run the [App](app) module in Android Studio.

<p align="left">
    <img width="25%" src="./doc/images/catalog/catalog.png">
</p>

## Working with this project locally

In case you are making a change in the library that yoy want to test in other client app but you don't want to release a new version or even an snapshot, then a local deployment of the lib can be done on your machine. 

Some small changes that **shouldn't be committed** are needed:
- Comment `signing` section inside [`mavencentral.gradle`](mavencentral.gradle) file. The reason is because you probably won't have the secrets for signing the library aar and because they aren't actually needed for this kind of local deployment.

```groovy
/*
signing {
    def signingKeyId = findProperty("signingKeyId")
    def signingKey = findProperty("signingKey")
    def signingPassword = findProperty("signingPassword")
    useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
    sign publishing.publications
}
*/
```

- Set a preferred SNAPSHOT version for your local release in [`mavencentral.gradle`](mavencentral.gradle):

```groovy
PUBLISH_VERSION = '1.0.0-SNAPSHOT'
```

- Build the artifacts:

```bash
./gradlew clean :library:assembleRelease :catalog:assembleRelease
```

- Release the artifacts to your local maven repository (`~.m2`directory). Note the `ToMavenLocal` suffix:

```bash
./gradlew :library:publishReleasePublicationToMavenLocal :catalog:publishCatalogPublicationToMavenLocal
```

- Now you can go back to your client app repository, add `mavenLocal()` to the list of repositories on `build.gradle`

```groovy
allprojects {
    repositories {
        mavenLocal() // It is recommended to place it on first place
        // ... your other repositories
    }
}
```

- Update the version of mistica to the one the snapshot was released with, sync your project and the dependency should be resolved with the artifact including your local changes.

## Design tokens
We have several tokens that are defined by the UX team (colors, radius and text presets) in a [JSON format](https://github.com/Telefonica/mistica-design/tree/production/tokens). Using these files, we generate XML and Kotlin files that are used in the library.

You should not modify manually the generated files. All the generated files have a comment at the beginning to identify them.

[There is a more detailed documentation](tokens/README.md) about how to work with this design tokens generation.  

## Library size

Library aar size is around **270 KB**, without including transitive dependencies (Lottie, material and kotlin).

Your app size increase may depend on which of these transitive libraries are already being used, and also, the usage of them, so proguard can shrink more or less code.

Just to put an example, in a common scenario where your app is already using material and kotlin libs, app size increase should be around 400 KB

## Contributing

See [CONTRIBUTING.md](./CONTRIBUTING.md)
 
## Upgrading guide

See [UPGRADING.md](./UPGRADING.md)
