package com.jasaharian

import android.app.Application
import android.content.Context
import com.jasaharian.injection.AppGraph
import com.jasaharian.injection.Injector

class App : Application() {
    private var appGraph: AppGraph? = null

    operator fun get(context: Context): App {
        return context.applicationContext as App
    }

    override fun onCreate() {
        super.onCreate()

        appGraph = Injector().create(this)
        appGraph!!.inject(this)
    }

    fun getInjector(): AppGraph? {
        return appGraph
    }
}