package com.example.fragmenthomeworks.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragmenthomeworks.R


class AddUserFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_user, container, false)
        val btnStart = view.findViewById<Button>(R.id.btnStart)
        val edNameP1 = view.findViewById<EditText>(R.id.edNameP1)
        val edNameP2 = view.findViewById<EditText>(R.id.edNameP2)
        btnStart.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("p1", edNameP1.text.toString())
            bundle.putString("p2", edNameP2.text.toString())
            val fragment = MainFragment()
            fragment.arguments = bundle
            val backStateName = fragment.javaClass.name
            fragmentManager?.beginTransaction()?.replace(R.id.ftSecondTaskContainer, fragment)?.addToBackStack(backStateName)?.commit()
        }
        return view
    }

}