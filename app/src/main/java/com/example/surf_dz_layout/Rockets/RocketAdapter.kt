package com.example.surf_dz_layout.Rockets

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.surf_dz_layout.R

class RocketAdapter(private val rocketList: ArrayList<Rocket>, private val context: Context) : RecyclerView.Adapter<RocketAdapter.MyViewHolder>() {

    // This method creates a new ViewHolder object for each item in the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rockets, parent, false)
        return MyViewHolder(itemView)
    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return rocketList.size
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentLaunch = rocketList[position]
        holder.name.text = currentLaunch.name
        holder.active.text = currentLaunch.active
        holder.active.setBackgroundResource(currentLaunch.background)
        Glide.with(context).load(currentLaunch.img).into(holder.img)
    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.textNameRocket)
        val active = itemView.findViewById<TextView>(R.id.textActiveRocket)
        val img = itemView.findViewById<ImageView>(R.id.imageRocket)
    }
}