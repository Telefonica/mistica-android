# Lists

## Items

<p align="center">
   <img src="../../../../../../../../doc/images/lists/lists-light.gif" />
   <img src="../../../../../../../../doc/images/lists/lists-dark.gif" />
</p>

Implemented as a custom view, `com.telefonica.mistica.ListRowView` can be used inside any layout like a regular view, including recyclable lists. It supports both **attribute configuration and databinding for all properties**.

```xml
<declare-styleable name="ListRowView">
	<attr name="listRowHeadlineLayout" format="integer">
		<enum name="none" value="-1" />
	</attr>
	<attr name="listRowHeadlineVisible" format="boolean" />
	<attr name="listRowTitle" format="string" />
	<attr name="listRowTitleMaxLines" format="integer" />
	<attr name="listRowSubtitle" format="string" />
	<attr name="listRowSubtitleMaxLines" format="integer" />
	<attr name="listRowDescription" format="string" />
	<attr name="listRowDescriptionMaxLines" format="integer" />
	<attr name="listRowAssetDrawable" format="reference" />
	<attr name="listRowAssetType" format="enum">
		<enum name="image" value="0" />
		<enum name="smallIcon" value="1" />
		<enum name="largeIcon" value="2" />
		<enum name="image_1_1" value="3" />
		<enum name="image_7_10" value="4" />
		<enum name="image_16_9" value="5" />
	</attr>
	<attr name="listRowBackgroundType" format="enum">
		<enum name="normal" value="0" />
		<enum name="boxed" value="1" />
		<enum name="boxedInverse" value="2" />
	</attr>
	<attr name="listRowActionLayout" format="integer">
		<enum name="none" value="-1" />
	</attr>
	<attr name="listRowBadgeCount" format="integer">
		<enum name="gone" value="0" />
	</attr>
	<attr name="listRowBadgeVisible" format="boolean" />
	<attr name="listRowBadgeDescription" format="string" />
	<attr name="onClick" format="string" />
</declare-styleable>
```

## Layouts

`ListLayout` class provides extension functions to configure recycler views where the rows can be used, with the 2 available layouts:
* Full Width Layout --> `configureWithFullWidthLayout`
* Boxed Layout --> `configureWithBoxedLayout`

Also `com.telefonica.mistica.MisticaRecyclerView` is just a `RecyclerView` that already supports previous layout styles by **both attribute configuration and databinding**:
```xml
<declare-styleable name="MisticaRecyclerView">
    <attr name="listLayoutType" format="integer">
        <enum name="full_width" value="0" />
        <enum name="boxed" value="1" />
    </attr>
</declare-styleable>
```
