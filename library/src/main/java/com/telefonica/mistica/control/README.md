# Controls

Switches, Checkboxes and Radiobuttons are implemented using Material components and using our theme to tint them. To use them, just add the Material components:

```xml
<androidx.appcompat.widget.SwitchCompat
    android:id="@+id/switch1"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Switch" />

<androidx.appcompat.widget.AppCompatCheckBox
    android:id="@+id/checkBox"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="CheckBox" />

<androidx.appcompat.widget.AppCompatRadioButton
    android:id="@+id/radiobutton"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Radio button" />
```