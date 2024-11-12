package com.example.myapplication

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val list = findViewById<ListView>(R.id.listView)

         val languages = hashMapOf(
            "Java" to Language("1995", R.drawable.img),
            "Python" to Language("1991", R.drawable.img),
            "Kotlin" to Language("2011", R.drawable.img),
            "Swift" to Language("2014", R.drawable.img)


        )
        val ad = LangAdapter(this,languages)
        list.adapter = ad
    }
}