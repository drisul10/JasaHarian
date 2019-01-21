package com.jasaharian.views.home

import org.jetbrains.anko.*
import org.jetbrains.anko.design.navigationView
import org.jetbrains.anko.support.v4.drawerLayout

class HomeUI : AnkoComponent<HomeActivity> {
    override fun createView(ui: AnkoContext<HomeActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent)

            textView {
                text = "ini home"
            }

            drawerLayout {
                lparams(width = matchParent, height = matchParent) {
                    fitsSystemWindows = true
                }

                navigationView {

                }.lparams(width = wrapContent, height = matchParent) {
                    fitsSystemWindows = true
                }
            }
        }
    }

}