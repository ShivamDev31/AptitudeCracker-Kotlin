package com.droidacid.apticalc

import com.crashlytics.android.Crashlytics
import com.droidacid.apticalc.common.AptiAppBase
import com.droidacid.apticalc.log.ReleaseTree
import io.fabric.sdk.android.Fabric
import timber.log.Timber

//Release
/**
 * Created by Adarsha on 8/9/17.
 */
class AptiApp : AptiAppBase() {

    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())
        Timber.plant(ReleaseTree())
    }
}