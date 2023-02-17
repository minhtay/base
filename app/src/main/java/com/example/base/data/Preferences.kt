package com.example.base.data

import com.f2prateek.rx.preferences2.RxSharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Preferences @Inject constructor(
    private val rxPref: RxSharedPreferences) {

    companion object{
        const val keyWellcome = "IS_WELLCOME"
    }

    val isWellcome = rxPref.getBoolean(keyWellcome,false)
}