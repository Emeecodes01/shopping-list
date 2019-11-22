package com.mobigod.shoppinglist.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.mobigod.shoppinglist.coroutines.CDispatchers
import com.mobigod.shoppinglist.data.PreferenceManager
import com.mobigod.shoppinglist.data.repo.Repository
import com.mobigod.shoppinglist.data.ShoppingDb
import com.mobigod.shoppinglist.data.source.LocalDSContract
import com.mobigod.shoppinglist.data.source.LocalDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: Application): Context = app


    @Provides
    @Singleton
    fun provideSharedPref(context: Context) =
        context.getSharedPreferences("shopping_list", Context.MODE_PRIVATE)


    @Provides
    @Singleton
    fun providePreferenceManager(sharedPreferences: SharedPreferences)
    = PreferenceManager(sharedPreferences)


    @Provides
    @Singleton
    fun provideShoppingDB(context: Context) = ShoppingDb.getAppDataBase(context)

    @Provides
    @Singleton
    fun provideLocalDataSource(preferenceManager: PreferenceManager, database: ShoppingDb): LocalDSContract {
        return LocalDataSource(preferenceManager, database)
    }

    @Provides
    @Singleton
    fun provideAppRepository(localDSContract: LocalDSContract)
     = Repository(localDSContract)

    @Provides
    @Singleton
    fun provideCoroutinesDispatchers() = CDispatchers()


}