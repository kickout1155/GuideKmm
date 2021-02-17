package com.example.guidekmm.androidApp.mainFragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.guidekmm.shared.modelNetwork.Character
import com.example.guidekmm.shared.network.CoroutineForMulti
import com.example.guidekmm.shared.network.DownloadMainApi
import com.example.guidekmm.shared.network.ListenerMainCharacter
import kotlinx.coroutines.CoroutineScope

class ViewModelMainFragment(application: Application):AndroidViewModel(application),
    ListenerMainCharacter,CoroutineForMulti {

    private val _listCharacters = MutableLiveData<MutableList<Character>>()
    val listCharacters: LiveData<MutableList<Character>> = _listCharacters

    init {
        downloadCharacter()
    }

    private fun downloadCharacter() {
        DownloadMainApi(this,this).download()
    }

    override fun postList(list: MutableList<Character>) {
        _listCharacters.postValue(list)
    }

    override fun getScope(): CoroutineScope {
        return viewModelScope
    }
}