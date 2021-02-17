package com.example.guidekmm.androidApp.mainFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.guidekmm.androidApp.R

class MainFragment : Fragment() {
    val COUNT_COLOMN = 3
    lateinit var rv_characters: RecyclerView
    lateinit var adapterCharacter : AdapterCharacter
    val viewModel by lazy { ViewModelProvider(this).get(ViewModelMainFragment::class.java) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        rv_characters = view.findViewById(R.id.rv_recycler_character)
        initRecycler()
        observers()
        return view
    }

    private fun observers() {
        viewModel.listCharacters.observe(viewLifecycleOwner, Observer {
            adapterCharacter.addAndNotify(it)
        })
    }

    private fun initRecycler() {
        adapterCharacter = AdapterCharacter()
        val gridLayoutManager = GridLayoutManager(context,COUNT_COLOMN)
        rv_characters.adapter = adapterCharacter
        rv_characters.layoutManager = gridLayoutManager
    }
}