package com.jasaharian.injection

import android.app.Application
import android.content.Context
import com.jasaharian.App
import dagger.Module
import dagger.Provides

@Module
internal class AppModule(private val application: App) {

    @Provides
    fun provideApplication(): Application {
        return application
    }

    @Provides
    fun provideContext(): Context {
        return application
    }
}