package com.example.lab_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.text.InputType
import android.widget.CalendarView
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)
// Initialize UI elements
        val radioButtonPresent: RadioButton = findViewById(R.id.radioButton)
        val radioButtonAbsent: RadioButton = findViewById(R.id.radioButton2)
        val editTextSubjects: EditText = findViewById(R.id.editTextText)
        val checkBox1: CheckBox = findViewById(R.id.checkBox)
        val checkBox2: CheckBox = findViewById(R.id.checkBox2)
        val checkBox3: CheckBox = findViewById(R.id.checkBox3)
        val checkBox4: CheckBox = findViewById(R.id.checkBox4)
        val checkBox5: CheckBox = findViewById(R.id.checkBox5)
        val checkBox6: CheckBox = findViewById(R.id.checkBox6)
        val calendarView: CalendarView = findViewById(R.id.calendarView)
        val fab: FloatingActionButton = findViewById(R.id.floatingActionButton3)

        // Set click listener for Floating Action Button
        fab.setOnClickListener {
            // Show dialog or input field to add a new subject
            showAddSubjectDialog()
        }

        // Set click listener for RadioButtons
        radioButtonPresent.setOnClickListener {
            // Handle RadioButton present click event
            if (radioButtonPresent.isChecked) {
                Toast.makeText(this, "Present", Toast.LENGTH_SHORT).show()
            }
        }

        radioButtonAbsent.setOnClickListener {
            // Handle RadioButton absent click event
            if (radioButtonAbsent.isChecked) {
                Toast.makeText(this, "Absent", Toast.LENGTH_SHORT).show()
            }
        }

        // Set listener for CalendarView
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // Handle date selection
            Toast.makeText(this, "Selected Date: $dayOfMonth/${month + 1}/$year", Toast.LENGTH_SHORT).show()
        }

        // Set listener for CheckBoxes
        checkBox1.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle CheckBox state change
            if (isChecked) {
                Toast.makeText(this, "Checkbox 1 Checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Checkbox 1 Unchecked", Toast.LENGTH_SHORT).show()
            }
        }

        checkBox2.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle CheckBox state change
            if (isChecked) {
                Toast.makeText(this, "Checkbox 2 Checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Checkbox 2 Unchecked", Toast.LENGTH_SHORT).show()
            }
        }

        checkBox3.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle CheckBox state change
            if (isChecked) {
                Toast.makeText(this, "Checkbox 3 Checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Checkbox 3 Unchecked", Toast.LENGTH_SHORT).show()
            }
        }

        checkBox4.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle CheckBox state change
            if (isChecked) {
                Toast.makeText(this, "Checkbox 4 Checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Checkbox 4 Unchecked", Toast.LENGTH_SHORT).show()
            }
        }

        checkBox5.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle CheckBox state change
            if (isChecked) {
                Toast.makeText(this, "Checkbox 5 Checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Checkbox 5 Unchecked", Toast.LENGTH_SHORT).show()
            }
        }

        checkBox6.setOnCheckedChangeListener { buttonView, isChecked ->
            // Handle CheckBox state change
            if (isChecked) {
                Toast.makeText(this, "Checkbox 6 Checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Checkbox 6 Unchecked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showAddSubjectDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Add Subject")
        val input = EditText(this)
        input.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(input)

        builder.setPositiveButton("Add") { dialog, which ->
            val subjectName = input.text.toString()
            // TODO: Handle adding the subject here
            Toast.makeText(this, "Subject added: $subjectName", Toast.LENGTH_SHORT).show()
        }
        builder.setNegativeButton("Cancel") { dialog, which -> dialog.cancel() }

        builder.show()
    }
}