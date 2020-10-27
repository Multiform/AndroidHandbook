package com.multiform.androidhandbook.ui.screens

import androidx.fragment.app.Fragment
import com.multiform.androidhandbook.Items
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.models.ListArticleItem
import com.multiform.androidhandbook.utils.APP_ACTIVITY
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment(val id: Long) : Fragment(R.layout.fragment_article) {

    override fun onResume() {
        super.onResume()

        var str = ""
        Items.andrList.forEach { item ->
            item.list.forEach {
                val im = it as ListArticleItem
                if (im.id == id) str = im.title
            }
        }
        APP_ACTIVITY.title = str
        textArticle.text = str
    }
}