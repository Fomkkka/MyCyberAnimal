package com.example.mycyberanimal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("animal", "cow")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("animal", "mouse")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("animal", "tiger")
            startActivity(intent)
        }
    }
}