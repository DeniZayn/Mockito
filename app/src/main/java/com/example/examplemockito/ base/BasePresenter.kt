package com.example.examplemockito.base

import java.lang.ref.Reference
import java.lang.ref.WeakReference

abstract class BasePresenter<V : BaseView?> {

    protected var mViewRef: Reference<V>? = null
    fun attachView(view: V) {
        mViewRef = WeakReference(view)
    }

    protected val view: V?
        protected get() = mViewRef?.get()
    val isViewAttached: Boolean
        get() = mViewRef != null && mViewRef!!.get() != null

    fun detachView() {
        if (mViewRef != null) {
            mViewRef!!.clear()
            mViewRef = null
        }
    }

    fun showLoading() {
        view?.showLoading()
    }

    fun hideLoading() {
        view?.hideLoading()
    }

    fun showToast(msg: String?) {
        view?.showToast(msg)
    }
}