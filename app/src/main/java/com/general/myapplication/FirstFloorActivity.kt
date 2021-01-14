package com.general.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class FirstFloorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_floor)

        val milkFirstFloorButton = findViewById<ImageButton>(R.id.milkFirstFloorButton)
        milkFirstFloorButton.setOnClickListener {
            val intent = Intent(this, MilkFirstFloorActivity::class.java)
            startActivity(intent)
        }

        val homeButton = findViewById<ImageButton>(R.id.homeButton)
        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}