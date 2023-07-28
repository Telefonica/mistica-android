# com.telefonica.mistica.tag.TagView

<p align="center">
   <img width="50%" src="../../../../../../../../doc/images/tags/tags.png" />
</p>

Tag which is composed of the following elements
- Text
- Icon
- Style

## Xml Attributes
- `text` [String] : Text to show inside the tag element
- `icon` [Int] - Icon drawable resource
- `style` [Int] - Style of the tag element. It can be one of the following values:
    - `promo`
    - `active`
    - `inactive`
    - `success`
    - `warning`
    - `error`
    - `inverse`

## How to use

```xml
	<com.telefonica.mistica.tag.TagView
			android:layout_width="wrap_content"
			android:layout_height="wrap_content"
			app:tagText="Active"
			app:tagStyle="active"
			app:tagIcon="@drawable/icon"
			/>
```

```xml
	<declare-styleable name="TagView">
		<attr name="tagIcon" format="reference" />
		<attr name="tagStyle" />
        <attr name="tagText" format="string" />
	</declare-styleable>
	<attr name="tagStyle" format="enum">
		<enum name="promo" value="0" />
		<enum name="active" value="1" />
		<enum name="inactive" value="2" />
		<enum name="success" value="3" />
		<enum name="warning" value="4" />
		<enum name="error" value="5" />
		<enum name="inverse" value="6" />
	</attr>
```
