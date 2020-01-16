package com.mobigod.shoppinglist.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.mobigod.shoppinglist.data.converters.DateTimeConverter.class})
@androidx.room.Database(entities = {com.mobigod.shoppinglist.data.models.ShopItem.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/mobigod/shoppinglist/data/ShoppingDb;", "Landroidx/room/RoomDatabase;", "()V", "shopItemDAO", "Lcom/mobigod/shoppinglist/data/dao/ShopItemDAO;", "Companion", "app_debug"})
public abstract class ShoppingDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable()
    private static com.mobigod.shoppinglist.data.ShoppingDb INSTANCE;
    public static final com.mobigod.shoppinglist.data.ShoppingDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mobigod.shoppinglist.data.dao.ShopItemDAO shopItemDAO();
    
    public ShoppingDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/mobigod/shoppinglist/data/ShoppingDb$Companion;", "", "()V", "INSTANCE", "Lcom/mobigod/shoppinglist/data/ShoppingDb;", "getINSTANCE", "()Lcom/mobigod/shoppinglist/data/ShoppingDb;", "setINSTANCE", "(Lcom/mobigod/shoppinglist/data/ShoppingDb;)V", "destroyDataBase", "", "getAppDataBase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.mobigod.shoppinglist.data.ShoppingDb getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable()
        com.mobigod.shoppinglist.data.ShoppingDb p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mobigod.shoppinglist.data.ShoppingDb getAppDataBase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyDataBase() {
        }
        
        private Companion() {
            super();
        }
    }
}