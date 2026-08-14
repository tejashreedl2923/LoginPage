package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_welcome)

        val username = intent.getStringExtra("USERNAME")

        val welcomeText = findViewById<TextView>(R.id.welcomeText)
        welcomeText.text = "Welcome, $username 👋"

        // Logout
        val logoutText = findViewById<TextView>(R.id.logoutText)

        logoutText.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            // Clear the WelcomeActivity from the back stack
            intent.flags =
                Intent.FLAG_ACTIVITY_NEW_TASK or
                        Intent.FLAG_ACTIVITY_CLEAR_TASK

            startActivity(intent)
        }
    }
}