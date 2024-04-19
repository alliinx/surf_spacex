package com.example.surf_dz_layout.Rockets

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.surf_dz_layout.R

class RocketsFragment : Fragment(R.layout.fragment_rockets) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rocketList = Constants.getRocketsData()
        val itemAdapter = RocketAdapter(rocketList,requireContext())
        val recyclerView = view.findViewById<RecyclerView>(R.id.rc_rockets)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = itemAdapter
    }


    companion object {

        @JvmStatic
        fun newInstance() = RocketsFragment()
    }
}