package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        // Find username field and login button
        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        // Login button click
        loginButton.setOnClickListener {

            val username = usernameEditText.text.toString().trim()

            if (username.isEmpty()) {

                Toast.makeText(
                    this,
                    "Please enter your username",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                // Create Intent to open WelcomeActivity
                val intent = Intent(this, WelcomeActivity::class.java)

                // Send username to WelcomeActivity
                intent.putExtra("USERNAME", username)

                startActivity(intent)
            }
        }
    }
}