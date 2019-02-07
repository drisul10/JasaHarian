package com.jasaharian.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jasaharian.R
import com.jasaharian.ui.account.AccountFragment
import com.jasaharian.ui.cart.CartFragment
import com.jasaharian.ui.home.HomeFragment
import com.jasaharian.ui.inbox.InboxFragment
import com.jasaharian.ui.transaction.TransactionFragment
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {
    private val ui = MainUI()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui.setContentView(this)

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
}