package com.telefonica.mistica.app

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.distribute.Distribute
import com.telefonica.mistica.app.BuildConfig

class CatalogApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        initializeAppCenterIfNeeded()
    }

    private fun initializeAppCenterIfNeeded() {
        if (!BuildConfig.APPCENTER_KEY.isNullOrEmpty() && BuildConfig.APPCENTER_KEY != "null") {
            AppCenter.start(
                this, BuildConfig.APPCENTER_KEY,
                Distribute::class.java, Analytics::class.java, Crashes::class.java
            )
            Distribute.setEnabledForDebuggableBuild(true)
        }
    }
}