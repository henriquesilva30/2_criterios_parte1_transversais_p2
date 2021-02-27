package com.example.a2_criterios_parte1_transversais_p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun submeter(view: View) {

        var editHelloWorld = findViewById<EditText>(R.id.editTextnome)
        Toast.makeText(this,editHelloWorld.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.textView1).setText(editHelloWorld.text)

    }

    fun toast(view: View) {

        Toast.makeText(this,"editHelloWorld", Toast.LENGTH_SHORT).show()


    }
}
