package com.mobigod.shoppinglist.data.repo

import com.mobigod.shoppinglist.data.models.ShopItem

interface RepositoryContract {
    suspend fun saveList(list: List<ShopItem>): Int
}