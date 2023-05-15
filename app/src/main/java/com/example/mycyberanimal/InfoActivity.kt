package com.example.mycyberanimal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val animal = intent.getStringExtra("animal")
        val imageView: ImageView = findViewById(R.id.image_cow)
        val textView: TextView = findViewById(R.id.text_about)
        val button_back: Button = findViewById(R.id.button_back)

        when (animal) {
            "cow" -> {
                imageView.setImageResource(R.drawable.cow)
                textView.setText(R.string.cow_detali)
            }
            "mouse" -> {
                imageView.setImageResource(R.drawable.mouse)
                textView.setText(R.string.mouse_detali)
            }
            "tiger" -> {
                imageView.setImageResource(R.drawable.tiger)
                textView.setText(R.string.tiger_detali)
            }

        }
        button_back.setOnClickListener {
            finish()
        }
    }
}