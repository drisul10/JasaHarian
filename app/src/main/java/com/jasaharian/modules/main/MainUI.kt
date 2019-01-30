package com.jasaharian.modules.main

import android.content.res.ColorStateList
import android.graphics.Color
import android.support.design.widget.BottomNavigationView
import android.support.v4.content.ContextCompat
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.bottomNavigationView
import org.jetbrains.anko.support.v4.nestedScrollView

class MainUI : AnkoComponent<MainActivity> {
    lateinit var bottomNavigationView: BottomNavigationView

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent) {
                backgroundColorResource = R.color.colorBackground
            }

            nestedScrollView {
                lparams(width = matchParent, height = matchParent)

                frameLayout {
                    lparams(width = matchParent, height = wrapContent)
                    id = R.id.fl_main_content
                }
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
}