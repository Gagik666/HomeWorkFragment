package com.example.fragmenthomeworks.Task2

import com.example.fragmenthomeworks.R
import com.example.fragmenthomeworks.Task2.Model.GameModel
import com.example.fragmenthomeworks.Task2.Model.UserModel

object GamelLists {
    val userList = mutableListOf<UserModel>()

    val gameList = mutableListOf (
        GameModel("Tic Tac Toe", R.drawable.tic_tac_toe),
        GameModel( "Dice", R.drawable.dice)
    )

}