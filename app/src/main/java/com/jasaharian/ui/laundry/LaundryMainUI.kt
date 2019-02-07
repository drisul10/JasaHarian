package com.jasaharian.ui.laundry

import android.graphics.Color
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.ProgressBar
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView
import org.jetbrains.anko.recyclerview.v7.recyclerView

class LaundryMainUI<T> : AnkoComponent<T> {
    lateinit var rvCategory: RecyclerView
    lateinit var rvMerchantPromoted: RecyclerView
    lateinit var rvMerchantTopRating: RecyclerView
    lateinit var rvMerchantBestSeller: RecyclerView
    lateinit var progressBarCategory: ProgressBar
    lateinit var progressBarMerchantPromoted: ProgressBar
    lateinit var progressBarMerchantTopRating: ProgressBar
    lateinit var progressBarMerchantBestSeller: ProgressBar

    override fun createView(ui: AnkoContext<T>) = with(ui) {
        linearLayout {
            lparams(width = matchParent, height = wrapContent)
            orientation = LinearLayout.VERTICAL

            //search bar
            cardView {
                lparams(width = matchParent, height = wrapContent) {
                    horizontalMargin = dip(5)
                    verticalMargin = dip(2.5f)
                    backgroundColor = Color.WHITE
                }

                themedSearchView {
                }
            }

            //category
            cardView {
                lparams(width = matchParent, height = wrapContent) {
                    horizontalMargin = dip(5)
                    verticalMargin = dip(2.5f)
                    backgroundColor = Color.WHITE
                }

                linearLayout {
                    lparams(width = matchParent, height = wrapContent)
                    orientation = LinearLayout.VERTICAL

                    verticalLayout {
                        lparams {
                            leftMargin = dip(10)
                            topMargin = dip(10)
                            bottomMargin = dip(10)
                        }

                        textView {
                            text = "Kategori"
                            textSize = 18f
                            textColorResource = R.color.colorText
                        }

                        textView {
                            text = "lorem ipsum dolor sit amet"
                            textSize = 12f
                            textColorResource = R.color.colorText
                        }
                    }

                    relativeLayout {
                        lparams(width = matchParent, height = wrapContent)

                        progressBarCategory = progressBar { }.lparams {
                            width = wrapContent
                            height = wrapContent
                            centerInParent()
                        }

                        rvCategory = recyclerView {
                            lparams(width = matchParent, height = wrapContent)
                            id = R.id.rv_menu_service_laundry
                            layoutManager = LinearLayoutManager(ctx, LinearLayout.HORIZONTAL, false)
                        }
                    }
                }
            }

            //merchant promoted
            cardView {
                lparams(width = matchParent, height = wrapContent) {
                    horizontalMargin = dip(5)
                    verticalMargin = dip(2.5f)
                    backgroundColor = Color.WHITE
                }

                linearLayout {
                    lparams(width = matchParent, height = wrapContent)
                    orientation = LinearLayout.VERTICAL

                    verticalLayout {
                        lparams {
                            leftMargin = dip(10)
                            topMargin = dip(10)
                            bottomMargin = dip(10)
                        }

                        textView {
                            text = "Dipromosikan"
                            textSize = 18f
                            textColorResource = R.color.colorText
                        }

                        textView {
                            text = "lorem ipsum dolor sit amet"
                            textSize = 12f
                            textColorResource = R.color.colorText
                        }
                    }

                    relativeLayout {
                        lparams(width = matchParent, height = wrapContent)

                        progressBarMerchantPromoted = progressBar { }.lparams {
                            width = wrapContent
                            height = wrapContent
                            centerInParent()
                        }

                        rvMerchantPromoted = recyclerView {
                            lparams(width = matchParent, height = wrapContent)
                            id = R.id.rv_merchant_promoted
                            layoutManager = LinearLayoutManager(ctx, LinearLayout.HORIZONTAL, false)
                        }
                    }
                }
            }

            //merchant top rating
            cardView {
                lparams(width = matchParent, height = wrapContent) {
                    horizontalMargin = dip(5)
                    verticalMargin = dip(2.5f)
                    backgroundColor = Color.WHITE
                }

                linearLayout {
                    lparams(width = matchParent, height = wrapContent)
                    orientation = LinearLayout.VERTICAL

                    verticalLayout {
                        lparams {
                            leftMargin = dip(10)
                            topMargin = dip(10)
                            bottomMargin = dip(10)
                        }

                        textView {
                            text = "Rating terbaik"
                            textSize = 18f
                            textColorResource = R.color.colorText
                        }

                        textView {
                            text = "lorem ipsum dolor sit amet"
                            textSize = 12f
                            textColorResource = R.color.colorText
                        }
                    }

                    relativeLayout {
                        lparams(width = matchParent, height = wrapContent)

                        progressBarMerchantTopRating = progressBar { }.lparams {
                            width = wrapContent
                            height = wrapContent
                            centerInParent()
                        }

                        rvMerchantTopRating = recyclerView {
                            lparams(width = matchParent, height = wrapContent)
                            id = R.id.rv_merchant_top_rating
                            layoutManager = LinearLayoutManager(ctx, LinearLayout.HORIZONTAL, false)
                        }
                    }
                }
            }

            //merchant best seller
            cardView {
                lparams(width = matchParent, height = wrapContent) {
                    horizontalMargin = dip(5)
                    verticalMargin = dip(2.5f)
                    backgroundColor = Color.WHITE
                }

                linearLayout {
                    lparams(width = matchParent, height = wrapContent)
                    orientation = LinearLayout.VERTICAL

                    verticalLayout {
                        lparams {
                            leftMargin = dip(10)
                            topMargin = dip(10)
                            bottomMargin = dip(10)
                        }

                        textView {
                            text = "Terlaris"
                            textSize = 18f
                            textColorResource = R.color.colorText
                        }

                        textView {
                            text = "lorem ipsum dolor sit amet"
                            textSize = 12f
                            textColorResource = R.color.colorText
                        }
                    }

                    relativeLayout {
                        lparams(width = matchParent, height = wrapContent)

                        progressBarMerchantBestSeller = progressBar { }.lparams {
                            width = wrapContent
                            height = wrapContent
                            centerInParent()
                        }

                        rvMerchantBestSeller = recyclerView {
                            lparams(width = matchParent, height = wrapContent)
                            id = R.id.rv_merchant_best_seller
                            layoutManager = LinearLayoutManager(ctx, LinearLayout.HORIZONTAL, false)
                        }
                    }
                }
            }
        }
    }
}