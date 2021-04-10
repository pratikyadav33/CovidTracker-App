package com.example.covidtracker

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val flag: ImageView = findViewById(R.id.flag)
    val spinner : Spinner=findViewById(R.id.spinner)
    val stat : Button = findViewById(R.id.stat)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}