package com.jasaharian.ui.laundry

import android.graphics.Color
import android.support.v7.widget.Toolbar
import android.util.TypedValue
import android.widget.LinearLayout
import com.jasaharian.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.themedToolbar
import org.jetbrains.anko.support.v4.nestedScrollView

class LaundryUI : AnkoComponent<LaundryActivity> {
    lateinit var toolbar: Toolbar

    override fun createView(ui: AnkoContext<LaundryActivity>) = with(ui) {
        linearLayout {
            lparams(width = matchParent, height = matchParent)
            orientation = LinearLayout.VERTICAL
            backgroundColorResource = R.color.colorBackground

            toolbar = themedToolbar {
                lparams(width = matchParent) {
                    minimumHeight =
                        TypedValue.complexToDimension(context.attr(R.attr.actionBarSize).data, resources.displayMetrics)
                            .toInt()
                    height =
                        TypedValue.complexToDimension(context.attr(R.attr.actionBarSize).data, resources.displayMetrics)
                            .toInt()
                }
                elevation = 4f
                padding = dip(2)
                setTitleTextColor(Color.BLACK)
                setSubtitleTextColor(Color.BLACK)
                overflowIcon
                backgroundColor = Color.WHITE
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
}