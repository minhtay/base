package com.example.base.ui.splash

import android.app.Activity
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.ViewTreeObserver.OnPreDrawListener
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.base.R
import com.example.base.base.BaseActivity
import com.example.base.base.BaseNavigation
import com.example.base.base.BaseViewmodel
import com.example.base.data.Preferences
import com.example.base.databinding.ActivitySplashBinding
import com.example.base.ui.wellcome.WellcomeActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.Timer
import java.util.TimerTask
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding,BaseViewmodel<BaseNavigation>>() {

    override val layoutId: Int
        get() = R.layout.activity_splash

    override fun initView() {
        if (pref.isWellcome.get()){
            // start main
        }else{
            startScreen(WellcomeActivity())
        }
    }

    override fun initData() {}

    override fun listenerAction() {
    }


}