package com.example.fragmenthomeworks.Task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenthomeworks.R
import com.example.fragmenthomeworks.Task2.Adapter.GamesAdapter

class SecondTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)


        val btnClos = findViewById<Button>(R.id.btnClose)
        btnClos.setOnClickListener {
            finish()
        }



        val backStateName = AddUserFragment().javaClass.name
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.ftSecondTaskContainer, AddUserFragment())
            .addToBackStack(backStateName)
            .commit()
    }

}