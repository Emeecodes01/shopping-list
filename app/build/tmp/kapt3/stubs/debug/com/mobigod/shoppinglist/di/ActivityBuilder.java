package com.mobigod.shoppinglist.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/mobigod/shoppinglist/di/ActivityBuilder;", "", "()V", "provideAddShoppingListInjector", "Lcom/mobigod/shoppinglist/ui/shopping/activities/AddShoppingListActivity;", "provideHomeActivityInjector", "Lcom/mobigod/shoppinglist/ui/home/HomeActivity;", "provideSplashActivityInjector", "Lcom/mobigod/shoppinglist/SplashActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuilder {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.mobigod.shoppinglist.SplashActivity provideSplashActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.mobigod.shoppinglist.ui.home.HomeModule.class})
    public abstract com.mobigod.shoppinglist.ui.home.HomeActivity provideHomeActivityInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.mobigod.shoppinglist.ui.shopping.activities.AddShoppingListActivity provideAddShoppingListInjector();
    
    public ActivityBuilder() {
        super();
    }
}