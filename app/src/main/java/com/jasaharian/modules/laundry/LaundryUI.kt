package com.jasaharian.modules.laundry

import android.graphics.Color
import org.jetbrains.anko.*

class LaundryUI : AnkoComponent<LaundryActivity> {
    override fun createView(ui: AnkoContext<LaundryActivity>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent)
            backgroundColor = Color.BLUE

            textView {
                text = "tes"
            }
        }
    }
}