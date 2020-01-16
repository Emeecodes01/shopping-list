package com.mobigod.shoppinglist.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/mobigod/shoppinglist/data/source/LocalDataSource;", "Lcom/mobigod/shoppinglist/data/source/LocalDSContract;", "preferenceManager", "Lcom/mobigod/shoppinglist/data/PreferenceManager;", "db", "Lcom/mobigod/shoppinglist/data/ShoppingDb;", "(Lcom/mobigod/shoppinglist/data/PreferenceManager;Lcom/mobigod/shoppinglist/data/ShoppingDb;)V", "getDb", "()Lcom/mobigod/shoppinglist/data/ShoppingDb;", "getPreferenceManager", "()Lcom/mobigod/shoppinglist/data/PreferenceManager;", "getShoppingList", "", "Lcom/mobigod/shoppinglist/data/models/ShopItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveShoppingList", "", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocalDataSource implements com.mobigod.shoppinglist.data.source.LocalDSContract {
    @org.jetbrains.annotations.NotNull()
    private final com.mobigod.shoppinglist.data.PreferenceManager preferenceManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mobigod.shoppinglist.data.ShoppingDb db = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveShoppingList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.mobigod.shoppinglist.data.models.ShopItem> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getShoppingList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mobigod.shoppinglist.data.models.ShopItem>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobigod.shoppinglist.data.PreferenceManager getPreferenceManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobigod.shoppinglist.data.ShoppingDb getDb() {
        return null;
    }
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.data.PreferenceManager preferenceManager, @org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.data.ShoppingDb db) {
        super();
    }
}