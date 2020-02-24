package com.example.simao

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var allButtons = arrayOfNulls<Button>(4)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        allButtons[0] = findViewById<Button>(R.id.btn_green)
        allButtons[1] = findViewById<Button>(R.id.btn_red)
        allButtons[2] = findViewById<Button>(R.id.btn_yellow)
        allButtons[3] = findViewById<Button>(R.id.btn_blue)
    }
}
