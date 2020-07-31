A Popover can be used to display some content on top of another.

<p align="center">
    <img src="../../../../../../../../doc/images/popovers/popover-3.gif">
</p>

`FeedbackProvider` injectable class, **allows showing pop overs** on any part of the app:

```kotlin
popOver(targetView: View): PopOver
```
Returns a PopOver class, which most relevant functions are:

```kotlin
setTitle(@StringRes stringId: Int): PopOver
setTitle(string: String): PopOver
setImage(@DrawableRes imageRes: Int): PopOver
setDescription(@StringRes stringId: Int): PopOver
setDescription(string: String): PopOver
setListener(listener: PopOverClickListener): PopOver

show(activity: Activity): PopOver
show(containerView: View): PopOver

hide(): Unit
```

A pop over can contain an image. It's size should be 40x40dp:
<p align="center">
    <img src="../../../../../../../../doc/images/popovers/popover-1.gif">
</p>


A pop over anchored in a view will be shown above it, unless there is no space enough, then it will be shown below automatically:

<p align="center">
    <img src="../../../../../../../../doc/images/popovers/popover-3.gif">
</p>
