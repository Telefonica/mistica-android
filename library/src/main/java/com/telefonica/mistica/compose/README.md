# Jetpack Compose support

[Jetpack compose](https://developer.android.com/jetpack/compose) is a toolkit to develop native UI in Android. Newer and more powerful than Android Views it has
became the default system in newer Telefónica Android applications.

## Installation

Inside the dependency block in the `build.gradle` of your application, add this line to add the library:

```groovy
repositories {
    mavenCentral()
}
dependencies {
    ...
    implementation 'com.telefonica:mistica-compose:$version'
    ...
}
```

In case you also want to include also the components catalog in your application:

```groovy
dependencies {
    ...
    implementation 'com.telefonica:mistica-compose:$version'
    implementation 'com.telefonica:mistica-compose-catalog:$version'
    ...
}
```

## Configuration

The goal of the team is to provide a fully compose implementation of the library, but currently there are still wrapped views inside `AndroidView` composables.
So it is still needed to add [the brand theme in the Manifest](../README.md#configuration)

Also, wrap your outer composable with the `MisticaTheme`

```kotlin
@Composable
fun MisticaTheme(
    brand: Brand,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
)
```

where `brand` is the implementation of the app brand and `darkTheme` a flag that indicates if the theme should be dark or light. Example:

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        MisticaTheme(brand = MovistarBrand) {
            ...
        }
    }
}
```

## Composable components

Mística-compose supports a subset of the Mística elements. The objective is to support all of them in a near future.

## Fonts

Mística-compose supports the same fonts supported in Mística.
See [MisticaTypography](https://github.com/Telefonica/mistica-android/library/src/main/java/com/telefonica/mistica/compose/theme/text/MisticaTypography.kt)

Example of use:

```kotlin
Text(
    text = "Preset 1",
    style = MisticaTheme.typography.preset1
)
```

## Demo app

There is a Mística-compose catalog in the [Demo app](https://github.com/Telefonica/mistica-android/blob/main/README.md#demo-app) Search for Compose in your
launcher

## Current state

### Components

| Component                                        | Available | Implementation |
|--------------------------------------------------|-----------|----------------|
| [Buttons](./button/README.md)                    | ✅         | Composable    |
| [Inputs](./input/README.md)                      | ✅*        | Composable     |
| Snackbars                                        |           |                |    				
| [Screen Feedbacks](./feedback/README.md)         | ✅         | AndroidView    |
| Load Error Feedback                              |           |                |    							
| Pop Overs                                        |           |                |    				
| [Badges](./badge/README.md)                      | ✅         | Composable     |
| Scroll Content Indicator                         |           |                |    								
| [Tags](./tag/README.md)                          | ✅         | Composable     |
| [Lists](./list/README.md)                        | ✅️        | Composable     |
| Headers                                          |           |                |    				
| Sections                                         |           |                |    				
| Filters                                          |           |                |    				
| Highlighted Cards                                |           |                |    						
| Controls                                         |           |                |    				
| [Media Cards](./card/mediacard/README.md)        | ✅️        | Composable     |
| [Data Cards](./card/datacard/README.md)          | ✅️        | Composable     |
| [Indeterminate Stepper](./stepper/README.md)     | ✅️        | AndroidView    |
| Determinate Stepper                              |           |                |
| Tabs                                             |           |                |
| [Empty States](./emptystate/screen/README.md)    | ✅         | AndroidView    |
| [Empty State Cards](./emptystate/card/README.md) | ✅         | AndroidView    |
| [Callout](./callout/README.md)                   | ✅         | Composable     |
| [Carousel](./carousel/README.md)                 | ✅️        | Composable     |
| [Title](./title/README.md)                       | ✅         | Composable     |

***Note**: Not every text input type have been migrated,
see [text input](https://github.com/Telefonica/mistica-android/tree/main/library/src/main/java/com/telefonica/mistica/compose/input/README.md) section to see
which ones are migrated.

### Brands

| Brand              | Available |
|--------------------|-----------|
| Movistar           | ✅         |
| Movistar Prominent | ✅         |
| O2                 | ✅         |
| O2 Classic         | ✅         |
| Vivo               | ✅         |
| Blau               | ✅         |
| Telefónica         | ✅         |
