package com.mobigod.shoppinglist.di

import com.mobigod.shoppinglist.SplashActivity
import com.mobigod.shoppinglist.ui.home.HomeActivity
import com.mobigod.shoppinglist.ui.home.HomeModule
import com.mobigod.shoppinglist.ui.shopping.activities.AddShoppingListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun provideSplashActivityInjector(): SplashActivity

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun provideHomeActivityInjector(): HomeActivity

    @ContributesAndroidInjector
    abstract fun provideAddShoppingListInjector(): AddShoppingListActivity

}