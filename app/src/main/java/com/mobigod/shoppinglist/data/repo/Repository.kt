package com.mobigod.shoppinglist.data.repo

import com.mobigod.shoppinglist.data.PreferenceManager
import com.mobigod.shoppinglist.data.ShoppingDb
import com.mobigod.shoppinglist.data.models.ShopItem
import com.mobigod.shoppinglist.data.source.LocalDSContract
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlin.coroutines.coroutineContext

class Repository @Inject constructor(val localDSContract: LocalDSContract): RepositoryContract {

    override suspend fun saveList(shopList: List<ShopItem>): List<Long> {
        return localDSContract.saveShoppingList(shopList)
    }

}