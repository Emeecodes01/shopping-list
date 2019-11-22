package com.mobigod.shoppinglist.data.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mobigod.shoppinglist.data.models.ShopItem;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ShopItemDAO_Impl implements ShopItemDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ShopItem> __insertionAdapterOfShopItem;

  public ShopItemDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfShopItem = new EntityInsertionAdapter<ShopItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `shop_item` (`uid`,`title`,`description`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ShopItem value) {
        stmt.bindLong(1, value.getUid());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
      }
    };
  }

  @Override
  public Object saveShopItems(final List<ShopItem> items,
      final Continuation<? super List<Long>> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfShopItem.insertAndReturnIdsList(items);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getShopItems(final Continuation<? super List<ShopItem>> p0) {
    final String _sql = "SELECT*FROM shop_item";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<ShopItem>>() {
      @Override
      public List<ShopItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final List<ShopItem> _result = new ArrayList<ShopItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ShopItem _item;
            final int _tmpUid;
            _tmpUid = _cursor.getInt(_cursorIndexOfUid);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            _item = new ShopItem(_tmpUid,_tmpTitle,_tmpDescription);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getShopItemByName(final String name, final Continuation<? super ShopItem> p1) {
    final String _sql = "SELECT * FROM shop_item WHERE title =? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<ShopItem>() {
      @Override
      public ShopItem call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final ShopItem _result;
          if(_cursor.moveToFirst()) {
            final int _tmpUid;
            _tmpUid = _cursor.getInt(_cursorIndexOfUid);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            _result = new ShopItem(_tmpUid,_tmpTitle,_tmpDescription);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
