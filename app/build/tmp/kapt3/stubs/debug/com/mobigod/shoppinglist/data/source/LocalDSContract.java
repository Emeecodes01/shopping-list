package com.mobigod.shoppinglist.data.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/mobigod/shoppinglist/data/source/LocalDSContract;", "", "getShoppingList", "", "Lcom/mobigod/shoppinglist/data/models/ShopItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveShoppingList", "", "shoplist", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface LocalDSContract {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveShoppingList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.mobigod.shoppinglist.data.models.ShopItem> shoplist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getShoppingList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mobigod.shoppinglist.data.models.ShopItem>> p0);
}