package com.example.guidekmm.androidApp.mainFragment

import android.content.Context
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.bumptech.glide.Glide
import com.example.guidekmm.androidApp.R
import com.example.guidekmm.androidApp.base.BaseViewHolder
import com.example.guidekmm.shared.modelNetwork.Character

class ViewHolderCharacter<T>(itemView: View) : BaseViewHolder<Character>(itemView) {
    lateinit var iv_imageCharacter: AppCompatImageView
    lateinit var tv_nameCharacter: AppCompatTextView
    //var context: Context? = null
    override fun iniUiItem(itemView: View) {
        iv_imageCharacter = itemView.findViewById(R.id.iv_item_character)
        tv_nameCharacter = itemView.findViewById(R.id.tv_item_name_character)
    }

    override fun bind(item: Character) {
        tv_nameCharacter.text = item.Name
        Glide.with(itemView.context)
            .load(item.Capture)
            .into(iv_imageCharacter)

    }
}