package com.mobigod.shoppinglist.ui.home.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/mobigod/shoppinglist/ui/home/adapters/ShoppingListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/mobigod/shoppinglist/ui/home/adapters/ShoppingListAdapter$ShoppingListVH;", "()V", "binding", "Lcom/mobigod/shoppinglist/databinding/ShoppingItemBinding;", "getBinding", "()Lcom/mobigod/shoppinglist/databinding/ShoppingItemBinding;", "setBinding", "(Lcom/mobigod/shoppinglist/databinding/ShoppingItemBinding;)V", "items", "", "Lcom/mobigod/shoppinglist/data/models/ShopItem;", "addItems", "", "its", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ShoppingListVH", "app_debug"})
public final class ShoppingListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.mobigod.shoppinglist.ui.home.adapters.ShoppingListAdapter.ShoppingListVH> {
    private final java.util.List<com.mobigod.shoppinglist.data.models.ShopItem> items = null;
    @org.jetbrains.annotations.NotNull()
    public com.mobigod.shoppinglist.databinding.ShoppingItemBinding binding;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobigod.shoppinglist.databinding.ShoppingItemBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.databinding.ShoppingItemBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.mobigod.shoppinglist.ui.home.adapters.ShoppingListAdapter.ShoppingListVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.mobigod.shoppinglist.ui.home.adapters.ShoppingListAdapter.ShoppingListVH holder, int position) {
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mobigod.shoppinglist.data.models.ShopItem> its) {
    }
    
    public ShoppingListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mobigod/shoppinglist/ui/home/adapters/ShoppingListAdapter$ShoppingListVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/mobigod/shoppinglist/ui/home/adapters/ShoppingListAdapter;Landroid/view/View;)V", "app_debug"})
    public final class ShoppingListVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ShoppingListVH(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}