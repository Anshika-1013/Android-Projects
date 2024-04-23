package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signupButton: Button = findViewById(R.id.Signup)
        signupButton.setOnClickListener {
            val intent = Intent(this,  QuizPanel::class.java)
            startActivity(intent)
        }
    }
}
