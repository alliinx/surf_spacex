package com.example.surf_dz_layout.launches

import com.example.surf_dz_layout.R

object Constants {
    // Arraylist and return the Arraylist
    fun getLaunchesData():ArrayList<Launches>{
        // create an arraylist of type Launches class
        val launchesList=ArrayList<Launches>()
        val launch1=Launches("Starlink 2","CCAES SLC 40", "16-12-2014", R.drawable.falconsat01)
        launchesList.add(launch1)
        val launch2=Launches("DemoSat","AAAES SLC 40", "06-07-2018", R.drawable.falcon9)
        launchesList.add(launch2)
        val launch3=Launches("Falcon 9 Test","CCAES SEC 40", "18-03-2019", R.drawable.demosat02)
        launchesList.add(launch3)
        val launch4=Launches("CRS - 2","CAAES SLC 40", "18-12-2019", R.drawable.crs)
        launchesList.add(launch4)

        return  launchesList
    }
}