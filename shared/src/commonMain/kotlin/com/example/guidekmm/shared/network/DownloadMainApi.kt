package com.example.guidekmm.shared.network
import kotlinx.coroutines.launch

class DownloadMainApi(val listener : ListenerMainCharacter,val scope : CoroutineForMulti) {

    fun download() {
        val httpClient = HttpKtorNetwork()
        val job = scope.getScope().launch {
            val result = httpClient.downloadCharacter()
            listener.postList(result)
        }
    }
}