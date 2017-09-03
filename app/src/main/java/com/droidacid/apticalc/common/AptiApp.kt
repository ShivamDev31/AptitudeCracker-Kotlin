package com.droidacid.apticalc.common

import android.app.Application
import com.droidacid.apticalc.di.Injection

/**
 * Created by shivam on 3/9/17.
 */

class AptiApp : Application() {

    companion object {
        var instance: AptiApp? = null
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    fun getInjection() = Injection(this)
}