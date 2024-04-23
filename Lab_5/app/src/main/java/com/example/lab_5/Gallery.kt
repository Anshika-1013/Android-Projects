package com.example.lab_5

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Gallery : AppCompatActivity() {
    private lateinit var emailinp: EditText
    private lateinit var nameinp: EditText
    private lateinit var ageinp: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        emailinp = findViewById(R.id.email)
        nameinp = findViewById(R.id.name)
        ageinp = findViewById(R.id.age)
    }

    override fun onResume() {
        super.onResume()
        // Fetching the stored data from the SharedPreference
        val sh = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val s1 = sh.getString("email", "")
        val s2 = sh.getString("name", "")
        val s3 = sh.getInt("age", 0)

        // Setting the fetched data in the EditTexts
        emailinp.setText(s1)
        nameinp.setText(s2)
        ageinp.setText(s3.toString())
    }

    override fun onPause() {
        super.onPause()
        // Creating a shared pref object with a file name "MySharedPref" in private mode
        val sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val myEdit = sharedPreferences.edit()

        // write all the data entered by the user in SharedPreference and apply
        myEdit.putString("email", emailinp.text.toString())
        myEdit.putString("name", nameinp.text.toString())
        myEdit.putInt("age", ageinp.text.toString().toInt())
        myEdit.apply()
    }
}
