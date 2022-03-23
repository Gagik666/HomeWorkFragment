package com.example.fragmenthomeworks.Fragments

import android.os.Bundle
import android.os.CountDownTimer
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.fragmenthomeworks.R
import com.example.fragmenthomeworks.Task2.GamelLists
import kotlin.random.Random

class DiceFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_dice, container, false)
        val btnSuffle = view.findViewById<Button>(R.id.btnSuffle)
        val btnExit = view.findViewById<Button>(R.id.btnExit)
        var timerLeft: CountDownTimer? = null
        val tvRp1 = view.findViewById<TextView>(R.id.tvRP1)
        val tvRp2 = view.findViewById<TextView>(R.id.tvRP2)
        val tvNP1 = view.findViewById<TextView>(R.id.tvNP1)
        val tvNP2 = view.findViewById<TextView>(R.id.tvNP2)
        tvNP1.text = this.arguments?.getString("Name1").toString()
        tvNP2.text = this.arguments?.getString("Name2").toString()
        var l = 0
        var r = 0
        val imgDiceRight = view.findViewById<ImageView>(R.id.imgDiceRight)
        val imgDiceLeft = view.findViewById<ImageView>(R.id.imgDiceLeft)
        val tvSuffleResultLeft = view.findViewById<TextView>(R.id.tvSuffleResultLeft)
        val tvSuffleResultRight = view.findViewById<TextView>(R.id.tvSuffleResultRight)

        btnSuffle.setOnClickListener {

            var counterL = Random.nextInt(5)
            var counterR = Random.nextInt(5)

            timerLeft?.cancel()
            timerLeft = object : CountDownTimer(3000, 80) {
                override fun onTick(p0: Long) {
                    counterL++
                    if (counterL > 5) counterL = 0
                    imgDiceLeft.setImageResource(GamelLists.imgDiceList[counterL])

                    counterR++
                    if (counterR > 5) counterR = 0
                    imgDiceRight.setImageResource(GamelLists.imgDiceList[counterR])

                }

                override fun onFinish() {
                    tvSuffleResultLeft.text = (counterL + 1).toString()
                    tvSuffleResultRight.text = (counterR +1).toString()
                    if (counterL + 1 > counterR + 1) l++
                    if (counterR + 1 > counterL + 1) r++
                    tvRp1.text = l.toString()
                    tvRp2.text = r.toString()

                }
            }.start()

        }
        btnExit.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("tst", 5)
            val fragment = MainFragment()
            fragment.arguments = bundle
            val backStateNmae1 = fragment.javaClass.name
            fragmentManager?.beginTransaction()?.replace(R.id.ftSecondTaskContainer, fragment)?.addToBackStack(backStateNmae1)?.commit()

        }

        return view
    }


}