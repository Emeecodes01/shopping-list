package com.mobigod.shoppinglist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mobigod.shoppinglist.data.dao.ShopItemDAO
import com.mobigod.shoppinglist.data.models.ShopItem


@Database(entities = [ShopItem::class], version = 1)
abstract class ShoppingDb: RoomDatabase() {
    abstract fun shopItemDAO(): ShopItemDAO

    companion object {
        var INSTANCE: ShoppingDb? = null

        fun getAppDataBase(context: Context): ShoppingDb? {
            if (INSTANCE == null) {
                synchronized(ShoppingDb::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext, ShoppingDb::class.java,
                        "shopping_list_db")
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyDataBase(){
            INSTANCE = null
        }
    }

}