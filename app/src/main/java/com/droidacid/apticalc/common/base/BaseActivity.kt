package com.droidacid.apticalc.common.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import butterknife.ButterKnife
import com.droidacid.apticalc.R
import timber.log.Timber

/**
 * Created by shivam on 3/9/17.
 */

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        ButterKnife.bind(this)
        attachView()
    }

    abstract fun attachView()

    abstract fun getLayout(): Int

    fun setupToolbar() {

    }

    override fun onDestroy() {
        super.onDestroy()
        destroyView()
    }

    abstract fun destroyView()

}