package com.mobigod.shoppinglist

import android.app.Application
import com.facebook.stetho.Stetho
import com.mobigod.shoppinglist.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import net.danlew.android.joda.JodaTimeAndroid
import javax.inject.Inject

class ShoppingListApp: Application(), HasAndroidInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()

        //Init Stetho
        Stetho.initializeWithDefaults(this)

        //Init Joda
        JodaTimeAndroid.init(this)

        //Inject android here
        DaggerAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }

}