package com.example.guidekmm.androidApp.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T, VH : BaseViewHolder<T>> : RecyclerView.Adapter<VH>() {

    var items = mutableListOf<T>()

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(i: Int): T {
        return items[i]
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun addAndNotify(list: MutableList<T>){
        items.addAll(list)
        notifyDataSetChanged()
    }
}