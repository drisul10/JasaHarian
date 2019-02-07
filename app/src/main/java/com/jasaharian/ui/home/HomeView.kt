package com.jasaharian.ui.home

interface HomeView {
    fun showMenuFavorite()
    fun showMenuPromo()
    fun showLoadingMenuFavorite()
    fun hideLoadingMenuFavorite()
    fun showLoadingMenuPromo()
    fun hideLoadingMenuPromo()
}