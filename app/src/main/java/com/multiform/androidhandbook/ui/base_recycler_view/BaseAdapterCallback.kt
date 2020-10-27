package com.multiform.androidhandbook.ui.base_recycler_view

import android.view.View

interface BaseAdapterCallback<T> {
    fun onItemClick(model: T, view: View)
    fun onLongClick(model: T, view: View): Boolean {
        return true
    }
}