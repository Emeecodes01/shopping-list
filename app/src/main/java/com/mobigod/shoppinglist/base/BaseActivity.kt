package com.mobigod.shoppinglist.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getResLayoutId())

        initComponents()
    }

    @LayoutRes
    abstract fun getResLayoutId(): Int

    abstract fun initComponents()
}