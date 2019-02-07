package com.jasaharian.ui.laundry

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jasaharian.R
import com.jasaharian.data.model.laundry.Category
import com.jasaharian.data.model.laundry.MerchantBestSeller
import com.jasaharian.data.model.laundry.MerchantPromoted
import com.jasaharian.data.model.laundry.MerchantTopRating
import com.jasaharian.utils.gone
import com.jasaharian.utils.visible
import org.jetbrains.anko.AnkoContext

class LaundryFragment : Fragment(), LaundryContract.View {
    private val ui = LaundryMainUI<Fragment>()
    override lateinit var presenter: LaundryContract.Presenter
    private var listCategory: ArrayList<Category> = arrayListOf()
    private var listMerchantPromoted: ArrayList<MerchantPromoted> = arrayListOf()
    private var listMerchantTopRating: ArrayList<MerchantTopRating> = arrayListOf()
    private var listMerchantBestSeller: ArrayList<MerchantBestSeller> = arrayListOf()
    private lateinit var adapterCategory: CategoryAdapter
    private lateinit var adapterMerchantPromoted: MerchantPromotedAdapter
    private lateinit var adapterMerchantTopRating: MerchantTopRatingAdapter
    private lateinit var adapterMerchantBestSeller: MerchantBestSellerAdapter

    companion object {
        fun newInstance() = LaundryFragment()
    }

    override fun onResume() {
        super.onResume()

        presenter.start()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = ui.createView(AnkoContext.create(requireContext(), this))

    override fun showLoadingCategory() {
        ui.progressBarCategory.visible()
    }

    override fun clearLoadingCategory() {
        ui.progressBarCategory.gone()
    }

    override fun showLoadingMerchantPromoted() {
        ui.progressBarMerchantPromoted.visible()
    }

    override fun clearLoadingMerchantPromoted() {
        ui.progressBarMerchantPromoted.gone()
    }

    override fun showLoadingMerchantTopRating() {
        ui.progressBarMerchantTopRating.visible()
    }

    override fun clearLoadingMerchantTopRating() {
        ui.progressBarMerchantTopRating.gone()
    }

    override fun showLoadingMerchantBestSeller() {
        ui.progressBarMerchantBestSeller.visible()
    }

    override fun clearLoadingMerchantBestSeller() {
        ui.progressBarMerchantBestSeller.gone()
    }

    override fun showCategory() {
        //TODO: data API
        listCategory.add(
            Category(
                "10001",
                "Daily Kiloan",
                R.drawable.gopay
            )
        )
        listCategory.add(Category("10002", "Satuan", R.drawable.gopay))
        listCategory.add(
            Category(
                "10003",
                "Lorem ipsum dolor",
                R.drawable.gopay
            )
        )
        listCategory.add(
            Category(
                "10003",
                "Aneka Seperai",
                R.drawable.gopay
            )
        )
        listCategory.add(
            Category(
                "10003",
                "Aneka Seperai",
                R.drawable.gopay
            )
        )
        listCategory.add(
            Category(
                "10003",
                "Aneka Seperai",
                R.drawable.gopay
            )
        )
        adapterCategory = CategoryAdapter(listCategory)

        ui.rvCategory.adapter = adapterCategory
        adapterCategory.notifyDataSetChanged()
    }

    override fun showMerchantPromoted() {
        //TODO: data API
        listMerchantPromoted.add(
            MerchantPromoted(
                "10003",
                "Abcdef",
                R.drawable.gopay
            )
        )
        adapterMerchantPromoted = MerchantPromotedAdapter(listMerchantPromoted)

        ui.rvMerchantPromoted.adapter = adapterMerchantPromoted
        adapterMerchantPromoted.notifyDataSetChanged()
    }

    override fun showMerchantTopRating() {
        //TODO: data API
        listMerchantTopRating.add(
            MerchantTopRating(
                "10003",
                "Abcdef",
                R.drawable.gopay
            )
        )
        adapterMerchantTopRating = MerchantTopRatingAdapter(listMerchantTopRating)

        ui.rvMerchantTopRating.adapter = adapterMerchantTopRating
        adapterMerchantTopRating.notifyDataSetChanged()
    }

    override fun showMerchantBestSeller() {
        //TODO: data API
        listMerchantBestSeller.add(
            MerchantBestSeller(
                "10003",
                "Abcdef",
                R.drawable.gopay
            )
        )
        adapterMerchantBestSeller = MerchantBestSellerAdapter(listMerchantBestSeller)

        ui.rvMerchantBestSeller.adapter = adapterMerchantBestSeller
        adapterMerchantBestSeller.notifyDataSetChanged()
    }
}