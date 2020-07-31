# FeedbackScreenActivity component
This activity provides direct navigation to a feedback screen with a default close action on first button press.

<p align="center">
    <img src="../../../../../../../../doc/images/screen_feedbacks/feedbacks.gif">
</p>

It can be launched with an ActionCommand or directly invoking the Intent with the corresponding extras:
## Display FeedbackScreenActivity with `ShowFeedbackActivity`
Configurable parameters are:
* type: : `Int(@FeedbackType)`
    * `FeedbackScreenView.TYPE_SUCCESS`
    * `FeedbackScreenView.TYPE_ERROR`
    * `FeedbackScreenView.TYPE_INFO`
* isModal: Boolean
  * Default: `true`
  * Navigation type (Flow or Modal presentation and navigation)
* title: String?
* subtitle: String?
* customContentLayout: `Int(@LayoutRes)?`
  * Custom layout to show below subtitle
* firstButtonText: String?
* secondButtonText: String?
* showSecondButtonAsLink: Boolean
  * Default: `false`
  * Displays the second button as a link button instead of a secondary button style

## Display FeedbackScreenActivity with an Intent 
It is configurable by the following **optional** intent extras:
* **EXTRA_TYPE**
  * Type: `Int(@FeedbackType)`
    * `FeedbackScreenView.TYPE_SUCCESS`
    * `FeedbackScreenView.TYPE_ERROR`
    * `FeedbackScreenView.TYPE_INFO`
  * Default: `FeedbackScreenView.TYPE_INFO`
  * Feedback type to show
* **EXTRA_IS_MODAL**
  * Type: `Boolean`
  * Default: `true`
  * Navigation type (Flow or Modal presentation and navigation)
* **EXTRA_TITLE**
  * Type: `String`
  * Default: `""`
  * Feedback title
* **EXTRA_SUBTITLE**
  * Type: `String`
  * Default: `""`
  * Feedback subtitle
* **EXTRA_CUSTOM_CONTENT**
  * Type: `Int(@LayoutRes)`
  * Default: `null`
  * Custom layout to show below subtitle
* **EXTRA_FIRST_BUTTON_TEXT**
  * Type: `String`
  * Default: `""`
  * Feedback first button text
* **EXTRA_SECOND_BUTTON_TEXT**
  * Type: `String`
  * Default: `""`
  * Second button text, if not specified or text is blank, button won't be shown.
* **EXTRA_SHOW_SECOND_BUTTON_AS_LINK**
  * Type: `Boolean`
  * Default: `false`
  * Second button is shown with link style

Appart from the configuration provided with intent extras, in order to provide runtime configuration such as different click listeners or functionality depending on custom dependencies, `FeedbackScreenActivity` can be overriden, specific configuration can be set easily by just overriding:

`applyCustomRuntimeConfiguration(feedbackScreenView: FeedbackScreenView)`

Check `FeedbackScreenCatalogActivity` that serves as example.

# FeedbackScreenView component

Implemented as a custom view, for any other kind of usage inside an screen that is not the activity or that requires fragment navigation. `FeedbackScreenView` can be used inside any layout like a regular view. It supports both **attribute configuration** and **databinding for all properties**. Default values are the same than the mentioned for the Activity component:

```xml
<declare-styleable name="FeedbackScreen">
    <attr name="feedbackType" format="enum">
        <enum name="success" value="0"/>
        <enum name="error" value="1"/>
        <enum name="info" value="2"/>
    </attr>
    <attr name="feedbackTitle" format="string"/>
    <attr name="feedbackSubtitle" format="string"/>
    <attr name="feedbackCustomContentLayout" format="reference"/>
    <attr name="feedbackFirstButtonText" format="string"/>
    <attr name="feedbackSecondButtonText" format="string"/>
    <attr name="feedbackSecondButtonAsLink" format="boolean"/>

    <attr name="feedbackFirstButtonOnClick" format="string"/>
    <attr name="feedbackSecondButtonOnClick" format="string"/>
</declare-styleable>
```
