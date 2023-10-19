# Snackbars

Snackbars allow to show contextual information usually after the user has done any action. There are two types, informative and critical and they are 
displayed during 5 seconds, 10 seconds or during an indefinite amount of time depending on the duration specified. 

<p align="center">
    <img src="../../../../../../../../doc/images/snackbars/snackbars_informative.gif">
    <img src="../../../../../../../../doc/images/snackbars/snackbars_critical.gif">
</p>

`com.telefonica.mistica.feedback.SnackbarBuilder` **allows showing snackbars** on any part of the app:
* `SnackbarBuilder(view: View, @StringRes resId: Int)`
  * Prepares an snackbar to show it over the specified view with given string resource as message
* `SnackbarBuilder(view: View, text: String): SnackbarBuilder`
  * Prepares an snackbar to show it over the specified view with given string as message. 

Builder allows SnackBar customization:
* `withAction(String text, OnClickListener listener)`
  * Adds an action with the given text and the given click listener
* `withAction(@StringRes int resId, OnClickListener listener)`
  * Adds an action with the given string resource and the given click listener
* `withCallback(Callback callback)`
  * Adds a callback for dismiss action. Dismiss action by definition will only work when using a coordinator layout as anchor view for the SnackBar.
* `isDismissible()`
  * Adds a dismiss button to the Snackbar layout. 

Finally, depending on the type of SnackBar, use one of the following methods to display it:
* `showInformative(snackbarLength: SnackbarLength? = null)`
* `showCritical(snackbarLength: SnackbarLength? = null)`

Where `SnackbarLength` has three different possible values:
* `SHORT`: 5 seconds
* `LONG`: 10 seconds
* `INDEFINITE`: The Snackbar won't dismiss unless it is done manually

If no `SnackbarLength` is provided, the following logic will be applied:
* If no action is provided: default length will be `SHORT`
* If an action is provided: default length will be `LONG`
