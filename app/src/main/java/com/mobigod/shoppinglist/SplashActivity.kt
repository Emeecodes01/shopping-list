package com.mobigod.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobigod.shoppinglist.data.PreferenceManager
import dagger.android.AndroidInjection
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var preferenceManager: PreferenceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_start)

    }
}
