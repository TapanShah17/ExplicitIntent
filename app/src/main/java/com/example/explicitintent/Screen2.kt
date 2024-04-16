package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        val back=findViewById<Button>(R.id.back)

        back.setOnClickListener {
            intent= Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}