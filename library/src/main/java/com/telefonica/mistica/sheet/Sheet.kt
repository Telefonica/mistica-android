package com.telefonica.mistica.sheet

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.telefonica.mistica.R
import com.telefonica.mistica.list.MisticaRecyclerView
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout
import com.telefonica.mistica.sheet.Children.ListWithCheckbox
import com.telefonica.mistica.sheet.children.list.SelectableListAdapter

open class SheetView(
    context: Context,
    sheetModel: SheetModel,
    private val onSheetTapped: onSheetTapped,
    private val onDismiss: () -> Unit = {},
    private val onCancel: () -> Unit = {},
): BottomSheetDialog(context, R.style.SheetDialogTheme) {

    init {
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

        val titleText = sheetModel.header.title
        val subtitleText = sheetModel.header.subtitle
        val descriptionText = sheetModel.header.description

        title.setTextOrHideKeepingTheSpace(titleText)
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
            container.addView(it.toView(context, onSheetTappedWrapped))
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

            context?.resources?.displayMetrics?.heightPixels?.let { height ->
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
        override fun onTapped(sheet: SheetView, childrenId: String, itemId: String) {}
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

    fun withList(
        id: String,
        elements: List<RowWithCheckBox>,
    ): Sheet = this.apply {
        val listContent = ListWithCheckbox(id = id, elements = elements)
        sheetModel = sheetModel.copy(content = sheetModel.content.toMutableList().also { it.add(listContent) })
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

private fun Children.toView(context: Context, onSheetTapped: InternalOnSheetTapped): View = when (this) {
    is ListWithCheckbox -> this.toView(context, onSheetTapped)
}

private fun ListWithCheckbox.toView(context: Context, onSheetTapped: InternalOnSheetTapped): View =
    MisticaRecyclerView(context).also {
        it.configureWithFullWidthLayout()
        it.adapter = SelectableListAdapter(this.elements.mapToViewData(this.id, onSheetTapped))
    }

private fun TextView.setTextOrHide(text: String?) {
    if (text.isNullOrEmpty()) {
        this.visibility = View.GONE
    } else {
        this.text = text
    }
}

private fun TextView.setTextOrHideKeepingTheSpace(text: String?) {
    if (text.isNullOrEmpty()) {
        this.visibility = View.INVISIBLE
    } else {
        this.text = text
    }
}