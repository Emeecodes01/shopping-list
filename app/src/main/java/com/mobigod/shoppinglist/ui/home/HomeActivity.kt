package com.mobigod.shoppinglist.ui.home
import android.content.Context
import android.content.Intent
import com.mobigod.shoppinglist.R
import com.mobigod.shoppinglist.base.BaseDatabindingActivity
import com.mobigod.shoppinglist.databinding.ActivityHomeBinding
import dagger.android.AndroidInjection

class HomeActivity: BaseDatabindingActivity<ActivityHomeBinding>() {

    override fun preLayoutInit() {
        AndroidInjection.inject(this)
    }

    lateinit var binding: ActivityHomeBinding


    override fun getLayoutRes() = R.layout.activity_home

    override fun initComponents() {
        binding = getBinding()

    }


    companion object {
        fun start(context: Context) {
            Intent(context, HomeActivity::class.java).also {
                context.startActivity(it)
            }
        }
    }
}