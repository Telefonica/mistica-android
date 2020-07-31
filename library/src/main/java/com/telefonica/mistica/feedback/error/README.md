# Load Error Feedback component

<p align="center">
   <img>[[../../../../../../../../../doc/images/load_error_feedback/load_feedback_error.png]]</img>
</p>

Implemented as a custom view, `LoadErrorFeedbackView` can be used inside any layout like a regular view. It supports both **attribute configuration** and **databinding for all properties**.

```xml
<declare-styleable name="LoadErrorFeedback">
    <attr name="loadErrorFeedbackTitle" format="string"/>
    <attr name="loadErrorFeedbackDescription" format="string"/>
    <attr name="loadErrorFeedbackButtonText" format="string"/>
    <attr name="loadErrorFeedbackButtonOnClick" format="string"/>
    <attr name="loadErrorFeedbackIsLoading" format="boolean"/>
</declare-styleable>
```
