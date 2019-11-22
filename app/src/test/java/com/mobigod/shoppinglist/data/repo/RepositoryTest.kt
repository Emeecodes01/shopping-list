package com.mobigod.shoppinglist.data.repo

import org.junit.Assert.*

import com.mobigod.shoppinglist.data.models.ShopItem
import com.mobigod.shoppinglist.data.source.LocalDSContract
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.CoreMatchers.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.*
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class RepositoryTest {

    lateinit var SUT: Repository

    private val shoppingList = listOf (
        ShopItem(uid = 1, name = "Shop1"),
        ShopItem(uid = 2, name = "Shop2"),
        ShopItem(uid = 3, name = "Shop3")
    )

    private val shopItem = ShopItem(uid = 1, name = "Shop1")
    private val SHOP_ITEM_SAVED_ITEM = 1
    private val SHOP_ITEM_SAVED_ITEM_FAILED = 0

    @Mock
    lateinit var localDSContract: LocalDSContract

    @Captor
    lateinit var argumentCaptor: ArgumentCaptor<List<ShopItem>>

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        SUT = Repository(localDSContract)
    }


    @Test
    fun `saveShoppingList correctParamsPassed`() = runBlockingTest{
        SUT.saveList(shoppingList)

        verify(localDSContract, times(1))
            .saveShoppingList(argumentCaptor.capture())

        assertThat(shoppingList, `is`(argumentCaptor.value))
    }


    @Test
    fun `saveShoppingList successful`() = runBlockingTest {
        `save items successful`()
        val result = SUT.saveList(shoppingList)
        assertThat(result, `is`(SHOP_ITEM_SAVED_ITEM))
    }


    @Test
    fun `saveShoppingList failed`() = runBlockingTest {
        `save items failure`()

        val result = SUT.saveList(shoppingList)
        assertThat(result, `is`(SHOP_ITEM_SAVED_ITEM_FAILED))
    }


    private suspend fun `save items failure`() {
        `when`(localDSContract.saveShoppingList(anyList())).thenReturn(
            SHOP_ITEM_SAVED_ITEM_FAILED
        )
    }


    private suspend fun `save items successful`() {
        `when`(localDSContract.saveShoppingList(anyList())).thenReturn(
            SHOP_ITEM_SAVED_ITEM
        )
    }


}



