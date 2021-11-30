# Feedbacks

<p align="center">
    <img src="../../../../../../../../../doc/images/screen_feedbacks/feedbacks.gif">
</p>

`com.telefonica.mistica.feedback.screen.view.FeedbackScreenView` allows showing a full screen feedback which can be configured depending on the needs.

It can be used inside any layout like a regular view. When adding it to the view hierarchy, screen entry animations will be performed.

In order to configure it for the specific purpose, it supports both **attribute configuration and databinding for all properties**

## Available fields

```xml
<declare-styleable name="FeedbackScreen">
    <attr name="feedbackType" format="enum">
        <enum name="success" value="0"/>
        <enum name="error" value="1"/>
        <enum name="info" value="2"/>
    </attr>
    <attr name="feedbackTitle" format="string"/>
    <attr name="feedbackSubtitle" format="string"/>
	<attr name="feedbackErrorReference" format="string"/>
    <attr name="feedbackCustomContentLayout" format="reference"/>
    <attr name="feedbackFirstButtonText" format="string"/>
    <attr name="feedbackSecondButtonText" format="string"/>
    <attr name="feedbackSecondButtonAsLink" format="boolean"/>

    <attr name="feedbackFirstButtonOnClick" format="string"/>
    <attr name="feedbackSecondButtonOnClick" format="string"/>
</declare-styleable>
```
