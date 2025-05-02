package com.example.quezapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //val welcomeText: TextView = findViewById(R.id.textView)
        val startButton: Button = findViewById(R.id.button)

        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
        }
    }
}

