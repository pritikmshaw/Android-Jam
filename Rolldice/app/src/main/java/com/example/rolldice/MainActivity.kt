package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            //val toast = Toast.makeText(this , "Dice Rolled" ,Toast.LENGTH_SHORT)
            //toast.show()
            //val resultTextView : TextView = findViewById(R.id.textView)
            //resultTextView.text = "6"
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView : TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}
class Dice (private val numSide: Int) {
    fun roll(): Int {
        return (1..numSide).random()
    }
}