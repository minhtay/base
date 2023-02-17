package com.example.base.ui.main

import androidx.activity.viewModels
import com.example.base.R
import com.example.base.base.BaseActivity
import com.example.base.base.BaseViewmodel
import com.example.base.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, BaseViewmodel<*>>() {

    private val viewmodel : MainViewmodel by viewModels()

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initView() {
        binding.viewmodel = viewmodel
        viewmodel.checkWellcome()

    }

    override fun initData() {
    }

    override fun listenerAction() {
    }

}