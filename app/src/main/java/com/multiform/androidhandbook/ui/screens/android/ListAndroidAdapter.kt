package com.multiform.androidhandbook.ui.screens.android

import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.models.ListArticleItem
import com.multiform.androidhandbook.ui.base_recycler_view.BaseAdapter
import com.multiform.androidhandbook.ui.base_recycler_view.BaseViewHolder
import kotlinx.android.synthetic.main.item_list.view.*

class ListAndroidAdapter : BaseAdapter<ListArticleItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ListArticleItem> {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemId(position: Int): Long {
        return mDataList[position].id
    }
    class ViewHolder(itemView: View) : BaseViewHolder<ListArticleItem>(itemView) {
        private var title = itemView.titleListItem as TextView
        private var img = itemView.imgListItem as ImageView
        private var descriptionBtn = itemView.descriptionBtnListItem as TextView
        private var descriptionText = itemView.descriptionTextListItem as TextView
//        private var pointer = itemView.pointerListItem as ImageView

        override fun bind(model: ListArticleItem) {
            title.text = model.title
            if (model.isBold) title.setTypeface(Typeface.DEFAULT, Typeface.BOLD)
            img.setImageResource(model.res_ic)

            descriptionBtn.setOnClickListener {
                if (descriptionText.visibility == View.GONE) {
                    descriptionText.visibility = View.VISIBLE
//                    pointer.setImageResource(R.drawable.ic_pointer_open)
                } else {
                    descriptionText.visibility = View.GONE
//                    pointer.setImageResource(R.drawable.ic_pointer)
                }
            }
        }
    }
}