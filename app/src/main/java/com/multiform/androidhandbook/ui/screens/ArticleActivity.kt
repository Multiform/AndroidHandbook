package com.multiform.androidhandbook.ui.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.models.ListArticleItem
import com.multiform.androidhandbook.utils.KEY_ITEM_ARTICLE

class ArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val itemArticle = intent.getSerializableExtra(KEY_ITEM_ARTICLE) as ListArticleItem


    }
}