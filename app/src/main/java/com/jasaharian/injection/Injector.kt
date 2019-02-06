package com.jasaharian.injection

import android.content.Context
import com.jasaharian.App

class Injector {
    fun obtain(context: Context): AppGraph? {
        return App()[context].getInjector()
    }

    @Suppress("DEPRECATION")
    fun create(app: App): AppGraph {
        return DaggerAppComponent.builder().appModule(AppModule(app)).build()
    }
}