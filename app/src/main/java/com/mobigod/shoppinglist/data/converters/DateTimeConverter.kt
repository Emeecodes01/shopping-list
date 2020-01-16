package com.mobigod.shoppinglist.data.converters

import androidx.room.TypeConverter
import org.joda.time.DateTime


class DateTimeConverter {

    @TypeConverter
    fun toDate(value: Long?): DateTime? {
        return if (value == null) null else DateTime(value)
    }

    @TypeConverter
    fun toLong(value: DateTime?): Long? {
        return value?.millis
    }

}