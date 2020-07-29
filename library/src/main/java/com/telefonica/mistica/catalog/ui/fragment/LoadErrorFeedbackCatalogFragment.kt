package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.telefonica.mistica.R
import com.telefonica.mistica.feedback.error.LoadErrorFeedbackView

class LoadErrorFeedbackCatalogFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.screen_fragment_load_error_feedback_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<LoadErrorFeedbackView>(R.id.load_error_feedback).apply {
            setButtonClickListener {
                setIsLoading(true)
                handler.postDelayed({ setIsLoading(false) }, RETRY_DELAY)
            }
        }
    }

    private companion object {
        const val RETRY_DELAY = 2000L
    }
}