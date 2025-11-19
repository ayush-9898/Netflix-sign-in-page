package com.example.ca1

import android.R.attr.password
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.username)
        val pwd = findViewById<EditText>(R.id.pwd)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val u = user.text.toString()
            val p= pwd.text.toString()

            if (u.isEmpty() || p.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
            else if(u=="ayushsahu@gmail.com" && p=="ayush123"){
                Toast.makeText(this, "welcome ayush", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Signing in...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}