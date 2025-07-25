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
	<attr name="listRowHeadlineContentDescription" format="string" />
	<attr name="listRowTitle" format="string" />
	<attr name="listRowIsTitleHeading" format="boolean" />
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
		<enum name="image_rounded" value="6" />
	</attr>
	<attr name="listRowAssetHeight" format="dimension">
		<enum name="none" value="-1" />
	</attr>
	<attr name="listRowAssetWidth" format="dimension">
		<enum name="none" value="-1" />
	</attr>
	<attr name="listRowBackgroundType" format="enum">
		<enum name="normal" value="0" />
		<enum name="boxed" value="1" />
		<enum name="boxedInverse" value="2" />
	</attr>
	<attr name="listRowActionLayout" format="integer">
		<enum name="none" value="-1" />
	</attr>
	<attr name="listRowActionContentDescription" format="string" />
	<attr name="listRowBadgeCount" format="integer">
		<enum name="gone" value="0" />
	</attr>
	<attr name="listRowBadgeVisible" format="boolean" />
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

## Toggleables
There is two new sub-components from ListRowView to handle Action Layouts with toggleable views like Switch or CheckBox components.
Take a look to the new available sub-components:
* [ListRowViewWithSwitch](ListRowViewWithSwitch.kt)
* [ListRowViewWithCheckBox](ListRowViewWithCheckBox.kt)

This two new sub-components have been created in order to handle the main accessibility actions according to Google standards with Toggleable views. So 
please, consider replacing and start using these two new sub-components if you need to use a list element with a Switch or CheckBox view.

### How to use the new sub-components?
First, place your code in XML or by code as you would normally do.
```xml
<com.telefonica.mistica.list.ListRowViewWithSwitch
		android:id="@+id/list_row_view_with_switch"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		app:listRowAssetDrawable="@drawable/highlighted_card_custom_background"
		app:listRowAssetType="smallIcon"
		app:listRowBadgeVisible="true"
		app:listRowIsTitleHeading="true"
		app:listRowTitle="Title"
		app:listRowDescription="Any subtitle" />
```

Important! Do not try to alter the Action Layout attribute, since it is actually inflated and managed internally in order to handle a proper accessibility 
configuration. It will thrown an IllegalArgumentException if you try to override this attribute:
```xml
<!-- Do not set app:listRowActionLayout manually -->
<com.telefonica.mistica.list.ListRowViewWithSwitch 
        app:listRowActionLayout="@layout/list_row_chevron_action" />
```
Second, use the utility exposed methods to manage the Switch component. Remember to set your custom onClickListener to handle the click events from the 
component:
```kotlin
val listRowViewWithSwitch = findViewById<ListRowViewWithSwitch>(R.id.list_row_view_with_switch)
listRowViewWithSwitch.apply {
    setOnClickListener {
        listRowViewWithSwitch.changeSwitchAction()
    }
    val currentState = isSwitchChecked()
    setTitle("My title")
}
```

Important! Do not try to access the Action Layout attribute,  since it is actually inflated and managed internally in order to handle a proper accessibility
configuration. It will thrown an IllegalStateException if you try to access this attribute:
```kotlin
// Do not invoke this method
listRowViewWithSwitch.getActionView()
```

## Custom Content Description
> [!NOTE]
> Using a custom contentDescription can be useful for specific accessibility cases, but it's recommended to use the default value whenever possible to ensure the best user experience.

This component now supports configuring a **custom `contentDescription`**, which will override the internally managed default value. By default, the component automatically assigns and manages an accessible `contentDescription`.

If you need to set a custom `contentDescription`, you can do so by simply setting the view's standard `contentDescription` property, either in code or via XML.

To revert to the default behavior, you can use the new method `resetContentDescription()`, which will remove the custom value and restore the component-managed `contentDescription`.

> [!CAUTION]
> If the component uses a badge and you need to provide accessibility support for it, you must use a custom contentDescription as the component's default
> behavior will ignore the badge.

### Usage Example

```kotlin
// Set a custom contentDescription
listRowViewWithSwitch.contentDescription = "Custom description for accessibility"

// Restore the component's default managed contentDescription
listRowViewWithSwitch.resetDescription()
```
