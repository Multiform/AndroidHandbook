package com.multiform.androidhandbook.utils

import android.content.Intent
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import com.multiform.androidhandbook.MainActivity
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.models.ListArticleItem
import com.multiform.androidhandbook.ui.screens.ArticleActivity

lateinit var APP_ACTIVITY: AppCompatActivity

fun openArticle(item: ListArticleItem) {
    val intent = Intent(APP_ACTIVITY, ArticleActivity::class.java)
    intent.putExtra(KEY_ITEM_ARTICLE, item)
    APP_ACTIVITY.startActivity(intent)
}

fun showToast(message: String) {
    Toast.makeText(APP_ACTIVITY, message, Toast.LENGTH_SHORT).show()
}

fun restartActivity() {
    APP_ACTIVITY.finish()
    APP_ACTIVITY.startActivity(Intent(APP_ACTIVITY, MainActivity::class.java))
}

fun replaceFragment(fragment: Fragment, isAddToBackStack: Boolean = true) {
    if (isAddToBackStack) {
        APP_ACTIVITY.supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.container, fragment)
            .commit()
    } else {
        APP_ACTIVITY.supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }
}

@Suppress("DEPRECATION")
fun setColorSearch(searchView: SearchView) {
    val iconSearch = searchView.findViewById<ImageView>(androidx.appcompat.R.id.search_button)
    val iconVoice = searchView.findViewById<ImageView>(androidx.appcompat.R.id.search_voice_btn)
    val iconClose = searchView.findViewById<ImageView>(androidx.appcompat.R.id.search_close_btn)
    val iconMag = searchView.findViewById<ImageView>(androidx.appcompat.R.id.search_mag_icon)
    val iconGo = searchView.findViewById<ImageView>(androidx.appcompat.R.id.search_go_btn)
    val textSearch = searchView.findViewById<SearchView.SearchAutoComplete>(androidx.appcompat.R.id.search_src_text)
    iconSearch.setColorFilter(APP_ACTIVITY.resources.getColor(R.color.color_menu_icons))
    iconVoice.setColorFilter(APP_ACTIVITY.resources.getColor(R.color.color_menu_icons))
    iconClose.setColorFilter(APP_ACTIVITY.resources.getColor(R.color.color_menu_icons))
    iconMag.setColorFilter(APP_ACTIVITY.resources.getColor(R.color.color_menu_icons))
    iconGo.setColorFilter(APP_ACTIVITY.resources.getColor(R.color.color_menu_icons))
    textSearch.setHintTextColor(APP_ACTIVITY.resources.getColor(R.color.color_menu_icons))
    textSearch.setTextColor(APP_ACTIVITY.resources.getColor(R.color.color_menu_icons))
}