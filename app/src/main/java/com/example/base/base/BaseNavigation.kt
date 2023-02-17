package com.example.base.base

interface BaseNavigation {

    fun showToast(msg: String)

    fun showSnackbar(msg:String)

    fun showOffline()

    fun hideSnackbar()

    fun hideKeyboard()

}