package com.example.timemanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // for button
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        // this stuff is about the display
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // Change the R.layout to whatever your xml file is
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // actual button functionality
        button = findViewById(R.id.button) // change R.id to the button you want to get clicked on
        button.setOnClickListener { // change this@MainActivity to the current class youre in
            // and change TripDecision::class.java to the class you want to transition to
            val intent = Intent(this@MainActivity, TripDecision::class.java)
            startActivity(intent)
        }
    }
}