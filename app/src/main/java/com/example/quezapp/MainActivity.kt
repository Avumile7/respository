package com.example.quezapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val welcomeText: TextView = findViewById(R.id.textView)  //Removed as the id textView does not exist
        val startButton: Button = findViewById(R.id.button)

        // Set an action to perform when the start button is clicked
        startButton.setOnClickListener {
            // Create an Intent to start the FlashcardActivity
            val intent = Intent(this, Flashcard::class.java)  //Changed Flashcard to FlashcardActivity
            startActivity(intent) // Start the new activity
            // finish() // Optional: Close MainActivity so user can't go back to it
        }
    }
}


