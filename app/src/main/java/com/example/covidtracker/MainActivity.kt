package com.example.covidtracker

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var stat : Button = findViewById(R.id.stat)

        var call : Button = findViewById(R.id.button)

        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+"+911123978046")
            startActivity(intent)
        }

        stat.setOnClickListener{
            val intent = Intent(this@MainActivity, Statistics::class.java)
            startActivity(intent)
        }


    }

}


