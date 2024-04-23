package com.example.app8

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_nav)

        navView.setNavigationItemSelectedListener(this)

        actionBarDrawerToggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, HomeFragment()).commit()
                    true
                }
                R.id.navigation_dashboard -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, ShareFragment()).commit()
                    true
                }
                R.id.navigation_notifications -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, SettingsFragment()).commit()
                    true
                }
                else -> false
            }
        }

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.APPATHON -> {
                val packageName = "com.example.foodcommunity"
                val className = "com.example.foodcommunity.MainActivity" // Replace with the main activity of the target app
                val intent = Intent().apply {
                    component = ComponentName(packageName, className)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                try {
                    startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(this, "App1 is not installed", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.cia2 -> {
                val packageName = "com.example.quiz"
                val className = "com.example.quiz..MainActivity" // Replace with the main activity of the target app
                val intent = Intent().apply {
                    component = ComponentName(packageName, className)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                try {
                    startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(this, "App1 is not installed", Toast.LENGTH_SHORT).show()
                }
            }

            R.id.nav_hello -> {
                val packageName = "com.example.myapplication"
                val className = "com.example.myapplication.MainActivity" // Replace with the main activity of the target app
                val intent = Intent().apply {
                    component = ComponentName(packageName, className)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                try {
                    startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(this, "App1 is not installed", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.nav_calc -> {
                val packageName = "com.example.calculator"
                val className = "com.example.calculator.MainActivity" // Replace with the main activity of the target app
                val intent = Intent().apply {
                    component = ComponentName(packageName, className)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                try {
                    startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(this, "App2 is not installed", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.nav_Fragments -> {
                val packageName = "com.example.quiz"
                val className = "com.example.quiz.MainActivity" // Replace with the main activity of the target app
                val intent = Intent().apply {
                    component = ComponentName(packageName, className)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                try {
                    startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(this, "App2 is not installed", Toast.LENGTH_SHORT).show()
                }

            }
            R.id.nav_alc -> {
                val packageName = " com.example.sampletest"
                val className = " com.example.sampletest.MainActivity" // Replace with the main activity of the target app
                val intent = Intent().apply {
                    component = ComponentName(packageName, className)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                try {
                    startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(this, "App2 is not installed", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.nav_lac -> {
                val packageName = "com.example.lab_5"
                val className = "com.example.lab_5.MainActivity" // Replace with the main activity of the target app
                val intent = Intent().apply {
                    component = ComponentName(packageName, className)
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                try {
                    startActivity(intent)
                } catch (e: ActivityNotFoundException) {
                    Toast.makeText(this, "App2 is not installed", Toast.LENGTH_SHORT).show()
                }
            }

        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            onBackPressedDispatcher.onBackPressed()
        }
    }
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        actionBarDrawerToggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        actionBarDrawerToggle.onConfigurationChanged(newConfig)
    }
}
