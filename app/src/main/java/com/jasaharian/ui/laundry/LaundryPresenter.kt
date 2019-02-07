package com.jasaharian.ui.laundry

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class LaundryPresenter(
    private val view: LaundryContract.View
) : LaundryContract.Presenter {

    init {
        view.presenter = this
    }

    override fun start() {
        loadCategory()
        loadMerchantPromoted()
        loadMerchantTopRating()
        loadMerchantBestSeller()
    }

    override fun loadCategory() {
        view.showLoadingCategory()

        doAsync {
            uiThread {
                view.showCategory()
                view.clearLoadingCategory()
            }
        }
    }

    override fun loadMerchantPromoted() {
        view.showLoadingMerchantPromoted()

        doAsync {
            uiThread {
                view.showMerchantPromoted()
                view.clearLoadingMerchantPromoted()
            }
        }
    }

    override fun loadMerchantTopRating() {
        view.showLoadingMerchantTopRating()

        doAsync {
            uiThread {
                view.showMerchantTopRating()
                view.clearLoadingMerchantTopRating()
            }
        }
    }

    override fun loadMerchantBestSeller() {
        view.showLoadingMerchantBestSeller()

        doAsync {
            uiThread {
                view.showMerchantBestSeller()
                view.clearLoadingMerchantBestSeller()
            }
        }
    }
}