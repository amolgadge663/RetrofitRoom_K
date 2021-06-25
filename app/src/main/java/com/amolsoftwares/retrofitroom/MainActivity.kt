package com.amolsoftwares.retrofitroom

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amolsoftwares.retrofitroom.model.VehiclesDataModel
import com.amolsoftwares.retrofitroom.networking.VehiclesService

class MainActivity : AppCompatActivity(), Results {

    lateinit var mgfId: TextView
    lateinit var mgfName: TextView
    lateinit var name: TextView
    lateinit var type: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        VehiclesService().getVehicleDetails(this)

    }

    override fun sendResults(vehicle: VehiclesDataModel) {

        Toast.makeText(this, "HI "+ vehicle.Results[0].Name, Toast.LENGTH_SHORT).show()

        mgfId = findViewById(R.id.mfg_id)
        mgfName = findViewById(R.id.mfg_name)
        name = findViewById(R.id.name)
        type = findViewById(R.id.type)

        mgfId.text = vehicle.Results[0].ManufacturerId.toString()
        mgfName.text = vehicle.Results[0].ManufacturerName
        name.text = vehicle.Results[0].Name
        type.text = vehicle.Results[0].Type

    }
}

interface Results {
    fun sendResults(vehicle: VehiclesDataModel)
}
