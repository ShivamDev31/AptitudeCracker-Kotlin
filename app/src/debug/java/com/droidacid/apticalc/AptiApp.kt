package com.droidacid.apticalc

import com.droidacid.apticalc.common.AptiAppBase
import timber.log.Timber

/**
 * Created by Adarsha on 8/9/17.
 */
//Debug
class AptiApp : AptiAppBase() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(object: Timber.DebugTree() {
            override fun createStackElementTag(element: StackTraceElement): String {
                return super.createStackElementTag(element) + ":" + element.lineNumber
            }
        })
    }
}