package com.example.guidekmm.androidApp.mainFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.guidekmm.androidApp.R
import com.example.guidekmm.androidApp.base.BaseAdapter
import com.example.guidekmm.shared.modelNetwork.Character

class AdapterCharacter: BaseAdapter<Character, ViewHolderCharacter<Character>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolderCharacter<Character> {
        return ViewHolderCharacter(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler_main_character,parent,false))
    }
}