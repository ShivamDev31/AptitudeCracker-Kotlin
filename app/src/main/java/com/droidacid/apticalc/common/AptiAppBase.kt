package com.droidacid.apticalc.common

import android.annotation.SuppressLint
import android.app.Application
import com.droidacid.apticalc.di.Injection

/**
 * Created by shivam on 3/9/17.
 */

@SuppressLint("Registered")
open class AptiAppBase : Application() {

    companion object {
        var instance: AptiAppBase? = null
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    fun getInjection() = Injection(this)
}