package com.example.guidekmm.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guidekmm.shared.Greeting
import android.widget.TextView
import com.example.guidekmm.androidApp.mainFragment.MainFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container,MainFragment())
            .commit()
    }
    fun greet(): String {
        return Greeting().greeting()
    }

}
