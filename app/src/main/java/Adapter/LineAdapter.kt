package Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a2_criterios_parte1_transversais_p2.R
import dataclasses.Place
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.reclyclerline.view.*

class LineAdapter (val list: ArrayList<Place>):RecyclerView.Adapter<LineViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LineViewHolder {

        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.reclyclerline,parent,false)
        return LineViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LineViewHolder, position: Int) {
        val currentPlace= list[position]

        holder.name.text = currentPlace.name
        holder.capital.text = currentPlace.capital
        holder.nhabitantes.text = currentPlace.habitants.toString()
    }

}


class LineViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    val name = itemView.paises
    val capital =itemView.capital
    val nhabitantes =itemView.habitantes

}