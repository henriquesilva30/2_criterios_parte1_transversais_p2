package com.example.a2_criterios_parte1_transversais_p2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val PARAM1_NAME ="nome"

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
        var editHelloWorld = findViewById<EditText>(R.id.editTextnome)
        val intent = Intent(this,Main2Activity::class.java).apply {
            putExtra(PARAM1_NAME, editHelloWorld.text.toString())
        }
        startActivity(intent)


    }
}
