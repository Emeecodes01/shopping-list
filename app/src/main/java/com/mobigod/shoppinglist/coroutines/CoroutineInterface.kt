package com.mobigod.shoppinglist.coroutines

import kotlinx.coroutines.CoroutineDispatcher

interface CoroutineInterface {
    fun io(): CoroutineDispatcher
    fun main(): CoroutineDispatcher
    fun unconfined(): CoroutineDispatcher
    fun default(): CoroutineDispatcher
}