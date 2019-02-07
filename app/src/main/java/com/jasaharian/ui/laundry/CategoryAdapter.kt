package com.jasaharian.ui.laundry

import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.jasaharian.R
import com.jasaharian.data.model.laundry.Category
import org.jetbrains.anko.*

class CategoryAdapter(
    private var list: ArrayList<Category> = arrayListOf()
) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.ViewHolder {
        return ViewHolder(PartialUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]

        holder.tvName.text = item.name
        holder.ivBadge.setImageResource(item.logo)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.find(R.id.tv_name_item_service_laundry)
        var ivBadge: ImageView = itemView.find(R.id.iv_badge_item_service_laundry)
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
                        id = R.id.iv_badge_item_service_laundry
                    }.lparams(width = dip(80), height = dip(80)) {
                        gravity = Gravity.CENTER_HORIZONTAL
                    }

                    textView {
                        id = R.id.tv_name_item_service_laundry
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