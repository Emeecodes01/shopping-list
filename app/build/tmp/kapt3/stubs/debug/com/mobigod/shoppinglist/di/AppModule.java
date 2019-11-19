package com.mobigod.shoppinglist.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\t0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/mobigod/shoppinglist/di/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "context", "providePreferenceManager", "Lcom/mobigod/shoppinglist/data/PreferenceManager;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPref", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
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
    
    public AppModule() {
        super();
    }
}