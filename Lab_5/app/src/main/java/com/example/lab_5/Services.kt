package com.example.lab_5
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Services : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        val users = arrayOf(
            "Gym", "Canteen", "Wifi", "Labs"
        )

        val arrayAdapter: ArrayAdapter<*> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            users
        )

        val mListView = findViewById<ListView>(R.id.list)
        mListView.adapter = arrayAdapter
    }}

