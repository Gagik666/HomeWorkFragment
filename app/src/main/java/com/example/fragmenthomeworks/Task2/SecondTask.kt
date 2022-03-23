package com.example.fragmenthomeworks.Task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmenthomeworks.Fragments.AddUserFragment
import com.example.fragmenthomeworks.Fragments.MainFragment
import com.example.fragmenthomeworks.R

class SecondTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)


        val btnClos = findViewById<Button>(R.id.btnClose)
        btnClos.setOnClickListener {
            finish()
        }


        val btnMenuGame = findViewById<Button>(R.id.btnMenuGame)
        val backStateNmae = MainFragment().javaClass.name
            btnMenuGame.setOnClickListener {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.ftSecondTaskContainer, MainFragment())
                    .addToBackStack(backStateNmae)
                    .commit()
            }



        val backStateName = AddUserFragment().javaClass.name
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.ftSecondTaskContainer, AddUserFragment())
            .addToBackStack(backStateName)
            .commit()
    }

}