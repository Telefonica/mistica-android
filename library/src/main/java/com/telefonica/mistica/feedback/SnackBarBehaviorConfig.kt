package com.telefonica.mistica.feedback

import androidx.annotation.VisibleForTesting

object SnackBarBehaviorConfig {

    private var areAlwaysSticky = false

    @JvmStatic
    fun areSticky(): Boolean {
        return areAlwaysSticky
    }

    @VisibleForTesting
    fun setAlwaysSticky() {
        areAlwaysSticky = true
    }
}