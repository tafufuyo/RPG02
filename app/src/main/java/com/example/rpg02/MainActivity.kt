package com.example.rpg02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener{
            val intent = Intent(applicationContext, SetupActivity::class.java)
            startActivity(intent)
        }
    }
}