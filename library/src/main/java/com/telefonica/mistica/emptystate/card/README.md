# Empty State Cards

<p align="left">
    <img height=300 src="../../../../../../../../../doc/images/empty_states/cards/empty_state_card_1.png" />
    <img height=300 src="../../../../../../../../../doc/images/empty_states/cards/empty_state_card_2.png" />
</p>

Empty State Cards require a minimum content of **an image and a title**

Implemented as a custom view,
`com.telefonica.mistica.emptystate.card.EmptyStateCardView` can be used
inside any layout like a regular view.

It supports both **attribute
configuration and databinding for all properties**.

```xml
<declare-styleable name="EmptyStateCardView">
    <attr name="emptyStateCardImage" format="reference" />
    <attr name="emptyStateCardImageContentDescription" format="string" />
    <attr name="emptyStateCardImageSize" format="enum">
        <enum name="icon" value="0" />
        <enum name="small" value="1" />
    </attr>
    <attr name="emptyStateCardTitle" format="string" />
    <attr name="emptyStateCardSubtitle" format="string" />
    <attr name="emptyStateCardButtonsConfig" format="enum">
        <enum name="none" value="0" />
        <enum name="primary" value="1" />
        <enum name="primary_link" value="2" />
        <enum name="primary_secondary" value="3" />
        <enum name="secondary" value="4" />
        <enum name="secondary_link" value="5" />
        <enum name="link" value="6" />
    </attr>
    <attr name="emptyStateCardPrimaryButtonText" format="string" />
	<attr name="emptyStateCardPrimaryButtonLoadingText" format="string" />
    <attr name="emptyStateCardPrimaryButtonOnClick" format="string" />
    <attr name="emptyStateCardSecondaryButtonText" format="string" />
    <attr name="emptyStateCardSecondaryButtonOnClick" format="string" />
    <attr name="emptyStateCardLinkButtonText" format="string" />
    <attr name="emptyStateCardLinkButtonOnClick" format="string" />
</declare-styleable>
```
