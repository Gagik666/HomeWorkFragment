package com.example.fragmenthomeworks.Task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenthomeworks.R
import com.example.fragmenthomeworks.Task2.Adapter.GamesAdapter

class tst : AppCompatActivity() {
    lateinit var adapter: GamesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tst)


        val rvtst =  findViewById<RecyclerView>(R.id.rvtst)
        rvtst.layoutManager = LinearLayoutManager(this )
        adapter = GamesAdapter(GamelLists.userList, GamelLists.gameList)
        rvtst.adapter = adapter

    }
}
