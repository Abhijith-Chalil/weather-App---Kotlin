package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.getWeather).setOnClickListener(){
            var city = findViewById<EditText>(R.id.cityEt).text.toString()
            println(city)
            val intent = Intent(this, Weather::class.java)
            intent.putExtra("city", city)
            startActivity(intent)
        }
    }
}