package com.mobigod.shoppinglist.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


abstract class BaseDatabindingActivity<T: ViewDataBinding>(): AppCompatActivity(){
    lateinit var viewDataBinding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performLayoutBinding()

        initComponents()
    }

    private fun performLayoutBinding() {
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutRes())
    }


    @LayoutRes
    abstract fun getLayoutRes(): Int

    abstract fun initComponents()

    fun getBinding(): T = viewDataBinding

}