package com.example.guidekmm.androidApp.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) :RecyclerView.ViewHolder(itemView) {

    val initUi by lazy { iniUiItem(itemView) }

    init {
        initUi
    }

    abstract fun iniUiItem(itemView: View)

    abstract fun bind(item : T)
}