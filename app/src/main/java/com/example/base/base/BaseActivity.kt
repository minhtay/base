package com.example.base.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.base.data.Preferences
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, V : BaseViewmodel<*>> : AppCompatActivity(),
    BaseNavigation, BaseFragment.Callback {

    private val imm by lazy { this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager }
    private lateinit var snackbar : Snackbar
    lateinit var binding: B
    @Inject lateinit var pref : Preferences


    @get:LayoutRes
    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.executePendingBindings()
        binding.lifecycleOwner = this
        initView()
        initData()
        listenerAction()
    }

    abstract fun initView()
    abstract fun initData()
    abstract fun listenerAction()

    fun startScreen(activity: Activity) {
        val itent = Intent(this, activity::class.java)
        startActivity(itent)
    }

    override fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null && imm.isAcceptingText) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    override fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun showSnackbar(msg: String) {
        snackbar = Snackbar.make(binding.root,msg,Snackbar.LENGTH_SHORT)
        snackbar.show()
    }

    override fun showOffline() {
    }

    override fun hideSnackbar() {
        if (snackbar.isShown){
            snackbar.dismiss()
        }
    }
}