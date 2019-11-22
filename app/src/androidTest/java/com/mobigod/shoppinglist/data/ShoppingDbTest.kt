package com.mobigod.shoppinglist.data

import org.junit.Assert.*

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.mobigod.shoppinglist.data.dao.ShopItemDAO
import com.mobigod.shoppinglist.data.models.ShopItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

import org.hamcrest.CoreMatchers.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class ShoppingDbTest {

    private lateinit var SUT: ShoppingDb
    private lateinit var shopItemDAO: ShopItemDAO

    private val SHOPPING_LIST = listOf (
        ShopItem(title = "Shop1", description = "description 01"),
        ShopItem(title = "Shop2", description = "description 02"),
        ShopItem(title = "Shop3", description = "description 03")
    )


    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        SUT = Room.inMemoryDatabaseBuilder(context, ShoppingDb::class.java)
            .build()
        shopItemDAO = SUT.shopItemDAO()
    }

    @After
    @Throws(IOException::class)
    fun tearDown() {
        SUT.close()
    }


    @Test
    fun saveShopItems_in_database_success() = runBlocking(Dispatchers.IO) {
        shopItemDAO.saveShopItems(SHOPPING_LIST)
        val shopItem = shopItemDAO.getShopItemByName("Shop1")
        val shopItem2 = shopItemDAO.getShopItemByName("Shop2")
        val shopItem3 = shopItemDAO.getShopItemByName("Shop3")

        assertThat(shopItem.description, `is`(SHOPPING_LIST[0].description))
        assertThat(shopItem2.description, `is`(SHOPPING_LIST[1].description))
        assertThat(shopItem3.description, `is`(SHOPPING_LIST[2].description))
    }


}