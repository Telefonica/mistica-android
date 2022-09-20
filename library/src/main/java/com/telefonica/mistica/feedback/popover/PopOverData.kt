/*
 * Copyright 2013 Niek Haarman
 *
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

import androidx.annotation.AttrRes
import androidx.annotation.DrawableRes
import com.telefonica.mistica.R

internal data class PopOverData(
    val description: String? = null,
    val title: String? = null,
    val animationType: Int = ANIMATIONTYPE_FROMMASTERVIEW,
    val maxWidth: Int = 0,
    val extraMarginForTip: Int = 0,
    val animationDuration: Long = 0,
    val imageRes: Int? = null,
    val margin: Int = 0,
    val theme: PopOverTheme = PopOverTheme,
    val dismissButtonContentDescription: String? = null,
    val position: PopOverView.Position? = null,
) {
    companion object {
        const val ANIMATIONTYPE_FROMMASTERVIEW = 101
        const val ANIMATIONTYPE_FROMTOP = 102
    }
}

internal object PopOverTheme {
    @DrawableRes
    val topTip: Int = R.drawable.icn_arrow_popover_up

    @DrawableRes
    val bottomTip: Int = R.drawable.icn_arrow_popover_down

    @DrawableRes
    val closeButton = R.drawable.icn_cross

    @AttrRes
    val textColor = R.attr.colorTextPrimary
}