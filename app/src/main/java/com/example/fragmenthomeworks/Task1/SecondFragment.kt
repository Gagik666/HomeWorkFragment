package com.example.fragmenthomeworks.Task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmenthomeworks.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       val view = inflater.inflate(R.layout.fragment_second, container, false)
        val tvResult = view.findViewById<TextView>(R.id.tvResult)
        tvResult.text =  this.arguments?.get("txt").toString()
        return view
    }


}