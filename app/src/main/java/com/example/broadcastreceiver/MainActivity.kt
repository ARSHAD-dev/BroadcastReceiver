package com.example.broadcastreceiver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
**created by arshad.....
 */;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_broadcast=findViewById<Button>(R.id.button_broadcast)
        button_broadcast.setOnClickListener{
            val intent = Intent("https://www.google.com")
            intent.putExtra("data", "Broadcast Message!!")
            sendBroadcast(intent)
        }
    }



}
