package com.amolsoftwares.retrofitroom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amolsoftwares.retrofitroom.adapter.VehiclesPartsAdapter
import com.amolsoftwares.retrofitroom.model.VehiclesDataModel
import com.amolsoftwares.retrofitroom.networking.VehiclesService

class MainActivity : AppCompatActivity(), Results {

    lateinit var adapter: VehiclesPartsAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        VehiclesService().getVehicleDetails(this)

    }

    override fun sendResults(vehicle: VehiclesDataModel) {

        adapter = VehiclesPartsAdapter(this, vehicle)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}

interface Results {
    fun sendResults(vehicle: VehiclesDataModel)
}
