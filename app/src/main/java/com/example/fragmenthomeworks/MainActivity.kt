package com.example.fragmenthomeworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmenthomeworks.Task1.SecondFragment
import com.example.fragmenthomeworks.Task1.firstTask
import com.example.fragmenthomeworks.Task2.SecondTask
import com.example.fragmenthomeworks.Task2.tst

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnFirstTask = findViewById<Button>(R.id.btnFirstTask)
        val btnSecondTask = findViewById<Button>(R.id.btnSecondTask)

        btnFirstTask.setOnClickListener {
            val itFirstTask = Intent(this, firstTask::class.java)
            startActivity(itFirstTask)
        }

        btnSecondTask.setOnClickListener {
            val itSecondTask = Intent(this, SecondTask::class.java)
            startActivity(itSecondTask)
        }
    }
}