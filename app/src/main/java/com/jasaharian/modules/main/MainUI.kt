package com.jasaharian.modules.main

import android.content.res.ColorStateList
import android.graphics.Color
import android.support.design.widget.AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.Toolbar
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4._DrawerLayout
import org.jetbrains.anko.support.v4.drawerLayout
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.design.bottomNavigationView
import org.jetbrains.anko.support.v4.nestedScrollView

class MainUI : AnkoComponent<MainActivity> {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navigationView: NavigationView
    lateinit var bottomNavigationView: BottomNavigationView

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent) {
                backgroundColorResource = R.color.colorBackground
            }

            drawerLayout = drawerLayout {
                lparams(width = matchParent, height = matchParent) {
                    id = R.id.ly_drawer
                    fitsSystemWindows = true
                }

                createAppBar()
                createNavigationView(ui)
            }

            relativeLayout {
                lparams(width = matchParent, height = wrapContent) {
                    alignParentBottom()
                }

                bottomNavigationView = bottomNavigationView {
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

                toolbar = toolbar {
                    lparams(width = matchParent, height = matchParent) {
                        id = R.id.toolbar
                        backgroundColor = Color.WHITE
                    }
                    setTitleTextColor(Color.BLACK)
                }.lparams {
                    width = matchParent
                    scrollFlags = SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED
                }
            }

            nestedScrollView {
                lparams(width = matchParent, height = matchParent)

                frameLayout {
                    lparams(width = matchParent, height = wrapContent)
                    id = R.id.fl_main_content
                }
            }
        }
    }

    private fun _DrawerLayout.createNavigationView(ui: AnkoContext<MainActivity>) {
        navigationView = navigationView {
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