package com.example.fragmenthomeworks.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenthomeworks.R
import com.example.fragmenthomeworks.Task2.Adapter.GamesAdapter
import com.example.fragmenthomeworks.Task2.GamelLists
import com.example.fragmenthomeworks.Task2.Model.UserModel

class MainFragment : Fragment() {
    lateinit var adapter: GamesAdapter
    lateinit var player1 : String
    lateinit var player2 : String
             var result11 = 0
             var result12 = 0
             var result21 = 0
             var result22 = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viev =  inflater.inflate(R.layout.fragment_main, container, false)
        val rvGames = viev.findViewById<RecyclerView>(R.id.rvGames)
        player1 = this.arguments?.getString("p1").toString()
        player2 = this.arguments?.getString("p2").toString()

        GamelLists.userList.add(UserModel(player1, player2, result11, result12))
        GamelLists.userList.add(UserModel(player1, player2, result21, result22))
        rvGames.layoutManager = LinearLayoutManager(this.context)
        adapter = GamesAdapter(GamelLists.userList, GamelLists.gameList) {
            if (it == 0) {
                val bundle = Bundle()
                bundle.putString("Name1", player1)
                bundle.putString("Name2", player2)
                val fragment1 = TicTacToeFragment()
                fragment1.arguments = bundle
                val backStateNmae = fragment1.javaClass.name
                fragmentManager?.beginTransaction()?.add(R.id.ftSecondTaskContainer, fragment1 )?.addToBackStack(backStateNmae)?.commit()
            }
            if (it == 1) {
                val bundle = Bundle()
                bundle.putString("Name1", player1)
                bundle.putString("Name2", player2)
                val fragment2 = DiceFragment()
                fragment2.arguments = bundle
                val backStateName = fragment2.javaClass.name
                fragmentManager?.beginTransaction()?.add(R.id.ftSecondTaskContainer, fragment2)?.addToBackStack(backStateName)?.commit()
            }
        }
        rvGames.adapter = adapter
        return viev
    }

}