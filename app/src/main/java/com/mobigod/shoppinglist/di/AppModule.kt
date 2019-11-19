package com.mobigod.shoppinglist.di

import android.content.Context
import android.content.SharedPreferences
import com.mobigod.shoppinglist.data.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(context: Context) = context

    @Provides
    @Singleton
    fun provideSharedPref(context: Context) =
        context.getSharedPreferences("shopping_list", Context.MODE_PRIVATE)

    @Provides
    @Singleton
    fun providePreferenceManager(sharedPreferences: SharedPreferences)
    = PreferenceManager(sharedPreferences)


}