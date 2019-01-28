package com.jasaharian.modules.inbox

import org.jetbrains.anko.*

class InboxUI<T> : AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            lparams(width = matchParent, height = matchParent)
        }
    }
}