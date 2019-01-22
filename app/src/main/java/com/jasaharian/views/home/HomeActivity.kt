package com.jasaharian.views.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.jasaharian.R
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toolbar: Toolbar
    private lateinit var vwNavigation: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HomeUI().setContentView(this)

        drawerLayout = findViewById(R.id.ly_drawer)
        toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        toggle.syncState()

        vwNavigation = findViewById(R.id.vw_nav)
        vwNavigation.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.nav_camera -> toast("Click Camera")
            R.id.nav_gallery -> toast("Click Gallery")
            R.id.nav_slideshow -> toast("Click Slideshow")
            R.id.nav_manage -> toast("Click Manage")
            R.id.nav_share -> toast("Click Share")
            R.id.nav_send -> toast("Click Send")
        }

        drawerLayout.closeDrawer(GravityCompat.START)

        return true
    }
}