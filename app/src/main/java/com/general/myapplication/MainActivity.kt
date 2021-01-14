package com.general.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFloorButton = findViewById<ImageButton>(R.id.firstFloorButton)
        firstFloorButton.setOnClickListener {
            val intent = Intent(this, FirstFloorActivity::class.java)
            startActivity(intent)
        }

        val secondFloorButton = findViewById<ImageButton>(R.id.secondFloorButton)
        secondFloorButton.setOnClickListener {
            val intent = Intent(this, SecondFloorActivity::class.java)
            startActivity(intent)
        }

        val thirdFloorButton = findViewById<ImageButton>(R.id.thirdFloorButton)
        thirdFloorButton.setOnClickListener {
            val intent = Intent(this, ThirdFloorActivity::class.java)
            startActivity(intent)
        }
    }
}