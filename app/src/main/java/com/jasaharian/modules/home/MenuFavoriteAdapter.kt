package com.jasaharian.modules.home

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.jasaharian.R
import com.jasaharian.models.HomeMenuFavorite
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

class MenuFavoriteAdapter(var list: ArrayList<HomeMenuFavorite> = arrayListOf()) : RecyclerView.Adapter<MenuFavoriteAdapter.MenuFavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuFavoriteViewHolder {
        return MenuFavoriteViewHolder(MenuFavoriteUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: MenuFavoriteViewHolder, position: Int) {
        val itemMenuFavorite = list[position]
        holder.tvText.text = itemMenuFavorite.text
        holder.ivIcon.setImageResource(itemMenuFavorite.icon)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MenuFavoriteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvText: TextView = itemView.findViewById(R.id.tv_text_menu_favorite)
        var ivIcon: ImageView = itemView.findViewById(R.id.iv_icon_menu_favorite)
    }

    class MenuFavoriteUI : AnkoComponent<ViewGroup> {
        override fun createView(ui: AnkoContext<ViewGroup>): View {
            return with(ui) {
                gridLayout {
                    isColumnOrderPreserved = false
                    alignmentMode = GridLayout.ALIGN_BOUNDS

                    linearLayout {
                        lparams(width = matchParent, height = wrapContent)
                        orientation = LinearLayout.VERTICAL
                        gravity = Gravity.CENTER

                        cardView {
                            lparams(width = dip(70), height = dip(70)) {
                                margin = dip(5)
                            }
                            backgroundColor = Color.WHITE

                            linearLayout {
                                lparams(width = matchParent, height = matchParent)
                                orientation = LinearLayout.VERTICAL
                                gravity = Gravity.CENTER
                                padding = dip(5)

                                imageView {
                                    id = R.id.iv_icon_menu_favorite
                                    backgroundResource = R.drawable.circle_bg_purple
                                }.lparams(width = dip(35), height = dip(35))

                                textView {
                                    id = R.id.tv_text_menu_favorite
                                    gravity = Gravity.CENTER
                                    textColorResource = R.color.colorText
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}