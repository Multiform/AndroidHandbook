package com.multiform.androidhandbook.ui.screens.android

import androidx.fragment.app.Fragment
import com.multiform.androidhandbook.Items
import com.multiform.androidhandbook.R
import com.multiform.androidhandbook.utils.APP_ACTIVITY
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import kotlinx.android.synthetic.main.fragment_android.*

class AndroidFragment : Fragment(R.layout.fragment_android) {

//    private lateinit var mRecyclerView: RecyclerView
//    private lateinit var mAdapter: AndroidAdapter

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Android"

//        mRecyclerView = rcView
//        mAdapter = AndroidAdapter()
//        mRecyclerView.adapter = mAdapter
//
//        mAdapter.setList(Items.andrList)
//
//        mAdapter.attachCallback(object : BaseAdapterCallback<ListArticleItem> {
//            override fun onItemClick(model: ListArticleItem, view: View) {
//                val rcView = view.rcViewAndroid as RecyclerView
//                if (rcView.visibility == View.GONE) {
//                    rcView.visibility = View.VISIBLE
//                    view.pointerAndr.setImageResource(R.drawable.ic_pointer_open)
//                } else {
//                    rcView.visibility = View.GONE
//                    view.pointerAndr.setImageResource(R.drawable.ic_pointer)
//                }
//            }
//        })

        rcView.hasFixedSize()
        rcView.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(Items.andrList) }
    }
}