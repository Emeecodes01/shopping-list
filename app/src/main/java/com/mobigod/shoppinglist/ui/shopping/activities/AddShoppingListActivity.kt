package com.mobigod.shoppinglist.ui.shopping.activities

import com.mobigod.shoppinglist.R
import com.mobigod.shoppinglist.base.BaseDatabindingActivity
import com.mobigod.shoppinglist.databinding.AddShoppingListBinding
import dagger.android.AndroidInjection

class AddShoppingListActivity: BaseDatabindingActivity<AddShoppingListBinding>(){
    override fun getLayoutRes(): Int = R.layout.add_shopping_list

    override fun initComponents() {

    }

    override fun preLayoutInit() {
        AndroidInjection.inject(this)
    }

}