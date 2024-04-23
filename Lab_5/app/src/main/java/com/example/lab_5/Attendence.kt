package com.example.lab_5
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class Attendence : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendence)
        // Find the Toolbar by its ID
        val topbarattendence: Toolbar = findViewById(R.id.topbarattendence)
        setSupportActionBar(topbarattendence)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        topbarattendence.setNavigationOnClickListener { onBackPressed() }

        // You can access the TextViews in your layout using their IDs
        findViewById<TextView>(R.id.course_name1).text = "Android"
        findViewById<TextView>(R.id.course_atten1).text = "100%"

        findViewById<TextView>(R.id.course_name2).text = "Data Mining"
        findViewById<TextView>(R.id.course_atten2).text = "90%"

        findViewById<TextView>(R.id.course_name3).text = "DCC"
        findViewById<TextView>(R.id.course_atten3).text = "100%"

        findViewById<TextView>(R.id.course_name4).text = "Golang"
        findViewById<TextView>(R.id.course_atten4).text = "90%"
    }}

