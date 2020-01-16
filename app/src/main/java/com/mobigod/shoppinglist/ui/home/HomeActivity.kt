package com.mobigod.shoppinglist.ui.home
import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobigod.shoppinglist.R
import com.mobigod.shoppinglist.base.BaseDatabindingActivity
import com.mobigod.shoppinglist.data.models.ShopItem
import com.mobigod.shoppinglist.databinding.ActivityHomeBinding
import com.mobigod.shoppinglist.ui.home.adapters.ShoppingListAdapter
import dagger.android.AndroidInjection

class HomeActivity: BaseDatabindingActivity<ActivityHomeBinding>() {

    override fun preLayoutInit() {
        AndroidInjection.inject(this)
    }

    lateinit var binding: ActivityHomeBinding

    override fun getLayoutRes() = R.layout.activity_home

    override fun initComponents() {
        binding = getBinding()

        ResourcesCompat.getFont(this, R.font.archivo_black).also {
            typeface ->
            binding.collapsingTb.setExpandedTitleTypeface(typeface)
        }

        val adpt = ShoppingListAdapter()

        adpt.addItems(mutableListOf(
            ShopItem(title = "Stew List"),
            ShopItem(title = "Soup List"),
            ShopItem(title = "Clothes List"),
            ShopItem(title = "Stuff List")
        ))

        binding.shoppinglistRv.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = adpt
        }

    }


    companion object {
        fun start(context: Context) {
            Intent(context, HomeActivity::class.java).also {
                context.startActivity(it)
            }
        }
    }


}