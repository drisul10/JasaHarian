package com.jasaharian.modules.home

interface HomeView {
    fun showMenuFavorite()
    fun showMenuPromo()
    fun showLoadingMenuFavorite()
    fun hideLoadingMenuFavorite()
    fun showLoadingMenuPromo()
    fun hideLoadingMenuPromo()
}