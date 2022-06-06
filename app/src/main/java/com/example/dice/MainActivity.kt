package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val Btn : Button = findViewById(R.id.Btn_Up)
        Btn.setOnClickListener{
            rollDice()
        }
    }
    private fun rollDice() {
        val ranval = Random.nextInt(1,7)
        val diceval = when(ranval){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val DiceImag : ImageView = findViewById(R.id.Dice1)
        DiceImag.setImageResource(diceval)
        Toast.makeText(this,"You got $ranval",Toast.LENGTH_SHORT).show()
    }
}


