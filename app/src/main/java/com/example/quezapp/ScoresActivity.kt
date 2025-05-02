package com.example.quezapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)  // Make sure this matches your layout XML filename

        val scoreTextView: TextView = findViewById(R.id.scoreTextView)
        val feedbackTextView: TextView = findViewById(R.id.feedbackTextView)
        val reviewButton: Button = findViewById(R.id.reviewButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        // Get the score passed from the Flashcard activity
        val score = intent.getIntExtra("score", 0)

        // Set score text
        scoreTextView.text = "Your Score: $score / 5"

        // Give feedback
        if (score >= 3) {
            feedbackTextView.text = "Great job!"
        } else {
            feedbackTextView.text = "Keep practicing!"
        }

        // Set up Review button
        reviewButton.setOnClickListener {
            val intent = Intent(this, ScoresActivity::class.java)
            startActivity(intent)
        }

        // Set up Exit button
        exitButton.setOnClickListener {
            finishAffinity() // Close the app
        }
    }
}
