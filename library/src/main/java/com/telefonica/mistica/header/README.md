# Headers

<p align="center">
   <img src="../../../../../../../../doc/images/headers/headers_1.png" />
   <img src="../../../../../../../../doc/images/headers/headers_2.png" />
</p>

Implemented as a custom view, `HeaderView` can be used inside any layout like a regular view. It supports both **attribute configuration** and **databinding for all properties**.

```xml
<declare-styleable name="HeaderView">
	<attr name="headerHasTopPadding" format="boolean"/>
	<attr name="headerInverse" format="boolean"/>
	<attr name="headerFirstPretitle" format="string"/>
	<attr name="headerFirstPretitleHasSecondaryColor" format="boolean"/>
	<attr name="headerTitle" format="string"/>
	<attr name="headerSecondPretitle" format="string"/>
	<attr name="headerSecondPretitleHasSecondaryColor" format="boolean"/>
	<attr name="headerNumeral" format="string"/>
	<attr name="headerNumeralHasDangerColor" format="boolean"/>
	<attr name="headerActionButtonText" format="string"/>
	<attr name="headerSecondaryActionButtonText" format="string"/>
	<attr name="headerActionButtonOnClick" format="string"/>
	<attr name="headerSecondaryActionButtonOnClick" format="string"/>
	<attr name="headerSubtitle" format="string"/>
	<attr name="headerSubtitleHasSecondaryColor" format="boolean"/>
</declare-styleable>
```
