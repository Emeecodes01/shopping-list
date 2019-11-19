package com.mobigod.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.mobigod.shoppinglist.data.PreferenceManager
import com.mobigod.shoppinglist.ui.home.HomeActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var preferenceManager: PreferenceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_start)


        Handler().postDelayed({
            if (preferenceManager.isFirstTime){
                HomeActivity.start(this)
            }
        }, 2000L)

    }
}
