package com.example.lab_5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize buttons
        val scheduleButton: Button = findViewById(R.id.schedule_button)
        val servicesButton: Button = findViewById(R.id.Services)
        val galleryButton: Button = findViewById(R.id.Gallery)
        val button4: Button = findViewById(R.id.button4)

        // Set click listeners
        scheduleButton.setOnClickListener {
            // Launch ScheduleActivity
            val intent = Intent(this, ScheduleActivity::class.java)
            startActivity(intent)
        }

        servicesButton.setOnClickListener {
            // Launch ServicesActivity
            val intent = Intent(this, Services::class.java)
            startActivity(intent)
            finish()
        }

        galleryButton.setOnClickListener {
            // Launch GalleryActivity
            val intent = Intent(this, Gallery::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            // Handle button 4 click event
            val intent = Intent(this, Attendence::class.java)
            startActivity(intent)
        }
    }
}
