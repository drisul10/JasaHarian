package com.jasaharian.modules.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.view.View
import com.jasaharian.R
import com.jasaharian.modules.account.AccountFragment
import com.jasaharian.modules.cart.CartFragment
import com.jasaharian.modules.home.HomeFragment
import com.jasaharian.modules.inbox.InboxFragment
import com.jasaharian.modules.transaction.TransactionFragment
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    //TODO: Capitalize

    private val ui = MainUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)

        setSupportActionBar(ui.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)

        val toggle: ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            ui.drawerLayout,
            ui.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        ) {
            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
                ui.drawerLayout.z = 1f
            }

            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
                ui.drawerLayout.z = 0f
            }
        }

        ui.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        ui.navigationView.setNavigationItemSelectedListener(this)

        ui.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_menu_home -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(
                            R.id.fl_main_content,
                            HomeFragment(), HomeFragment::class.simpleName
                        )
                        .commit()
                    true
                }
                R.id.nav_menu_inbox -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_main_content, InboxFragment(), InboxFragment::class.simpleName)
                        .commit()
                    true
                }
                R.id.nav_menu_transaction -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_main_content, TransactionFragment(), TransactionFragment::class.simpleName)
                        .commit()
                    true
                }
                R.id.nav_menu_cart -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_main_content, CartFragment(), CartFragment::class.simpleName)
                        .commit()
                    true
                }
                R.id.nav_menu_account -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fl_main_content, AccountFragment(), AccountFragment::class.simpleName)
                        .commit()
                    true
                }
                else -> false
            }
        }

        ui.bottomNavigationView.selectedItemId = R.id.nav_menu_home
    }

    override fun onBackPressed() {
        if (ui.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            ui.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.i_menu_payment -> toast("menu payment")
            R.id.i_menu_history -> toast("menu history")
            R.id.i_menu_saved_place -> toast("menu saved place")
            R.id.i_menu_help -> toast("menu help")
            R.id.i_menu_emergency -> toast("menu emergency")
            R.id.i_menu_setting -> toast("menu setting")
        }

        ui.drawerLayout.closeDrawer(GravityCompat.START)

        return true
    }
}