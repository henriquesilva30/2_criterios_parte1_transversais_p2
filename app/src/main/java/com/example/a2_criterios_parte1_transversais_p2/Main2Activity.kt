package com.example.a2_criterios_parte1_transversais_p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra(PARAM1_NAME)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}
