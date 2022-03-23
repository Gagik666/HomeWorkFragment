package com.example.fragmenthomeworks.Task2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmenthomeworks.R
import com.example.fragmenthomeworks.Task2.Model.GameModel
import com.example.fragmenthomeworks.Task2.Model.UserModel

class GamesAdapter(
    private val userList: MutableList<UserModel>,
    private val gamelist: MutableList<GameModel>,
    private val onItemClick: (index: Int) -> Unit
): RecyclerView.Adapter<GamesAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val btnStartGame = itemView.findViewById<Button>(R.id.btnStartGame)
        val img = itemView.findViewById<ImageView>(R.id.img)
        val tvGameName = itemView.findViewById<TextView>(R.id.tvGameName)
        val tvPlayer1 = itemView.findViewById<TextView>(R.id.tvPlayer1)
        val tvResult1 = itemView.findViewById<TextView>(R.id.tvResult1)
        val tvPlayer2 = itemView.findViewById<TextView>(R.id.tvPlayer2)
        val tvResult2 = itemView.findViewById<TextView>(R.id.tvResult2)
        fun bind(userModel: UserModel, gameModel: GameModel, index: Int) {
            tvGameName.text = gameModel.name
            img.setImageResource(gameModel.imgId)
            tvPlayer1.text = userModel.player1
            tvResult1.text = userModel.result1.toString()
            tvPlayer2.text = userModel.player2
            tvResult2.text = userModel.result2.toString()

            btnStartGame.setOnClickListener {
                onItemClick.invoke(index)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_games, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder.bind(userList[position], gamelist[position], position)
    }

    override fun getItemCount() = userList.size
}