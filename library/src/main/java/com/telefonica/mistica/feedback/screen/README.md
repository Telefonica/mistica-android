# Feedbacks

<p align="center">
    <img src="../../../../../../../../../doc/images/screen_feedbacks/feedbacks.gif">
</p>

`com.telefonica.mistica.feedback.screen.view.FeedbackScreenView` allows showing a full screen feedback which can be configured depending on the needs.

It can be used inside any layout like a regular view. When adding it to the view hierarchy, entry animations will be performed.

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
## Fields information

`feedbackType` -> (Required) Type of the feedback for the specific purpose.
`feedbackTitle` -> (Required) Title
`feedbackSubtitle` -> (Required) Subtitle
`feedbackErrorReference` -> (Optional) It allows specifying a error reference text, such as "Error reference: #95001". It is only displayed when field is not an empty string and the current feedback type is error.
`feedbackCustomContentLayout` -> (Optional) Allows specifying a layout resource that will be inflated, showing its contents below the feedback subtitle.
`feedbackFirstButtonText` -> (Optional) Allows specifying a Text for the first feedback button. A primary button will be displayed if text is not empty.
`feedbackSecondButtonText` -> (Optional) Allows specifying a Text for the second feedback button. A secondary button will be displayed if text is not empty.
`feedbackSecondButtonAsLink` -> (Optional) When specified as true, the second button is displayed as a link button.
`feedbackFirstButtonOnClick` -> (Optional) Click action associated to first feedback button.
`feedbackSecondButtonOnClick` -> (Optional) Click action associated to second feedback button.
