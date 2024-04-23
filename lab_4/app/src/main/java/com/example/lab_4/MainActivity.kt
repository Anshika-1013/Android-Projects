package com.example.linkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.lab_4.R

class MainActivity2 : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            openActivity2()
        }
    }

    private fun openActivity2() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}
