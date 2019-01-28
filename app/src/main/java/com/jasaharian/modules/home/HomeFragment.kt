package com.jasaharian.modules.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jasaharian.R
import com.jasaharian.models.HomeMenuFavorite
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.find

class HomeFragment : Fragment() {

    private val ui = HomeUI<Fragment>()
    private lateinit var rvListMenuFavorite: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        ui.createView(AnkoContext.create(requireContext(), this))

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val list: ArrayList<HomeMenuFavorite> = arrayListOf()
        list.add(HomeMenuFavorite("1", R.drawable.ic_account_circle_black_24dp))
        list.add(HomeMenuFavorite("3", R.drawable.ic_account_circle_black_24dp))
        list.add(HomeMenuFavorite("4", R.drawable.ic_account_circle_black_24dp))
        list.add(HomeMenuFavorite("5", R.drawable.ic_account_circle_black_24dp))
        list.add(HomeMenuFavorite("6", R.drawable.ic_account_circle_black_24dp))
        list.add(HomeMenuFavorite("7", R.drawable.ic_email_black_24dp))
        list.add(HomeMenuFavorite("8", R.drawable.ic_account_circle_black_24dp))
        list.add(HomeMenuFavorite("9", R.drawable.ic_account_circle_black_24dp))

        rvListMenuFavorite = find(R.id.rv_list_menu_favorite)
        rvListMenuFavorite.adapter = MenuFavoriteAdapter(list)
    }
}