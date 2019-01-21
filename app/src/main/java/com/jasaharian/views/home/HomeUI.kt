package com.jasaharian.views.home

import android.support.v4.view.GravityCompat
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4._DrawerLayout
import org.jetbrains.anko.support.v4.drawerLayout

class HomeUI : AnkoComponent<HomeActivity> {
    override fun createView(ui: AnkoContext<HomeActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent)

            drawerLayout {
                lparams(width = matchParent, height = matchParent) {
                    id = R.id.ly_drawer
                    fitsSystemWindows = true
                }

                createAppBar(ui)
                createNavigationView(ui)
            }
        }
    }

    fun _DrawerLayout.createAppBar(ui: AnkoContext<HomeActivity>) {
        coordinatorLayout {
            lparams(width = matchParent, height = matchParent) {
                fitsSystemWindows = false
            }

            //TODO: AppbarLayout & include
        }
    }

    fun _DrawerLayout.createNavigationView(ui: AnkoContext<HomeActivity>) {
        navigationView {
            lparams(height = matchParent, gravity = GravityCompat.START) {
                id = R.id.vw_nav
                fitsSystemWindows = true
            }

            //TODO: setNavigationItemSelectedListener(ui.owner)
            //      inflateHeaderView(R.layout.nav_header_main)
            //      inflateMenu(R.menu.activity_main_drawer)
        }
    }
}