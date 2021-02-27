package com.example.a2_criterios_parte1_transversais_p2

import Adapter.LineAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dataclasses.Place
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

        private lateinit var myList: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        myList = ArrayList<Place>()

        for (i in 0 until 500){
            myList.add(Place("Country $i", i*500, "Capital $i"))
        }

        recyclerview1.adapter= LineAdapter(myList)
        recyclerview1.layoutManager = LinearLayoutManager(this)


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

    fun insert(view: View) {
        myList.add(0,Place("Country XXX",999,"Capital XXX"))
        recyclerview1.adapter?.notifyDataSetChanged()
    }

}
