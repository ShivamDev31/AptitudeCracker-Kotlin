package com.droidacid.apticalc.common.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife

/**
 * Created by shivam on 3/9/17.
 */
abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        attachView()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(getLayout(), container, false)
        ButterKnife.bind(this, view)
        return view
    }

    abstract fun attachView()

    abstract fun getLayout(): Int

    fun setupToolbar() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        destroyView()
    }

    abstract fun destroyView()


}