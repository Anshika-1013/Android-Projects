package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class DashBoard : AppCompatActivity() {

    private lateinit var timeFragment: TimeFragment
    private lateinit var victoriesFragment: VictoriesFragment
    private lateinit var scoresFragment: ScoresFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        timeFragment = TimeFragment()
        victoriesFragment = VictoriesFragment()
        scoresFragment = ScoresFragment()

        // Find the buttons
        val timeButton = findViewById<Button>(R.id.timebutton1)
        val victoriesButton = findViewById<Button>(R.id.buttontwo)
        val scoresButton = findViewById<Button>(R.id.buttonthree)

        // Set OnClickListener for the timeButton
        timeButton.setOnClickListener {
            replaceFragment(timeFragment)
        }

        // Set OnClickListener for the victoriesButton
        victoriesButton.setOnClickListener {
            replaceFragment(victoriesFragment)
        }

        // Set OnClickListener for the scoresButton
        scoresButton.setOnClickListener {
            replaceFragment(scoresFragment)
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        if (!fragment.isAdded) {
            transaction.add(R.id.fragment_container, fragment)
        } else {
            transaction.show(fragment)
        }
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        transaction.commit()
    }
}
