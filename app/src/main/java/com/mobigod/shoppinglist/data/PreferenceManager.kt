package com.mobigod.shoppinglist.data

import android.content.SharedPreferences

class PreferenceManager(val sharedPreferences: SharedPreferences){

    var isFirstTime: Boolean = true
    set(value) {
        field = value
        sharedPreferences.edit().putBoolean(FIRST_TIME_KEY, value).apply()
    }
    get() {
        return sharedPreferences.getBoolean(FIRST_TIME_KEY, true)
    }


    companion object {
        const val FIRST_TIME_KEY = "first-time-key"
    }
}