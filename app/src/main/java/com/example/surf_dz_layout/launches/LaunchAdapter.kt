package com.example.surf_dz_layout.launches

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.surf_dz_layout.R

class LaunchAdapter(private val launchList: ArrayList<Launches>,private val context: Context) : RecyclerView.Adapter<LaunchAdapter.MyViewHolder>() {

    // This method creates a new ViewHolder object for each item in the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_launch, parent, false)
        return MyViewHolder(itemView)
    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return launchList.size
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentLaunch = launchList[position]
        holder.name.text = currentLaunch.name
        holder.desc.text = currentLaunch.desc
        holder.date.text = currentLaunch.date
        Glide.with(context).load(currentLaunch.img).into(holder.img)
        Log.d("RECVIEW",currentLaunch.name)
    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.textNameLaunch)
        val desc = itemView.findViewById<TextView>(R.id.textDescLaunch)
        val date = itemView.findViewById<TextView>(R.id.textDateLaunch)
        val img = itemView.findViewById<ImageView>(R.id.imageLaunch)
    }
}