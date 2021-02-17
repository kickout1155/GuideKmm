package com.example.guidekmm.shared.network

import com.example.guidekmm.shared.modelNetwork.Character

interface ListenerMainCharacter {

    fun postList(list : MutableList<Character>)

}