# Using fonts

There are two typefaces allowed to use with Mistica overriding the device default one.
- [OnAir](../../../../../../../../doc/fonts/onair)
To know more about this typeface follow this [link](https://brandfactory.telefonica.com/document/2372#/nuestra-identidad/tipografia)
- [Telefonica](../../../../../../../../doc/fonts/telefonica)
To know more about this typeface follow this [link](https://brandfactory.telefonica.com/document/483#/nuestra-identidad/Tipograf%C3%ADa)

## How to use

1. Download the font from the links above
2. Put your font files into your `<app>/res/fonts` directory (create it if not exists)
3. In your `theme.xml` include the definition below:

For OnAir font:
```xml
    <item name="font_family_light">@font/on_air_light</item>
    <item name="font_family_regular">@font/on_air_regular</item>
    <item name="font_family_medium">@font/on_air_bold</item>
```

Instead, for Telefonica font:
```xml
    <item name="font_family_light">@font/telefonica_light</item>
    <item name="font_family_regular">@font/telefonica_regular</item>
    <item name="font_family_medium">@font/telefonica_bold</item>
```

## Internals

We need 3 different typefaces to cover all the different text style presets available.
So we created 3 attributes to refer to this typefaces (check `attrs_fonts.xml` file) and all the
presets use these attributes as `fontFamily` attribute.
If no font is override, Mistica offer `sans-serif` as default value.
