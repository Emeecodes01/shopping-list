package com.mobigod.shoppinglist.data.source

import com.mobigod.shoppinglist.data.models.ShopItem

interface LocalDSContract {
    suspend fun saveShoppingList(shoplist: List<ShopItem>?): Int
    suspend fun getShoppingList(): List<ShopItem>
}