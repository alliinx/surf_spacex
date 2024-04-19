package com.example.surf_dz_layout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class UpcomingFragment : Fragment(R.layout.fragment_upcoming) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    companion object {
        @JvmStatic
        fun newInstance() = UpcomingFragment()
    }
}