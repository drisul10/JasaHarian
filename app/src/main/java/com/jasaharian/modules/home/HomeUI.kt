package com.jasaharian.modules.home

import android.graphics.Color
import android.view.Gravity
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

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

                    gridLayout {
                        columnCount = 4
                        rowCount = 3
                        isColumnOrderPreserved = false
                        alignmentMode = GridLayout.ALIGN_MARGINS

                        cardView {
                            lparams(width = dip(70), height = dip(70)) {
                                margin = dip(5)
                            }
                            backgroundColor = Color.WHITE

                            linearLayout {
                                lparams(width = matchParent, height = matchParent)
                                orientation = LinearLayout.VERTICAL
                                gravity = Gravity.CENTER
                                padding = dip(5)

                                imageView {
                                    backgroundResource = R.drawable.circle_bg_purple
                                    setImageResource(R.drawable.ic_account_circle_black_24dp)
                                }.lparams(width = dip(35), height = dip(35))

                                textView {
                                    gravity = Gravity.CENTER
                                    text = "text"
                                    textColorResource = R.color.colorText
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}