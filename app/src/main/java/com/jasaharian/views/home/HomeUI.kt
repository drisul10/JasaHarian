package com.jasaharian.views.home

import android.content.res.ColorStateList
import android.graphics.Color
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4._DrawerLayout
import org.jetbrains.anko.support.v4.drawerLayout
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.bottomNavigationView

class HomeUI : AnkoComponent<HomeActivity> {
    override fun createView(ui: AnkoContext<HomeActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent) {
                backgroundColorResource = R.color.colorBackground
            }

            drawerLayout {
                lparams(width = matchParent, height = matchParent) {
                    id = R.id.ly_drawer
                    fitsSystemWindows = true
                    z = 1f
                }

                createAppBar()
                createNavigationView(ui)
            }

            relativeLayout {
                lparams(width = matchParent, height = wrapContent) {
                    alignParentBottom()
                    z = 0f
                }

                bottomNavigationView {
                    lparams(width = matchParent, height = wrapContent)

                    id = R.id.vw_nav_bottom
                    inflateMenu(R.menu.home_nav_bottom)

                    itemTextColor = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.colorText))
                    itemIconTintList = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.colorIcon))

                    backgroundColor = Color.WHITE
                }
            }
        }
    }

    private fun _DrawerLayout.createAppBar() {
        coordinatorLayout {
            lparams(width = matchParent, height = matchParent) {
                fitsSystemWindows = false
            }

            appBarLayout {
                lparams(width = matchParent, height = wrapContent)

                toolbar {
                    lparams(width = matchParent, height = matchParent) {
                        id = R.id.toolbar
                        backgroundColor = Color.WHITE
                    }
                }
            }
        }
    }

    private fun _DrawerLayout.createNavigationView(ui: AnkoContext<HomeActivity>) {
        navigationView {
            lparams(width = matchParent, height = matchParent, gravity = GravityCompat.START) {
                id = R.id.vw_nav
                fitsSystemWindows = true
                itemTextColor = ColorStateList.valueOf(ContextCompat.getColor(context, R.color.colorText))
                backgroundColor = Color.WHITE
            }

            setNavigationItemSelectedListener(ui.owner)
            inflateHeaderView(R.layout.nav_header_home)
            inflateMenu(R.menu.home_drawer)
        }
    }
}