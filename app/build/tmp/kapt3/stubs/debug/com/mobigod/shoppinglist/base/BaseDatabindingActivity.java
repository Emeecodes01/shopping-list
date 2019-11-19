package com.mobigod.shoppinglist.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u000b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\'J\b\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0002R\u001c\u0010\u0005\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/mobigod/shoppinglist/base/BaseDatabindingActivity;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewDataBinding", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewDataBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "getBinding", "getLayoutRes", "", "initComponents", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "performLayoutBinding", "app_debug"})
public abstract class BaseDatabindingActivity<T extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public T viewDataBinding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewDataBinding() {
        return null;
    }
    
    public final void setViewDataBinding(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void performLayoutBinding() {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    public abstract void initComponents();
    
    @org.jetbrains.annotations.NotNull()
    public final T getBinding() {
        return null;
    }
    
    public BaseDatabindingActivity() {
        super();
    }
}