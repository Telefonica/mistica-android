/*
 * Copyright 2013 Niek Haarman
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.telefonica.mistica.feedback.popover

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout

internal class PopOverRelativeLayout : RelativeLayout {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    /**
     * Shows a ToolTipView based on gived PopOverData at the proper location relative to given View.
     *
     * @return the ToolTipView that was created.
     */
    fun showPopOverForView(
        popOverData: PopOverData,
        targetView: View,
        tooltipPresentation: View?
    ): PopOverView {
        val toolTipView = setUpPopOver(popOverData, targetView)
        tooltipPresentation?.let { addView(it) }
        addView(toolTipView)
        return toolTipView
    }

    private fun setUpPopOver(popOverData: PopOverData, targetView: View): PopOverView {
        val toolTipView = PopOverView(context)
        toolTipView.setUpToolTip(popOverData, targetView)
        return toolTipView
    }

}