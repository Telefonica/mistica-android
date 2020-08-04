# Form Inputs

<p align="center">
   <img width="30%" src="../../../../../../../doc/images/inputs/inputs1.png" />
   <img width="30%" src="../../../../../../../doc/images/inputs/inputs2.png" />
</p>

There are three input types, for each one, a component is provided:
* Text Inputs --> `com.telefonica.mistica.input.TextInput`
* Check Box Input --> `com.telefonica.mistica.input.CheckBoxInput`
* Drop Down Input --> `com.telefonica.mistica.input.DropDownInput`

All them can be placed directly on any layout, and can be configured with the following attributes (**All atributes for all types support databinding**):

```xml
<declare-styleable name="Input">
    <attr name="inputHint" format="string" />
    <attr name="inputError" format="string" />
    <attr name="inputHelperText" format="string" />
    <attr name="inputEnabled" format="boolean" />
    <attr name="inputInverse" format="boolean" />
</declare-styleable>
```

`com.telefonica.mistica.input.TextInput` supports additionally the following configuration:

```xml
<declare-styleable name="TextInput">
    <attr name="inputType" format="integer">
        <enum name="text" value="0" />
        <enum name="email" value="1" />
        <enum name="password" value="2" />
        <enum name="textArea" value="3" />
        <enum name="phone" value="4" />
    </attr>
    <attr name="inputText" format="string" /> <!-- Supports inverse databinding -->
    <attr name="inputCounterEnabled" format="boolean" />
    <attr name="inputMaxLength" format="integer" />
    <attr name="inputAutofillEnabled" format="boolean" />
</declare-styleable>
```

And `com.telefonica.mistica.input.CheckBoxInput` provides also:

```xml
<declare-styleable name="CheckBoxInput">
    <attr name="inputChecked" format="boolean" /> <!-- Supports inverse databinding -->
    <attr name="inputCheckText" format="string" />
</declare-styleable>
```
