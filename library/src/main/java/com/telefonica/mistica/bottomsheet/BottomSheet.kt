package com.telefonica.mistica.bottomsheet

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.telefonica.mistica.R
import com.telefonica.mistica.bottomsheet.Children.ListWithCheckbox
import com.telefonica.mistica.bottomsheet.children.list.CheckBoxListAdapter

open class BottomSheetView(
    context: Context,
    bottomSheetModel: BottomSheetModel,
    private val onBottomSheetClicked: OnBottomSheetClicked,
    private val onDismiss: () -> Unit = {},
    private val onCancel: () -> Unit = {},
): BottomSheetDialog(context, R.style.BottomSheetDialogTheme) {

    init {
        val onBottomSheetClickedWrapped: InternalOnBottomSheetClicked = object : InternalOnBottomSheetClicked {
            override fun onTapped(childrenId: String, itemId: String) {
                onBottomSheetClicked.onTapped(this@BottomSheetView, childrenId, itemId)
            }
        }

        val root = View.inflate(getContext(), R.layout.bottom_sheet_layout, null)
        setContentView(root)
        setUpBehavior(root)
        fillData(root, bottomSheetModel, context, onBottomSheetClickedWrapped)
    }

    private fun fillData(
        root: View,
        bottomSheetModel: BottomSheetModel,
        context: Context,
        onBottomSheetClickedWrapped: InternalOnBottomSheetClicked,
    ) {
        fillHeader(root, bottomSheetModel)
        fillContent(root, bottomSheetModel, context, onBottomSheetClickedWrapped)
    }

    private fun fillHeader(
        root: View,
        bottomSheetModel: BottomSheetModel,
    ) {
        val title = root.findViewById<TextView>(R.id.title)
        val subtitle = root.findViewById<TextView>(R.id.subtitle)
        val description = root.findViewById<TextView>(R.id.description)

        val titleText = bottomSheetModel.header.title
        val subtitleText = bottomSheetModel.header.subtitle
        val descriptionText = bottomSheetModel.header.description

        title.setTextOrHideKeepingTheSpace(titleText)
        subtitle.setTextOrHide(subtitleText)
        description.setTextOrHide(descriptionText)
    }

    private fun fillContent(
        root: View,
        bottomSheetModel: BottomSheetModel,
        context: Context,
        onBottomSheetClickedWrapped: InternalOnBottomSheetClicked,
    ) {
        val container = root.findViewById<LinearLayout>(R.id.container)
        val children = bottomSheetModel.content
        children.forEach {
            container.addView(it.toView(context, onBottomSheetClickedWrapped))
        }
    }

    private fun setUpBehavior(root: View) {
        val params = (root.parent as View).layoutParams as CoordinatorLayout.LayoutParams
        val behavior = params.behavior
        if (behavior is BottomSheetBehavior<*>) {
            behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {
                    if (newState == BottomSheetBehavior.STATE_HIDDEN) {
                        dismiss()
                    }
                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {}
            })
        }
        setCanceledOnTouchOutside(true)
        setOnDismissListener { onDismiss() }
        setOnCancelListener { onCancel() }
    }
}

class BottomSheet(val context: Context){

    private var bottomSheetModel: BottomSheetModel = BottomSheetModel()
    private var onBottomSheetClicked: OnBottomSheetClicked = object: OnBottomSheetClicked {
        override fun onTapped(bottomSheet: BottomSheetView, childrenId: String, itemId: String) {}
    }
    private var onDismiss: () -> Unit = {}
    private var onCancel: () -> Unit = {}

    fun withHeader(
        title: String? = null,
        subtitle: String? = null,
        description: String? = null,
    ): BottomSheet = this.apply {
        bottomSheetModel = bottomSheetModel.copy(header = Header(title, subtitle, description))
    }

    fun withList(
        id: String,
        elements: List<RowWithCheckBox>,
    ): BottomSheet = this.apply {
        val listContent = ListWithCheckbox(id = id, elements = elements)
        bottomSheetModel = bottomSheetModel.copy(content = bottomSheetModel.content.toMutableList().also { it.add(listContent) })
    }

    fun withOnBottomSheetClickedListener(onBottomSheetClicked: OnBottomSheetClicked): BottomSheet = this.apply {
        this.onBottomSheetClicked = onBottomSheetClicked
    }

    fun withOnDismissListener(onDismiss: () -> Unit): BottomSheet = this.apply {
        this.onDismiss = onDismiss
    }

    fun withOnCancelListener(onCancel: () -> Unit): BottomSheet = this.apply {
        this.onCancel = onCancel
    }

    fun show() {
        BottomSheetView(
            context = context,
            bottomSheetModel = bottomSheetModel,
            onBottomSheetClicked = onBottomSheetClicked,
            onDismiss = onDismiss,
            onCancel = onCancel,
        ).show()
    }
}

interface OnBottomSheetClicked {
    fun onTapped(bottomSheet: BottomSheetView, childrenId: String, itemId: String)
}

internal interface InternalOnBottomSheetClicked {
    fun onTapped(childrenId: String, itemId: String)
}

private fun Children.toView(context: Context, onBottomSheetClicked: InternalOnBottomSheetClicked): View = when (this) {
    is ListWithCheckbox -> this.toView(context, onBottomSheetClicked)
}

private fun ListWithCheckbox.toView(context: Context, onBottomSheetClicked: InternalOnBottomSheetClicked): View =
    RecyclerView(context).also {
        it.layoutParams = RecyclerView.LayoutParams(
            RecyclerView.LayoutParams.MATCH_PARENT,
            RecyclerView.LayoutParams.WRAP_CONTENT
        )
        it.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        it.adapter = CheckBoxListAdapter(this.elements.mapToViewData(this.id, onBottomSheetClicked))
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