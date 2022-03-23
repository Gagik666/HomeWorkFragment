package com.example.fragmenthomeworks.Task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.fragmenthomeworks.R



class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val edInput = view.findViewById<EditText>(R.id.edInput)
        val btnToGo = view.findViewById<Button>(R.id.btnToGo)

        btnToGo.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("txt", "Result -> ${edInput.text}")
            val fragment = SecondFragment()
            fragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.firstTaskCountainer, fragment)?.commit()
        }
        return  view
    }


}