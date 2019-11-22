package com.mobigod.shoppinglist.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mobigod.shoppinglist.data.models.ShopItem

@Dao
interface ShopItemDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveShopItems(items: List<ShopItem>): List<Long>

    @Query("SELECT*FROM shop_item")
    suspend fun getShopItems(): List<ShopItem>

    @Query("SELECT * FROM shop_item WHERE title =:name LIMIT 1")
    suspend fun getShopItemByName(name: String): ShopItem
}