package com.droidacid.apticalc.common.mvp

/**
 * Created by shivam on 3/9/17.
 */

class BasePresenter<V : BaseView> : Presenter<V> {

    var view: V? = null

    override fun attachView(view: V) {
        this.view = view
    }

    fun isViewAttached(): Boolean {
        return view != null
    }

    fun checkViewAttached() {
        if (view == null) {
            throw MvpViewNotFoundException()
        }
    }

    override fun detachView() {
        view = null
    }

}

class MvpViewNotFoundException : Throwable("MVP view is not attached to the presenter")
