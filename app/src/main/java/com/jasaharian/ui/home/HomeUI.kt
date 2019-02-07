package com.jasaharian.ui.home

import android.graphics.Color
import android.graphics.Typeface
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.ProgressBar
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class HomeUI<T> : AnkoComponent<T> {
    lateinit var rvListMenuFavorite: RecyclerView
    lateinit var rvListMenuPromo: RecyclerView
    lateinit var progressbarMenuFavorite: ProgressBar
    lateinit var progressbarMenuPromo: ProgressBar

    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = wrapContent)

            linearLayout {
                lparams(width = matchParent, height = wrapContent) {
                    topMargin = dip(5)
                    bottomMargin = dip(5)
                }
                id = R.id.ll
                orientation = LinearLayout.VERTICAL
                backgroundColor = Color.WHITE

                linearLayout {
                    lparams(width = matchParent, height = wrapContent) {
                        verticalMargin = dip(10)
                    }
                    orientation = LinearLayout.VERTICAL

                    relativeLayout {
                        lparams(width = matchParent, height = wrapContent) {
                            horizontalMargin = dip(10)
                        }
                        padding = dip(10)
                        backgroundColorResource = R.color.colorPrimary

                        textView {
                            text = "Jasa Harian Pay"
                            textSize = 18f
                            typeface = Typeface.DEFAULT_BOLD
                            textColor = Color.WHITE
                        }.lparams {
                            alignParentLeft()
                        }

                        textView {
                            text = "Rp 0"
                            textSize = 18f
                            typeface = Typeface.DEFAULT_BOLD
                            textColor = Color.WHITE
                        }.lparams {
                            alignParentRight()
                        }
                    }

                    view {
                        backgroundColor = Color.WHITE
                    }.lparams(height = dip(0.5f)) {
                        horizontalMargin = dip(10)
                    }

                    linearLayout {
                        lparams(width = matchParent, height = matchParent) {
                            horizontalMargin = dip(10)
                        }
                        orientation = LinearLayout.HORIZONTAL
                        padding = dip(10)
                        gravity = Gravity.CENTER
                        backgroundColorResource = R.color.colorPrimary

                        linearLayout {
                            lparams(width = wrapContent, height = wrapContent)
                            orientation = LinearLayout.VERTICAL
                            gravity = Gravity.CENTER
                            padding = dip(10)

                            imageView {
                                setImageResource(R.drawable.ic_directions_subway_white_24dp)
                            }.lparams(width = dip(50), height = dip(50))

                            textView {
                                gravity = Gravity.CENTER
                                textColor = Color.WHITE
                                text = "menu"
                            }
                        }
                    }
                }

                relativeLayout {
                    lparams(width = matchParent, height = wrapContent)
                    gravity = Gravity.CENTER
                    clipToPadding = false

                    progressbarMenuFavorite = progressBar {}.lparams {
                        width = wrapContent
                        height = wrapContent
                        centerInParent()
                    }

                    rvListMenuFavorite = recyclerView {
                        lparams(width = matchParent, height = wrapContent)
                        id = R.id.rv_list_menu_favorite
                        layoutManager = GridLayoutManager(ctx, 3)
                    }
                }
            }

            progressbarMenuPromo = progressBar {}.lparams {
                width = wrapContent
                height = wrapContent
                centerInParent()
            }

            relativeLayout {
                lparams(width = matchParent, height = wrapContent) {
                    below(R.id.ll)
                }

                rvListMenuPromo = recyclerView {
                    lparams(width = matchParent, height = wrapContent)
                    id = R.id.rv_list_menu_promo
                    layoutManager = LinearLayoutManager(ctx, LinearLayout.HORIZONTAL, false)
                }
            }
        }
    }
}