package com.jasaharian.modules.home

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class HomePresenter(
    private val view: HomeView
) {
    fun getMenuFavorite() {
        view.showLoadingMenuFavorite()

        doAsync {
            uiThread {
                view.showMenuFavorite()
                view.hideLoadingMenuFavorite()
            }
        }
    }

    fun getMenuPromo() {
        view.showLoadingMenuFavorite()

        doAsync {
            uiThread {
                view.showMenuPromo()
                view.hideLoadingMenuPromo()
            }
        }
    }
}