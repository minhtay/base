package com.example.base.ui.main

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.base.BaseNavigation
import com.example.base.base.BaseViewmodel
import com.example.base.data.Preferences
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewmodel @Inject constructor(
    private val prefs: Preferences
): ViewModel() {

    val text = MutableLiveData<String>()

    fun checkWellcome(){
        viewModelScope.launch {
            if (!prefs.isWellcome.get()){
                text.value = "Firts running"
                prefs.isWellcome.set(true)
            }else{
                text.value = "Do not Firts running"
            }
        }
    }

}