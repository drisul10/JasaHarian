package com.jasaharian.modules.home

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.jasaharian.R
import com.jasaharian.models.HomeMenuPromo
import org.jetbrains.anko.*

class MenuPromoAdapter(private var list: ArrayList<HomeMenuPromo> = arrayListOf()) :
    RecyclerView.Adapter<MenuPromoAdapter.MenuPromoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuPromoViewHolder {
        return MenuPromoViewHolder(MenuPromoUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: MenuPromoViewHolder, position: Int) {
        val itemMenuPromo = list[position]
        holder.ivBanner.setImageResource(itemMenuPromo.banner)
    }

    override fun getItemCount(): Int = list.size

    inner class MenuPromoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivBanner: ImageView = itemView.find(R.id.iv_banner_menu_promo)
    }

    class MenuPromoUI : AnkoComponent<ViewGroup> {
        override fun createView(ui: AnkoContext<ViewGroup>): View {
            return with(ui) {
                linearLayout {
                    lparams(width = wrapContent, height = wrapContent) {
                        topMargin = dip(5)
                        bottomMargin = dip(5)
                    }

                    backgroundColor = Color.WHITE

                    imageView {
                        id = R.id.iv_banner_menu_promo
                        adjustViewBounds = true
                        scaleType = ImageView.ScaleType.FIT_CENTER
                    }.lparams(width = matchParent, height = dip(200))
                }
            }
        }
    }
}