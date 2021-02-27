package com.example.a2_criterios_parte1_transversais_p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra(PARAM1_NAME)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu2,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.create_new -> {
                Toast.makeText(this,"create_new", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao2 -> {
                Toast.makeText(this,"opcao2", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao3 -> {
                Toast.makeText(this,"opcao3", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao4 -> {
                Toast.makeText(this,"opcao4", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
