package com.mobigod.shoppinglist.di

import android.app.Application
import android.content.Context
import com.mobigod.shoppinglist.ShoppingListApp
import com.mobigod.shoppinglist.data.PreferenceManager
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityBuilder::class, AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: ShoppingListApp)
}