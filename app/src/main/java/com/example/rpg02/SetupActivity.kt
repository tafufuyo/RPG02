package com.example.rpg02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SetupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup)

        var nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener{
            val intent = Intent(applicationContext, ChapterTest::class.java)
            intent.putExtra("playerName",findViewById<EditText>(R.id.name).text)
            startActivity(intent)
        }
    }
}