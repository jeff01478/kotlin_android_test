package com.example.kotlin_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var resultText: TextView
    lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        good()
    }

    fun rollDice(){
        val randomInt = (1..6).random()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        resultText.text = randomInt.toString()
    }

    fun good(){
        resultText = findViewById(R.id.result_text)
        rollButton = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}
    }

}