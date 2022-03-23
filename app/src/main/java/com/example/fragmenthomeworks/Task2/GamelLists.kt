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

    val imgDiceList = listOf(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
    )

}