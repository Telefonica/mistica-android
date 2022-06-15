## Titles

<p align="left">
   <img src="../../../../../../../../doc/images/sections/section_title.png" />
</p>
<p align="left">
   <img src="../../../../../../../../doc/images/sections/section_title_dark.png" />
</p>

Implemented as a custom view, [`com.telefonica.mistica.title.TitleView`](https://github.
com/Telefonica/mistica-android/blob/master/library/src/main/java/com/telefonica/mistica/title/TitleView.kt) can be used inside any layout like a regular 
view. It would be usually placed above lists.

It has two attributes: `title` and `link`.

`link` is optional and allows for a listener to be registered (through `linkOnClick` attribute that will be invoked when the link is tapped.
