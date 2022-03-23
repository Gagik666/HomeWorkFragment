package com.example.fragmenthomeworks.Task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmenthomeworks.R

class firstTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_task)
        val btnClose = findViewById<Button>(R.id.btnClose)
        btnClose.setOnClickListener {
            finish()
        }

        replaceFt(FirstFragment())

    }

    fun replaceFt(fragment: Fragment) {
        val backStateName = fragment.javaClass.name
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.firstTaskCountainer, FirstFragment())
            .addToBackStack(backStateName)
            .commit()
    }
}