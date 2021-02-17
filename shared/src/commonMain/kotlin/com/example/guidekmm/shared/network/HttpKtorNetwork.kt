package com.example.guidekmm.shared.network

import com.example.guidekmm.shared.modelNetwork.Character
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*

class HttpKtorNetwork() {
    private val client by lazy {
        HttpClient(HttpClient().engine) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                    isLenient = true
                })
            }
        }
    }

    companion object{
        val baseUrl = "https://www.foodstart.ru"
    }

    suspend fun downloadCharacter():MutableList<Character>{
         return client.get<MutableList<Character>>{ url ("$baseUrl/guide/hs/getAllHeroes")}
    }
}