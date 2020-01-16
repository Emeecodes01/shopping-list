package com.mobigod.shoppinglist.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.joda.time.DateTime
import java.util.*


@Entity(tableName = "shop_items_table")
data class ShopItem (
    @PrimaryKey
    var uuid: String = UUID.randomUUID().toString(),
    var title: String = "",
    @ColumnInfo(name = "date_time")
    var dateTime: DateTime = DateTime.now()
)