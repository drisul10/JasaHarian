package com.jasaharian.modules.home

import android.graphics.Color
import android.support.v7.widget.GridLayoutManager
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class HomeUI<T> : AnkoComponent<T> {

    lateinit var tvTitleFavMenu: TextView

    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            linearLayout {
                lparams(width = matchParent, height = wrapContent) {
                    topMargin = dip(100)
                }
                padding = dip(10)
                orientation = LinearLayout.VERTICAL
                backgroundColor = Color.WHITE

                tvTitleFavMenu = textView {
                    textResource = R.string.title_fav_menu
                    textColorResource = R.color.colorText
                }

                linearLayout {
                    lparams(width = matchParent, height = wrapContent)
                    orientation = LinearLayout.HORIZONTAL
                    gravity = Gravity.CENTER
                    clipToPadding = false

                    recyclerView {
                        id = R.id.rv_list_menu_favorite
                        lparams(width = matchParent, height = wrapContent)
                        layoutManager = GridLayoutManager(ctx, 4)
                    }
                }
            }
        }
    }
}