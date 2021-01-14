package com.general.myapplication

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_milk_first_floor.*

class MilkFirstFloorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milk_first_floor)
        approveButton.setOnClickListener {
            print(editTextThreePrecentExists.text.toString())
            print(editTextThreePrecentAdd.text.toString())
        }
        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
//        var threePrecentExists: TextView = 0
//
//        val approveButton = findViewById<ImageButton>(R.id.approveButton)
//        approveButton.setOnClickListener {
//            print("")
////            threePrecentExists.text = findViewById(R.id.editTextThreePrecentExists).text.toString()
//        }
//        val homeButton = findViewById<ImageButton>(R.id.homeButton)
//        homeButton.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
    }
}

/*
<EditText
android:id="@+id/numText"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:inputType="number"
/>
For integer number

EditText tx = (EditText) findViewById(R.id.numText);
int amount = Integer.parseInt(tx.getText().toString());*/