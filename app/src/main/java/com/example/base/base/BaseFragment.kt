package com.example.base.base

import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<B : ViewDataBinding, V : BaseViewmodel<*>>:Fragment(),BaseNavigation {

    interface Callback{

    }
}