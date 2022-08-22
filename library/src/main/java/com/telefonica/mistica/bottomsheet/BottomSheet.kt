package com.telefonica.mistica.bottomsheet

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.telefonica.mistica.R
import com.telefonica.mistica.bottomsheet.Children.ListWithCheckbox
import com.telefonica.mistica.bottomsheet.children.list.CheckBoxListAdapter

class BottomSheetView(
    context: Context,
    children: List<Children>,
    private val onBottomSheetClicked: OnBottomSheetClicked,
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
        val container = root.findViewById<LinearLayout>(R.id.container)
        children.forEach {
            container.addView(it.toView(context, onBottomSheetClickedWrapped))
        }
    }

    private fun setUpBehavior(root: View) {
        val params = (root.parent as View).layoutParams as CoordinatorLayout.LayoutParams
        val behavior = params.behavior
        if (behavior is BottomSheetBehavior<*>) {
            behavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {
                    if (newState == BottomSheetBehavior.STATE_HIDDEN) {
                        dismiss()
                    }
                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {}
            })
        }
    }
}

class BottomSheet(val context: Context){

    private val children = mutableListOf<Children>()

    private var onBottomSheetClicked: OnBottomSheetClicked = object: OnBottomSheetClicked {
        override fun onTapped(bottomSheet: BottomSheetView, childrenId: String, itemId: String) {}
    }

    fun withList(listChildren: ListWithCheckbox): BottomSheet = this.apply {
        children.add(listChildren)
    }

    fun withOnBottomSheetClickedListener(onBottomSheetClicked: OnBottomSheetClicked): BottomSheet = this.apply {
        this.onBottomSheetClicked = onBottomSheetClicked
    }

    fun show() {
        BottomSheetView(context, children, onBottomSheetClicked)
            .show()
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