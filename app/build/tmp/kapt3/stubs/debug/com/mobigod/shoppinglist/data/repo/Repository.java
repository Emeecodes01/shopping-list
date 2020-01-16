package com.mobigod.shoppinglist.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/mobigod/shoppinglist/data/repo/Repository;", "Lcom/mobigod/shoppinglist/data/repo/RepositoryContract;", "localDSContract", "Lcom/mobigod/shoppinglist/data/source/LocalDSContract;", "(Lcom/mobigod/shoppinglist/data/source/LocalDSContract;)V", "getLocalDSContract", "()Lcom/mobigod/shoppinglist/data/source/LocalDSContract;", "saveList", "", "", "shopList", "Lcom/mobigod/shoppinglist/data/models/ShopItem;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository implements com.mobigod.shoppinglist.data.repo.RepositoryContract {
    @org.jetbrains.annotations.NotNull()
    private final com.mobigod.shoppinglist.data.source.LocalDSContract localDSContract = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mobigod.shoppinglist.data.models.ShopItem> shopList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.Long>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobigod.shoppinglist.data.source.LocalDSContract getLocalDSContract() {
        return null;
    }
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.data.source.LocalDSContract localDSContract) {
        super();
    }
}