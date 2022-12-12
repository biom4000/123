package com.example.myapplication

import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton1: Button = findViewById(R.id.button1)
        val rollButton2: Button = findViewById(R.id.button2)
        val textview2: TextView = findViewById(R.id.textView)

        rollButton1.setOnClickListener(rollButton1_onClick)
        rollButton2.setOnClickListener(rollButton2_onClick)

    }

    private val rollButton1_onClick = View.OnClickListener {
        val textview2: TextView = findViewById(R.id.textView)
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)

        toast.show()
        textview2.text = "hollo world!!"
    }

    private val rollButton2_onClick = View.OnClickListener {
        val textview2: TextView = findViewById(R.id.textView)

        textview2.text = "1234566778898"
        var value = textview2.text.toString()

        var intent_value = Intent(this,MainActivity2::class.java)
        intent_value.putExtra("key",value)
        startActivity(intent_value)

    }
}