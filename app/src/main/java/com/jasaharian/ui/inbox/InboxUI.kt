package com.jasaharian.ui.inbox

import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.relativeLayout

class InboxUI<T> : AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent)
        }
    }
}