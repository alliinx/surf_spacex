package com.example.surf_dz_layout.launches

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.surf_dz_layout.R


class LaunchesFragment : Fragment(R.layout.fragment_launches) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val launchList = Constants.getLaunchesData()
        val itemAdapter = LaunchAdapter(launchList,requireContext())
        val recyclerView = view.findViewById<RecyclerView>(R.id.rc_launches)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = itemAdapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = LaunchesFragment()
    }
}