package com.telefonica.mistica.sheet

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Space
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.lifecycle.setViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.telefonica.mistica.R
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.list.MisticaRecyclerView
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout
import com.telefonica.mistica.sheet.Children.BottomActions
import com.telefonica.mistica.sheet.Children.ListActions
import com.telefonica.mistica.sheet.Children.ListInformative
import com.telefonica.mistica.sheet.Children.ListSingleSelection
import com.telefonica.mistica.sheet.children.list.adapter.ActionsListAdapter
import com.telefonica.mistica.sheet.children.list.adapter.InformativeListAdapter
import com.telefonica.mistica.sheet.children.list.adapter.SelectableListAdapter

open class SheetView(
    context: Context,
    sheetModel: SheetModel,
    private val onSheetTapped: onSheetTapped,
    private val onDismiss: () -> Unit = {},
    private val onCancel: () -> Unit = {},
): BottomSheetDialog(context, R.style.SheetDialogTheme) {

    init {
        initViewTreeOwners()
        val onSheetTappedWrapped: InternalOnSheetTapped = object : InternalOnSheetTapped {
            override fun onTapped(childrenId: String, itemId: String) {
                onSheetTapped.onTapped(this@SheetView, childrenId, itemId)
            }
        }

        val root = View.inflate(getContext(), R.layout.sheet_layout, null)
        setContentView(root)
        setUpBehavior(root)
        fillData(root, sheetModel, context, onSheetTappedWrapped)
    }

    private fun initViewTreeOwners() {
        val activity = extractActivity(context)
        val decorView = window?.decorView
        decorView?.setViewTreeLifecycleOwner(activity as? LifecycleOwner)
        decorView?.setViewTreeViewModelStoreOwner(activity as? ViewModelStoreOwner)
        decorView?.setViewTreeSavedStateRegistryOwner(activity as? SavedStateRegistryOwner)
    }

    private fun extractActivity(context: Context?): Activity? {
        var currentContext = context
        while (currentContext != null) {
            if (currentContext is Activity) return currentContext
            if (currentContext !is ContextWrapper) break
            currentContext = currentContext.baseContext
        }
        return null
    }

    private fun fillData(
        root: View,
        sheetModel: SheetModel,
        context: Context,
        onSheetTappedWrapped: InternalOnSheetTapped,
    ) {
        fillHeader(root, sheetModel)
        fillContent(root, sheetModel, context, onSheetTappedWrapped)
    }

    private fun fillHeader(
        root: View,
        sheetModel: SheetModel,
    ) {
        val title = root.findViewById<TextView>(R.id.title)
        val subtitle = root.findViewById<TextView>(R.id.subtitle)
        val description = root.findViewById<TextView>(R.id.description)
        val titleSpace =  root.findViewById<Space>(R.id.title_space)

        val titleText = sheetModel.header.title
        val subtitleText = sheetModel.header.subtitle
        val descriptionText = sheetModel.header.description

        title.setTextOrHide(titleText)
        titleSpace.setSpaceOrGone(titleText)
        subtitle.setTextOrHide(subtitleText)
        description.setTextOrHide(descriptionText)
    }

    private fun fillContent(
        root: View,
        sheetModel: SheetModel,
        context: Context,
        onSheetTappedWrapped: InternalOnSheetTapped,
    ) {
        val container = root.findViewById<LinearLayout>(R.id.container)
        val children = sheetModel.content
        children.forEach {
            container.addView(it.toView(context, onSheetTappedWrapped, container))
        }
    }

    private fun setUpBehavior(root: View) {
        val params = (root.parent as View).layoutParams as CoordinatorLayout.LayoutParams
        val behavior: CoordinatorLayout.Behavior<View>? = params.behavior
        if (behavior is BottomSheetBehavior<*>) {
            behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {
                    if (newState == BottomSheetBehavior.STATE_HIDDEN) {
                        dismiss()
                    }
                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {}
            })

            context.resources?.displayMetrics?.heightPixels?.let { height ->
                behavior.maxHeight = (height * 0.7).toInt()
            }
        }
        setCanceledOnTouchOutside(true)
        setOnDismissListener { onDismiss() }
        setOnCancelListener { onCancel() }
    }

}

class Sheet(val context: Context){

    private var sheetModel: SheetModel = SheetModel()
    private var onSheetTapped: onSheetTapped = object: onSheetTapped {
        override fun onTapped(sheetView: SheetView, childrenId: String, itemId: String) {}
    }
    private var onDismiss: () -> Unit = {}
    private var onCancel: () -> Unit = {}

    fun withHeader(
        title: String? = null,
        subtitle: String? = null,
        description: String? = null,
    ): Sheet = this.apply {
        sheetModel = sheetModel.copy(header = Header(title, subtitle, description))
    }

    fun withSelectableList(
        id: String,
        elements: List<RowSelectable>,
    ): Sheet = this.apply {
        val listContent = ListSingleSelection(id = id, elements = elements)
        sheetModel = sheetModel.copy(content = sheetModel.content.toMutableList().also { it.add(listContent) })
    }

