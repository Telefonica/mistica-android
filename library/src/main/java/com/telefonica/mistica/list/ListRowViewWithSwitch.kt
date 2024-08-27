package com.telefonica.mistica.list

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Switch
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.ViewCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.telefonica.mistica.R

class ListRowViewWithSwitch @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ListRowView(context, attrs, defStyleAttr) {

    private val switchCompat: SwitchCompat

    init {
        LayoutInflater.from(context).inflate(R.layout.list_row_switch_action, actionContainer, true)
        actionContainer.visibility = View.VISIBLE

        switchCompat = actionContainer.getChildAt(0) as SwitchCompat

        switchCompat.isClickable = false
        switchCompat.importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO

        ViewCompat.setStateDescription(this, ViewCompat.getStateDescription(switchCompat))
    }

    // Utility Switch method to be used by the implementation
    fun changeSwitchState(newState: Boolean? = null) {
        switchCompat.isChecked = newState ?: !switchCompat.isChecked
        ViewCompat.setStateDescription(this, ViewCompat.getStateDescription(switchCompat))
        //this@ListRowViewWithSwitch.announceForAccessibility(ViewCompat.getStateDescription(this))
    }

    fun isSwitchChecked() = switchCompat.isChecked

    // Accessibility configuration
    override fun onInitializeAccessibilityEvent(event: AccessibilityEvent?) {
        super.onInitializeAccessibilityEvent(event)
        event?.className = Switch::class.java.name
    }

    override fun onInitializeAccessibilityNodeInfo(info: AccessibilityNodeInfo?) {
        super.onInitializeAccessibilityNodeInfo(info)
        info?.apply {
            className = Switch::class.java.name
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
                "You cannot add a custom Action Layout for ListRowViewWithSwitch since this component is managing a Switch in that place.\n" +
                        "If you want to add a custom Action Layout you can use the generic ListRowView component instead."
            )
        }
    }

    override fun getActionView(): View? {
        throw IllegalStateException(
            "You cannot access to the custom Action Layout for ListRowViewWithSwitch since this component is managing a Switch in that place.\n" +
                    "If you want to manage the Switch state, you can use the utility methods provided by the component."
        )
    }

    override fun delegateClickOnActionView() {
        Log.w(
            "ListRowViewWithSwitch",
            "Delegate click on ActionView has no effect for ListRowViewWithSwitch component since the component itself is intended to perform Switch changes."
        )
    }
}
