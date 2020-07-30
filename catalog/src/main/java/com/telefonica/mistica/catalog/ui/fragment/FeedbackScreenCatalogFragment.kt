package com.telefonica.mistica.catalog.ui.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.activity.FeedbackScreenCatalogActivity
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView.FeedbackType

class FeedbackScreenCatalogFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.screen_fragment_feedback_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val typeSpinner: Spinner = view.findViewById(R.id.spinner_feedback_type)
        val inputTitle: EditText = view.findViewById(R.id.input_feedback_title)
        val inputSubtitle: EditText = view.findViewById(R.id.input_feedback_subtitle)
        val inputFirstButtonText: EditText = view.findViewById(R.id.input_feedback_first_button)
        val inputSecondButtonText: EditText = view.findViewById(R.id.input_feedback_second_button)
        val checkBoxSecondButtonAsLink: CheckBox = view.findViewById(R.id.check_feedback_second_button_as_link)
        val checkBoxIsModal: CheckBox = view.findViewById(R.id.check_feedback_is_modal)
        val createButton: Button = view.findViewById(R.id.button_create_feedback)

        typeSpinner.adapter = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, Type.values().map { it.name }).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        createButton.setOnClickListener {
            showFeedbackActivity(
                type = Type.valueOf(typeSpinner.selectedItem as String).type,
                context = view.context,
                isModal = checkBoxIsModal.isChecked,
                title = inputTitle.toNullableString(),
                subtitle = inputSubtitle.toNullableString(),
                firstButtonText = inputFirstButtonText.toNullableString(),
                secondButtonText = inputSecondButtonText.toNullableString(),
                showSecondButtonAsLink = checkBoxSecondButtonAsLink.isChecked
            )
        }
    }

    private fun showFeedbackActivity(
        context: Context,
        @FeedbackType type: Int,
        isModal: Boolean = FeedbackScreenCatalogActivity.IS_MODAL_DEFAULT_VALUE,
        title: String?,
        subtitle: String?,
        @LayoutRes customContentLayout: Int = FeedbackScreenCatalogActivity.INVALID_DEFAULT_VALUE,
        firstButtonText: String?,
        secondButtonText: String?,
        showSecondButtonAsLink: Boolean = FeedbackScreenCatalogActivity.SHOW_SECOND_BUTTON_AS_LINK_DEFAULT_VALUE
    ) {
        Intent(context, FeedbackScreenCatalogActivity::class.java).apply {
            putExtra(FeedbackScreenCatalogActivity.EXTRA_TYPE, type)
            putExtra(FeedbackScreenCatalogActivity.EXTRA_TITLE, title)
            putExtra(FeedbackScreenCatalogActivity.EXTRA_SUBTITLE, subtitle)
            putExtra(FeedbackScreenCatalogActivity.EXTRA_FIRST_BUTTON_TEXT, firstButtonText)
            putExtra(FeedbackScreenCatalogActivity.EXTRA_SECOND_BUTTON_TEXT, secondButtonText)
            putExtra(FeedbackScreenCatalogActivity.EXTRA_CUSTOM_CONTENT, customContentLayout)
            putExtra(FeedbackScreenCatalogActivity.EXTRA_SHOW_SECOND_BUTTON_AS_LINK, showSecondButtonAsLink)
            putExtra(FeedbackScreenCatalogActivity.EXTRA_IS_MODAL, isModal)
            context.startActivity(this)
        }
    }

    private fun EditText.toNullableString(): String? = this.text.toString()

    private enum class Type(@FeedbackType val type: Int) {
        SUCCESS(FeedbackScreenView.TYPE_SUCCESS),
        ERROR(FeedbackScreenView.TYPE_ERROR),
        INFO(FeedbackScreenView.TYPE_INFO)
    }
}