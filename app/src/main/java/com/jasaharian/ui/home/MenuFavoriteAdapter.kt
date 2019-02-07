package com.jasaharian.ui.home

import android.app.Activity
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
import com.jasaharian.data.model.home.HomeMenuFavorite
import com.jasaharian.ui.laundry.LaundryActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView
import org.jetbrains.anko.sdk27.coroutines.onClick

class MenuFavoriteAdapter(
    private var list: ArrayList<HomeMenuFavorite> = arrayListOf()
) : RecyclerView.Adapter<MenuFavoriteAdapter.MenuFavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuFavoriteViewHolder {
        return MenuFavoriteViewHolder(MenuFavoriteUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: MenuFavoriteViewHolder, position: Int) {
        val itemMenuFavorite = list[position]
        holder.tvName.text = itemMenuFavorite.name
        holder.ivIcon.setImageResource(itemMenuFavorite.icon)

        holder.glParent.onClick {
            holder.loadActivity(itemMenuFavorite)
        }
    }

    override fun getItemCount(): Int = list.size

    inner class MenuFavoriteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.find(R.id.tv_text_menu_favorite)
        var ivIcon: ImageView = itemView.find(R.id.iv_icon_menu_favorite)
        var glParent: GridLayout = itemView.find(R.id.gl_list_menu_favorite)

        fun loadActivity(item: HomeMenuFavorite) {
            when (item.id) {
                "laundry" -> {
                    itemView.context.startActivity<LaundryActivity>()
                    val activity = itemView.context as Activity
                    activity.overridePendingTransition(R.anim.right_in, R.anim.left_out)
                }
            }
        }
    }

    private inner class MenuFavoriteUI : AnkoComponent<ViewGroup> {
        override fun createView(ui: AnkoContext<ViewGroup>): View {
            return with(ui) {
                gridLayout {
                    id = R.id.gl_list_menu_favorite
                    isColumnOrderPreserved = false
                    alignmentMode = GridLayout.ALIGN_BOUNDS
                    bottomPadding = dip(15)

                    linearLayout {
                        lparams(width = matchParent, height = wrapContent)
                        orientation = LinearLayout.VERTICAL
                        gravity = Gravity.CENTER

                        cardView {
                            lparams(width = dip(100), height = dip(100)) {
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
                                    backgroundResource = R.drawable.bg_circle
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