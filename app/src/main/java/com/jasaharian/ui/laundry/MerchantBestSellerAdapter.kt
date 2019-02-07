package com.jasaharian.ui.laundry

import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.jasaharian.R
import com.jasaharian.data.model.laundry.MerchantBestSeller
import org.jetbrains.anko.*

class MerchantBestSellerAdapter(
    private var list: ArrayList<MerchantBestSeller> = arrayListOf()
) : RecyclerView.Adapter<MerchantBestSellerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MerchantBestSellerAdapter.ViewHolder {
        return ViewHolder(PartialUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.tvName.text = item.name
        holder.ivBadge.setImageResource(item.badge)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.find(R.id.tv_name_merchant_best_seller)
        var ivBadge: ImageView = itemView.find(R.id.iv_badge_merchant_best_seller)
    }

    private inner class PartialUI : AnkoComponent<ViewGroup> {
        override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
            linearLayout {
                lparams(width = wrapContent, height = wrapContent)
                orientation = LinearLayout.VERTICAL

                linearLayout {
                    lparams(width = dip(80), height = dip(120)) {
                        horizontalMargin = dip(5)
                    }
                    orientation = LinearLayout.VERTICAL

                    imageView {
                        id = R.id.iv_badge_merchant_best_seller
                    }.lparams(width = dip(80), height = dip(80)) {
                        gravity = Gravity.CENTER_HORIZONTAL
                    }

                    textView {
                        id = R.id.tv_name_merchant_best_seller
                        gravity = Gravity.CENTER_HORIZONTAL
                        textSize = 12f
                        textColorResource = R.color.colorText
                        gravity = Gravity.START
                        leftPadding = dip(5)
                        rightPadding = dip(10)
                    }
                }
            }
        }
    }
}