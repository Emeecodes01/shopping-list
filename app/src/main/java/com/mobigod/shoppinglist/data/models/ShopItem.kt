package com.mobigod.shoppinglist.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_item")
data class ShopItem (
    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0,
    var name: String = ""
)