package com.multiform.androidhandbook.ui.screens.android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.models.ListArticleItem
import com.multiform.androidhandbook.ui.base_recycler_view.BaseAdapter
import com.multiform.androidhandbook.ui.base_recycler_view.BaseViewHolder
import kotlinx.android.synthetic.main.item_main_list.view.*

class AndroidAdapter : BaseAdapter<ListArticleItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ListArticleItem> {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_list, parent, false))
    }

    override fun getItemId(position: Int): Long {
        return mDataList[position].id
    }

    class ViewHolder(itemView: View) : BaseViewHolder<ListArticleItem>(itemView) {
        private var title = itemView.titleMainListItem as TextView
        private var ic = itemView.imgMainListItem as ImageView
        private var rcView = itemView.rcViewMainList as RecyclerView
        private var adapter = ListAndroidAdapter()

        init {
            rcView.adapter = adapter
        }

        override fun bind(model: ListArticleItem) {
            title.text = model.title
            ic.setImageResource(model.res_ic)
        }
    }
}