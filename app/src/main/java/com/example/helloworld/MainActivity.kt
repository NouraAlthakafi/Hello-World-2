package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.Name)
        val Greetings = findViewById<TextView>(R.id.Greetings)
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            Greetings.setText("Hello, ${Name.text}!")
        }
        var FirstNumber = findViewById<EditText>(R.id.FirstNumber)
        var SecondNumber = findViewById<EditText>(R.id.SecondNumber)
        val button = findViewById<Button>(R.id.button)
        var Outcome = findViewById<TextView>(R.id.Outcome)
        button.setOnClickListener {
            Outcome.text= "${FirstNumber.text.toString().toInt() + SecondNumber.text.toString().toInt()}"
        }
    }
}
