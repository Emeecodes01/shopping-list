package com.mobigod.shoppinglist.data.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mobigod.shoppinglist.data.models.ShopItem;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ShopItemDAO_Impl implements ShopItemDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ShopItem> __insertionAdapterOfShopItem;

  public ShopItemDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfShopItem = new EntityInsertionAdapter<ShopItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `shop_item` (`uid`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ShopItem value) {
        stmt.bindLong(1, value.getUid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
  }

  @Override
  public void saveShopItems(final List<ShopItem> items) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfShopItem.insert(items);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ShopItem> getShopItems() {
    final String _sql = "SELECT*FROM shop_item";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<ShopItem> _result = new ArrayList<ShopItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ShopItem _item;
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item = new ShopItem(_tmpUid,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
