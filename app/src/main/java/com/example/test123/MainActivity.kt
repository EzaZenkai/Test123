package com.example.test123

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun changeText(view: View) {
        findViewById<TextView>(R.id.TvMain).text = getString(R.string.text_changed)
    }

    fun changeColor(view: View) {
        findViewById<TextView>(R.id.TvMain).setTextColor(Color.RED)
    }

    fun changeBackground(view: View) {
        findViewById<TextView>(R.id.TvMain).setBackgroundColor(Color.YELLOW)
    }

}