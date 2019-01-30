package com.jasaharian.modules.laundry

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

class LaundryActivity : AppCompatActivity() {

    private val ui = LaundryUI()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        ui.setContentView(this)
    }
}