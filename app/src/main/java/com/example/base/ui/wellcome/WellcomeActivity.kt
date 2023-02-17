package com.example.base.ui.wellcome

import com.example.base.R
import com.example.base.base.BaseActivity
import com.example.base.base.BaseNavigation
import com.example.base.base.BaseViewmodel
import com.example.base.databinding.ActivityWellcomeBinding

class WellcomeActivity : BaseActivity<ActivityWellcomeBinding,BaseViewmodel<BaseNavigation>>() {
    override val layoutId: Int
        get() = R.layout.activity_wellcome

    override fun initView() {
    }

    override fun initData() {
    }

    override fun listenerAction() {
    }

}