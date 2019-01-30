package com.jasaharian.modules.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jasaharian.R
import com.jasaharian.models.HomeMenuFavorite
import com.jasaharian.models.HomeMenuPromo
import com.jasaharian.utils.gone
import com.jasaharian.utils.visible
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.find

class HomeFragment : Fragment(), HomeView {
    private lateinit var presenter: HomePresenter
    private val ui = HomeUI<Fragment>()
    private lateinit var adapterMenuFavorite: MenuFavoriteAdapter
    private lateinit var adapterMenuPromo: MenuPromoAdapter
    private var listMenuFavorite: ArrayList<HomeMenuFavorite> = arrayListOf()
    private var listMenuPromo: ArrayList<HomeMenuPromo> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listMenuFavorite.add(HomeMenuFavorite("Laundry", R.drawable.ic_code_white_24dp))
        adapterMenuFavorite = MenuFavoriteAdapter(listMenuFavorite)

        listMenuPromo.add(HomeMenuPromo(R.drawable.enambelas_sembilan))
        adapterMenuPromo = MenuPromoAdapter(listMenuPromo)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = ui.createView(AnkoContext.create(requireContext(), this))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = HomePresenter(this)
        presenter.getMenuFavorite()
        presenter.getMenuPromo()

        ui.rvListMenuFavorite = find(R.id.rv_list_menu_favorite)
        ui.rvListMenuFavorite.layoutManager = GridLayoutManager(context, 4)
        ui.rvListMenuFavorite.adapter = MenuFavoriteAdapter(listMenuFavorite)
        adapterMenuFavorite.notifyDataSetChanged()

        ui.rvListMenuPromo = find(R.id.rv_list_menu_promo)
        adapterMenuPromo = MenuPromoAdapter(listMenuPromo)
        ui.rvListMenuPromo.adapter = adapterMenuPromo
        adapterMenuPromo.notifyDataSetChanged()
    }

    override fun showMenuFavorite() {
        //TODO: Isi data dari API
    }

    override fun showMenuPromo() {
        //TODO: Isi data dari API
    }

    override fun showLoadingMenuFavorite() {
        ui.progressbarMenuFavorite.visible()
    }

    override fun hideLoadingMenuFavorite() {
        ui.progressbarMenuFavorite.gone()
    }

    override fun showLoadingMenuPromo() {
        ui.progressbarMenuPromo.visible()
    }

    override fun hideLoadingMenuPromo() {
        ui.progressbarMenuPromo.gone()
    }
}