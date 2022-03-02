package com.example.examplemockito.base

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun showToast(msg: String?)
}