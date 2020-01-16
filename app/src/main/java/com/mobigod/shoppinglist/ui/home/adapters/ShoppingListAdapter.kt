package com.mobigod.shoppinglist.ui.home.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobigod.shoppinglist.data.models.ShopItem
import com.mobigod.shoppinglist.databinding.ShoppingItemBinding
import com.mobigod.shoppinglist.databinding.ShoppingItemBindingImpl

class ShoppingListAdapter: RecyclerView.Adapter<ShoppingListAdapter.ShoppingListVH>() {
    private val items: MutableList<ShopItem> = mutableListOf()
    lateinit var binding: ShoppingItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingListVH {
        binding = ShoppingItemBinding.inflate(LayoutInflater.from(parent.context))
        return ShoppingListVH(binding.root)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ShoppingListVH, position: Int) {
        binding.shopItem = items[position]
    }

    fun addItems(its: MutableList<ShopItem>){
        items.addAll(its)
        notifyDataSetChanged()
    }

    inner class ShoppingListVH(itemView: View): RecyclerView.ViewHolder(itemView){

    }
}