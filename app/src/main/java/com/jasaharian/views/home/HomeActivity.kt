package com.jasaharian.views.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.jasaharian.R
import org.jetbrains.anko.setContentView

class HomeActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HomeUI().setContentView(this)

        drawerLayout = findViewById(R.id.ly_drawer)
        toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        //TODO: some code
    }

    override fun onBackPressed() {
        super.onBackPressed()
        //TODO: onBackPressed
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
        //TODO: onCreateOptionsMenu
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
        //TODO: onOptionsItemSelected
    }
}