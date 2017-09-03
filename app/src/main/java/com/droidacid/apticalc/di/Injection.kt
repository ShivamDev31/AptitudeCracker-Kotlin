package com.droidacid.apticalc.di

import android.content.Context

/**
 * Created by shivam on 3/9/17.
 */

class Injection(val context: Context) {

    fun provideContext() = context

}