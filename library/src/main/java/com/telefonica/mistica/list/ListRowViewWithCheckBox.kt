package com.telefonica.mistica.list

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.CheckBox
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.core.view.ViewCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.telefonica.mistica.R

class ListRowViewWithCheckBox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ListRowView(context, attrs, defStyleAttr) {

    private val checkBoxCompat: AppCompatCheckBox

    init {
        LayoutInflater.from(context).inflate(R.layout.list_row_checkbox_action, actionContainer, true)
        actionContainer.visibility = View.VISIBLE

        checkBoxCompat = actionContainer.getChildAt(0) as AppCompatCheckBox

        checkBoxCompat.isClickable = false
        checkBoxCompat.importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO

        ViewCompat.setStateDescription(this, ViewCompat.getStateDescription(checkBoxCompat))
    }

    // Utility Switch method to be used by the implementation
    fun changeCheckBoxState(newState: Boolean? = null) {
        checkBoxCompat.isChecked = newState ?: !checkBoxCompat.isChecked
        ViewCompat.setStateDescription(this, ViewCompat.getStateDescription(checkBoxCompat))
        this@ListRowViewWithCheckBox.announceForAccessibility(ViewCompat.getStateDescription(this))
    }

    fun isCheckBoxChecked() = checkBoxCompat.isChecked

    // Accessibility configuration
    override fun onInitializeAccessibilityEvent(event: AccessibilityEvent?) {
        super.onInitializeAccessibilityEvent(event)
        event?.className = CheckBox::class.java.name
    }

    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfo?) {
        super.onInitializeAccessibilityNodeInfo(info)
        info?.apply {
            className = CheckBox::class.java.name
            isCheckable = true
            addAction(
                AccessibilityNodeInfo.AccessibilityAction(
                    AccessibilityNodeInfoCompat.ACTION_CLICK,
                    resources.getString(R.string.toggle_action_click)
                )
            )
        }
    }

    // Restrict Action Layout usage
    override fun setActionLayout(layoutRes: Int, contentDescription: String?) {
        if (layoutRes != ACTION_NONE) {
            throw IllegalArgumentException(
                "You cannot add a custom Action Layout for ListRowViewWithCheckBox since this component is managing a CheckBox in that place.\n" +
                        "If you want to add a custom Action Layout you can use the generic ListRowView component instead."
            )
        }
    }

    override fun getActionView(): View? {
        throw IllegalStateException(
            "You cannot access to the custom Action Layout for ListRowViewWithCheckBox since this component is managing a CheckBox in that place.\n" +
                    "If you want to manage the Switch state, you can use the utility methods provided by the component."
        )
    }

    override fun delegateClickOnActionView() {
        Log.w(
            "ListRowViewWithCheckBox",
            "Delegate click on ActionView has no effect for ListRowViewWithCheckBox component since the component itself is intended to perform CheckBox changes."
        )
    }
}
