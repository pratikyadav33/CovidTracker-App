package com.example.covidtracker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Statistics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        var back: ImageView = findViewById(R.id.imageView)

        back.setOnClickListener {
            val intent = Intent(this@Statistics,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}