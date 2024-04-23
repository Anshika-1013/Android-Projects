package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class QuizPanel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_panel)
        val quizButton = findViewById<AppCompatButton>(R.id.quizButton)
        val DashButton = findViewById<Button>(R.id.DashButton)

        quizButton.setOnClickListener {
            val intent = Intent(this, QuizQuestions::class.java)
            startActivity(intent)
        }

        DashButton.setOnClickListener {
            val intent = Intent(this, DashBoard::class.java)
            startActivity(intent)
        }

}}