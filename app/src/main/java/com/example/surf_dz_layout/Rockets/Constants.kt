package com.example.surf_dz_layout.Rockets

import com.example.surf_dz_layout.R

object Constants {
    // Arraylist and return the Arraylist
    fun getRocketsData():ArrayList<Rocket>{
        // create an arraylist of type Launches class
        val rocketsList=ArrayList<Rocket>()
        val rocket1= Rocket("Falcon 1","INACTIVE", R.drawable.falconsat01, R.drawable.background_mission_inactive)
        rocketsList.add(rocket1)
        val rocket2= Rocket("Falcon 9","ACTIVE",  R.drawable.falcon09, R.drawable.background_mission_active)
        rocketsList.add(rocket2)
        val rocket3= Rocket("Big Falcon Rocket","INACTIVE", R.drawable.demosat02, R.drawable.background_mission_inactive)
        rocketsList.add(rocket3)

        return  rocketsList
    }

}