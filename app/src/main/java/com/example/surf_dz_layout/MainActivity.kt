package com.example.surf_dz_layout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.surf_dz_layout.Rockets.RocketsFragment
import com.example.surf_dz_layout.databinding.ActivityMainBinding
import com.example.surf_dz_layout.launches.LaunchesFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragList = listOf(
        UpcomingFragment.newInstance(),
        LaunchesFragment.newInstance(),
        RocketsFragment.newInstance()
    )

    private val titleList = listOf(
        "Upcoming",
        "Launches",
        "Rockets"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //binding.tabLayout.setTabTextColors(R.color.gray_58,R.color.red_text)

        val vpAdapter = VpAdapter(this, fragList)
        binding.viewPager.adapter = vpAdapter
        TabLayoutMediator(binding.tabLayout,binding.viewPager){
            tab, pos -> tab.text = titleList[pos]


        }.attach()
    }
}