    fun withActionsList(
        id: String,
        elements: List<RowAction>,
    ): Sheet = this.apply {
        val listContent = ListActions(id = id, elements = elements)
        sheetModel = sheetModel.copy(content = sheetModel.content.toMutableList().also { it.add(listContent) })
    }

    fun withInformativeList(
        id: String,
        elements: List<RowInformative>,
    ): Sheet = this.apply {
        val listContent = ListInformative(id = id, elements = elements)
        sheetModel = sheetModel.copy(content = sheetModel.content.toMutableList().also { it.add(listContent) })
    }

    fun withBottomActions(
        id: String,
        primaryButton: ActionButton,
        secondaryButton: ActionButton? = null,
        linkButton: ActionButton? = null,
    ): Sheet = this.apply {
        val listActionButtons = BottomActions(id = id, primaryButton = primaryButton, secondaryButton = secondaryButton, linkButton = linkButton)
        sheetModel = sheetModel.copy(content = sheetModel.content.toMutableList().also { it.add(listActionButtons) })
    }

    fun withOnSheetTappedListener(onSheetTapped: onSheetTapped): Sheet = this.apply {
        this.onSheetTapped = onSheetTapped
    }

    fun withOnDismissListener(onDismiss: () -> Unit): Sheet = this.apply {
        this.onDismiss = onDismiss
    }

    fun withOnCancelListener(onCancel: () -> Unit): Sheet = this.apply {
        this.onCancel = onCancel
    }

    fun show() {
        SheetView(
            context = context,
            sheetModel = sheetModel,
            onSheetTapped = onSheetTapped,
            onDismiss = onDismiss,
            onCancel = onCancel,
        ).show()
    }
}

interface onSheetTapped {
    fun onTapped(sheetView: SheetView, childrenId: String, itemId: String)
}

internal interface InternalOnSheetTapped {
    fun onTapped(childrenId: String, itemId: String)
}

private fun Children.toView(context: Context, onSheetTapped: InternalOnSheetTapped, container: ViewGroup): View = when (this) {
    is ListSingleSelection -> this.toView(context, onSheetTapped)
    is ListActions -> this.toView(context, onSheetTapped)
    is ListInformative -> this.toView(context)
    is BottomActions -> this.toView(context, onSheetTapped, container)
}

private fun ListSingleSelection.toView(context: Context, onSheetTapped: InternalOnSheetTapped): View =
    MisticaRecyclerView(context).also {
        it.configureWithFullWidthLayout()
        it.adapter = SelectableListAdapter(this.elements.mapToSelectableViewData(this.id, onSheetTapped))
    }

private fun ListActions.toView(context: Context, onSheetTapped: InternalOnSheetTapped): View =
    RecyclerView(context).also {
        it.layoutManager = LinearLayoutManager(context)
        it.adapter = ActionsListAdapter(this.elements.mapToActionViewData(this.id, onSheetTapped))
    }

private fun ListInformative.toView(context: Context): View =
    RecyclerView(context).also {
        it.layoutManager = LinearLayoutManager(context)
        it.adapter = InformativeListAdapter(this.elements.mapToInformativeViewData())
    }

private fun BottomActions.toView(context: Context, onSheetTapped: InternalOnSheetTapped, container: ViewGroup): View {
    return LayoutInflater.from(context).inflate(R.layout.sheet_bottom_actions, container, false)
        .also { view ->
            setBottomActionsContent(view, onSheetTapped)
        }
}

private fun BottomActions.setBottomActionsContent(
    view: View,
    onSheetTapped: InternalOnSheetTapped,
) {
    val primaryButton = view.findViewById<Button>(R.id.sheet_action_primary_button)
    val secondaryButton = view.findViewById<Button>(R.id.sheet_action_secondary_button)
    val linkButton = view.findViewById<com.telefonica.mistica.button2.Button>(R.id.sheet_action_link_button)
    primaryButton.text = this.primaryButton.title
    primaryButton.setOnClickListener {
        onSheetTapped.onTapped(this.id, "PRIMARY")
    }
    secondaryButton.visibility = this.secondaryButton?.let { button ->
        secondaryButton?.text = button.title
        secondaryButton.setOnClickListener {
            onSheetTapped.onTapped(this.id, "SECONDARY")
        }
        View.VISIBLE
    } ?: View.GONE
    linkButton.visibility = this.linkButton?.let { button ->
        linkButton?.text = button.title
        linkButton.setOnClickListener {
            onSheetTapped.onTapped(this.id, "LINK")
        }
        linkButton?.withChevron = button.withChevron
        View.VISIBLE
    } ?: View.GONE
}

private fun TextView.setTextOrHide(text: String?) {
    if (text.isNullOrEmpty()) {
        this.visibility = View.GONE
    } else {
        this.text = text
    }
}

private fun Space.setSpaceOrGone(text: String?) {
    if (text.isNullOrEmpty()) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}