# com.telefonica.mistica.Button
Button which is composed of the following elements
- Text
- Loading Text
- Icon
- Progress bar

## Xml Attributes
- `text` [String] : Text to show in normal state
- `loadingText` [String] - Text to show in loading state
- `isLoading` [Boolean] - Flag to show/hide loading state
- `style` [Enum] - Value to set the button style PRIMARY
    - PRIMARY
    - PRIMARY_SMALL
    - SECONDARY
    - SECONDARY_SMALL
    - DANGER
    - DANGER_SMALL
    - LINK
    - PRIMARY_INVERSE
    - PRIMARY_SMALL_INVERSE
    - SECONDARY_INVERSE
    - SECONDARY_SMALL_INVERSE
    - LINK_INVERSE
- `enabled` [Boolean] - Flag to enabled/disabled view
- `icon` [Int] - Icon drawable resource

## Functions
We can modify all element attributes by code
In addition we have next functions
- setOnClickListener
- setEnabled
