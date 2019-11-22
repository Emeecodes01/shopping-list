package com.mobigod.shoppinglist.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0018\u0010\u0015\u001a\n \u0016*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0017\u001a\u00020\bH\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\bH\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/mobigod/shoppinglist/di/AppModule;", "", "()V", "provideAppRepository", "Lcom/mobigod/shoppinglist/data/repo/Repository;", "localDSContract", "Lcom/mobigod/shoppinglist/data/source/LocalDSContract;", "provideContext", "Landroid/content/Context;", "app", "Landroid/app/Application;", "provideCoroutinesDispatchers", "Lcom/mobigod/shoppinglist/coroutines/CDispatchers;", "provideLocalDataSource", "preferenceManager", "Lcom/mobigod/shoppinglist/data/PreferenceManager;", "database", "Lcom/mobigod/shoppinglist/data/ShoppingDb;", "providePreferenceManager", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPref", "kotlin.jvm.PlatformType", "context", "provideShoppingDB", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobigod.shoppinglist.data.PreferenceManager providePreferenceManager(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobigod.shoppinglist.data.ShoppingDb provideShoppingDB(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobigod.shoppinglist.data.source.LocalDSContract provideLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.data.PreferenceManager preferenceManager, @org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.data.ShoppingDb database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobigod.shoppinglist.data.repo.Repository provideAppRepository(@org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.data.source.LocalDSContract localDSContract) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobigod.shoppinglist.coroutines.CDispatchers provideCoroutinesDispatchers() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}