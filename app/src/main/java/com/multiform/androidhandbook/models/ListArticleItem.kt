package com.multiform.androidhandbook.models

import android.graphics.Typeface
import android.view.View
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.ui.screens.ArticleFragment
import com.multiform.androidhandbook.utils.replaceFragment
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_list.*

class ListArticleItem (
    val title: String,
    val res_ic: Int,
    val isBold: Boolean = false,
    val text: String = ""
) : Item() {

    override fun getLayout(): Int = R.layout.item_list

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.titleListItem.text = title
        if (isBold) viewHolder.titleListItem.setTypeface(Typeface.DEFAULT, Typeface.BOLD)
        viewHolder.imgListItem.setImageResource(res_ic)
        viewHolder.descriptionTextListItem.text = "sdjfojsof sdhfsd o sidhfoshodf sdhfk  jsk skdkfhsdkhf kshfks ksjhdf jf j ksjdkfh ksjdhf j d jsdfk khsdkfh kshf kshdfk sk ksfksdkfhs kshdfk kfksk ks kshf ksfh skskfhsk fkshf sk shfks  fhskh kfs s khf sksf ksf"

        viewHolder.descriptionBtnListItem.setOnClickListener {
            if (viewHolder.descriptionTextListItem.visibility == View.GONE) {
                viewHolder.descriptionTextListItem.visibility = View.VISIBLE
            } else {
                viewHolder.descriptionTextListItem.visibility = View.GONE
            }
        }

        viewHolder.titleListItem.setOnClickListener {
            replaceFragment(ArticleFragment(id))
        }
    }
}