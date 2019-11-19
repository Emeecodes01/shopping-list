package com.mobigod.shoppinglist.di

import com.mobigod.shoppinglist.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun provideSplashActivityInjector(): SplashActivity


}