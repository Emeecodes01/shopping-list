package com.mobigod.shoppinglist.data.converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/mobigod/shoppinglist/data/converters/DateTimeConverter;", "", "()V", "toDate", "Lorg/joda/time/DateTime;", "value", "", "(Ljava/lang/Long;)Lorg/joda/time/DateTime;", "toLong", "(Lorg/joda/time/DateTime;)Ljava/lang/Long;", "app_debug"})
public final class DateTimeConverter {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final org.joda.time.DateTime toDate(@org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.Long toLong(@org.jetbrains.annotations.Nullable()
    org.joda.time.DateTime value) {
        return null;
    }
    
    public DateTimeConverter() {
        super();
    }
}