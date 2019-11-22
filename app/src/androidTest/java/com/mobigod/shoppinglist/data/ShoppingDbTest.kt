package com.mobigod.shoppinglist.data

import org.junit.Assert.*

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.hamcrest.CoreMatchers.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ShoppingDbTest {

    private lateinit var SUT: ShoppingDb
    private


    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        SUT = Room.inMemoryDatabaseBuilder(context, ShoppingDb::class.java)
            .build()

    }

    @After
    fun tearDown() {
    }

    @Test
    fun shopItemDAO() {
    }
}