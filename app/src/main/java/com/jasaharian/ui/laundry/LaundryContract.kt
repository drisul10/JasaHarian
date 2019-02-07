package com.jasaharian.ui.laundry

import com.jasaharian.base.BasePresenter
import com.jasaharian.base.BaseView

interface LaundryContract {
    interface View : BaseView<Presenter> {
        //category
        fun showLoadingCategory()

        fun clearLoadingCategory()
        fun showCategory()

        //merchant promoted
        fun showLoadingMerchantPromoted()

        fun clearLoadingMerchantPromoted()
        fun showMerchantPromoted()

        //merchant top rating
        fun showLoadingMerchantTopRating()

        fun clearLoadingMerchantTopRating()
        fun showMerchantTopRating()

        //merchant best seller
        fun showLoadingMerchantBestSeller()

        fun clearLoadingMerchantBestSeller()
        fun showMerchantBestSeller()
    }

    interface Presenter : BasePresenter {
        fun loadCategory()
        fun loadMerchantPromoted()
        fun loadMerchantTopRating()
        fun loadMerchantBestSeller()
    }
}