package com.example.base.ui.main

import android.os.Bundle
import android.view.View
import com.example.base.R
import com.example.base.base.BaseDialog
import com.example.base.databinding.DialogMainBinding

class MainDialog: BaseDialog<DialogMainBinding>() {
    override val layoutId: Int
        get() = R.layout.dialog_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgTest.setImageResource(resources.getDrawable(R.mipmap.ic_launcher))
    }
}