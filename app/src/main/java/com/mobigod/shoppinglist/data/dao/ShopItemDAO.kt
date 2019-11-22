package com.mobigod.shoppinglist.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mobigod.shoppinglist.data.models.ShopItem

@Dao
interface ShopItemDAO {
    @Insert
    fun saveShopItems(items: List<ShopItem>)

    @Query("SELECT*FROM shop_item")
    fun getShopItems(): List<ShopItem>
}