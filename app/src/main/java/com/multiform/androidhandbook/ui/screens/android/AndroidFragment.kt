package com.multiform.androidhandbook.ui.screens.android

import androidx.fragment.app.Fragment
import com.multiform.androidhandbook.objects.AndroidListItems
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.utils.APP_ACTIVITY
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.fragment_android.*

class AndroidFragment : Fragment(R.layout.fragment_android) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Android"

        rcViewAndr.hasFixedSize()
        rcViewAndr.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(AndroidListItems.andrList) }
    }
}