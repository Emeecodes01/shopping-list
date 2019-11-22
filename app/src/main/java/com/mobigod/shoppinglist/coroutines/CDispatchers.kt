package com.mobigod.shoppinglist.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class CDispatchers: CoroutineInterface{
    override fun unconfined(): CoroutineDispatcher {
        return Dispatchers.Unconfined
    }

    override fun default(): CoroutineDispatcher {
        return Dispatchers.Default
    }

    override fun io(): CoroutineDispatcher {
        return Dispatchers.IO
    }

    override fun main(): CoroutineDispatcher {
        return Dispatchers.Main
    }

}