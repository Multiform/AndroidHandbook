package com.multiform.androidhandbook.ui.base_recycler_view

import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

abstract class BaseAdapter<P>: RecyclerView.Adapter<BaseViewHolder<P>>() {
    protected var mDataList: MutableList<P> = ArrayList()
    private var mCallback: BaseAdapterCallback<P>? = null

    private var hasItems = false

    fun attachCallback(callback: BaseAdapterCallback<P>) {
        this.mCallback = callback
    }

    fun detachCallback() {
        this.mCallback = null
    }

    fun setList(dataList: List<P>) {
        mDataList.addAll(dataList)
        hasItems = true
        notifyDataSetChanged()
    }

    fun updateItems(itemsList: List<P>) {
        mDataList.clear()
        setList(itemsList)
    }

    fun updateItem(position: Int, newItem: P) {
        mDataList[position] = newItem
        notifyItemChanged(position)
    }

    fun addItem(newItem: P) {
        mDataList.add(newItem)
        notifyItemInserted(mDataList.size - 1)
    }

    fun addItemToTop(newItem: P) {
        mDataList.add(0, newItem)
        notifyItemInserted(0)
    }

    fun removeItem(position: Int) {
        mDataList.removeAt(position)
        notifyItemRemoved(position)
    }

    fun clearAllItems() {
        mDataList.clear()
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: BaseViewHolder<P>, position: Int) {
        holder.bind(mDataList[position])

        holder.itemView.setOnClickListener {
            mCallback?.onItemClick(mDataList[position], holder.itemView)
        }
        holder.itemView.setOnLongClickListener {
            if (mCallback == null) {
                false
            } else {
                mCallback!!.onLongClick(mDataList[position], holder.itemView)
            }

        }
    }

    override fun getItemCount(): Int {
        return mDataList.count()
    }
}