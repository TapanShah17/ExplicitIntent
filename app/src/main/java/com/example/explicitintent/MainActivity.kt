package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnexplicit=findViewById<Button>(R.id.button)

        btnexplicit.setOnClickListener {
            intent= Intent(applicationContext, Screen2::class.java)
            startActivity(intent)

        }


    }
}