# Snackbars

Snackbars allow to show contextual information usually after the user has done any action. There are two types, informative and critical and they are 
displayed during 5 seconds, 10 seconds or during an indefinite amount of time depending on the duration specified. 

<p align="center">
    <img src="../../../../../../../../doc/images/snackbars/snackbars_informative.gif">
    <img src="../../../../../../../../doc/images/snackbars/snackbars_critical.gif">
</p>

`com.telefonica.mistica.feedback.SnackbarBuilder` **allows showing snackbars** on any part of the app:
* `SnackbarBuilder(view: View, @StringRes resId: Int)`
  * Prepares a snackbar to show it over the specified view with the given string resource as message.
* `SnackbarBuilder(view: View, text: String): SnackbarBuilder`
  * Prepares a snackbar to show it over the specified view with the given string as message.

Builder allows Snackbar customization:
* `withAction(String text, OnClickListener listener)`
  * Adds an action with the given text and the given click listener.
* `withAction(@StringRes int resId, OnClickListener listener)`
  * Adds an action with the given string resource and the given click listener.
* `withCallback(Callback callback)`
  * Adds a callback for dismiss action. Dismiss action by definition will only work when using a coordinator layout as anchor view for the Snackbar.
* `withDismiss()`
  * Adds a dismiss button to the Snackbar layout. 
* `setFocusViewAfterDismiss(view: View)`
  * Specifies a view to receive accessibility focus after the Snackbar is dismissed. **Note:** This only works when the Snackbar length is 
    `INDEFINITE`.
* `setForceRequestFocus()`
  * Forces the Snackbar to request accessibility focus when shown. **Note:** This only works when the Snackbar length is `INDEFINITE`.

## Showing the Snackbar

Depending on the type of Snackbar, use one of the following methods to display it:

* `showInformative(snackbarLength: SnackbarLength)`
* `showInformative()`
* `showCritical(snackbarLength: SnackbarLength)`
* `showCritical()`

Where `SnackbarLength` has three different possible values:

* `SHORT`: 5 seconds
* `LONG`: 10 seconds
* `INDEFINITE`: The Snackbar won't dismiss unless it is done manually

If no `SnackbarLength` is provided, the following logic will be applied:

* If no action is provided: default length will be `SHORT`
* If an action is provided: default length will be `LONG`

If a `SnackbarLength` is provided, the following logic is applied:

* If `LONG` length is provided and there is no action, `SHORT` will be set instead.
* If `SHORT` length is provided and there is an action, `LONG` will be set instead.
* `INDEFINITE` length is valid with and without an action.

### Accessibility Focus

When using `INDEFINITE` snackbars, you can enhance accessibility by:

* Calling `.setFocusViewAfterDismiss(view)` to specify which view should receive accessibility focus after the Snackbar is dismissed.
* Calling `.setForceRequestFocus()` to force the Snackbar to request accessibility focus when shown, ensuring that screen readers and accessibility services announce its content immediately.

**Note:** Both methods only work when the Snackbar length is `INDEFINITE`.

Example:

```kotlin
SnackbarBuilder(triggerView, R.string.snackbar_message)
  .withDismiss()
  .setForceRequestFocus()
  .setFocusViewAfterDismiss(triggerView)
  .showInformative(SnackbarLength.INDEFINITE)