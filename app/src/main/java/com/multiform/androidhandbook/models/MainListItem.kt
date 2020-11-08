package com.multiform.androidhandbook.models

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.multiform.androidhandbook.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_main_list.*

class MainListItem (
    val title: String,
    val res_ic: Int,
    val list: List<ListArticleItem> = emptyList()
) : Item() {

    override fun getLayout(): Int = R.layout.item_main_list

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.rcViewMainList.visibility = View.GONE
        viewHolder.titleMainListItem.text = title
        viewHolder.imgMainListItem.setImageResource(res_ic)

        viewHolder.rcViewMainList.adapter =
            GroupAdapter<GroupieViewHolder>().apply { addAll(list) }

        val rcView = viewHolder.rcViewMainList as RecyclerView
        viewHolder.itemView.setOnClickListener {
            if (rcView.visibility == View.GONE) {
                rcView.visibility = View.VISIBLE
                viewHolder.pointerMainListItem.setImageResource(R.drawable.ic_pointer_open)
            } else {
                rcView.visibility = View.GONE
                viewHolder.pointerMainListItem.setImageResource(R.drawable.ic_pointer)
            }
        }
    }
}