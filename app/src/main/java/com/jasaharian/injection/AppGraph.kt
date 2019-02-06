package com.jasaharian.injection

import com.jasaharian.App

interface AppGraph {
    fun inject(app: App)
}