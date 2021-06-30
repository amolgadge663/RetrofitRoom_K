package com.amolsoftwares.retrofitroom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amolsoftwares.retrofitroom.R
import com.amolsoftwares.retrofitroom.model.VehiclesDataModel

class VehiclesPartsAdapter(
    private val context: Context,
    private val mVehiclesParts: VehiclesDataModel
) : RecyclerView.Adapter<VehiclesPartsAdapter.VehiclesPartsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehiclesPartsHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.vehicles_parts_layout, parent, false)

        return VehiclesPartsHolder(view)
    }

    override fun onBindViewHolder(holder: VehiclesPartsHolder, position: Int) {
        //holder.coverLetterURL.text = mVehiclesParts.Results[position].CoverLetterURL
        holder.letterDate.text = mVehiclesParts.Results[position].LetterDate
        holder.manufacturerId.text = mVehiclesParts.Results[position].ManufacturerId.toString()
        holder.manufacturerName.text = mVehiclesParts.Results[position].ManufacturerName
        holder.modelYearFrom.text = mVehiclesParts.Results[position].ModelYearFrom.toString()
        holder.modelYearTo.text = mVehiclesParts.Results[position].ModelYearTo.toString()
        holder.name.text = mVehiclesParts.Results[position].Name
        holder.type.text = mVehiclesParts.Results[position].Type
        //holder.url.text = mVehiclesParts.Results[position].URL
    }

    override fun getItemCount(): Int {
        return mVehiclesParts.Results.size
    }

    class VehiclesPartsHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val coverLetterURL = view.findViewById<TextView>(R.id.cover_letter)
        val letterDate = view.findViewById<TextView>(R.id.ltr_date)
        val manufacturerId = view.findViewById<TextView>(R.id.mfg_id)
        val manufacturerName = view.findViewById<TextView>(R.id.mfg_name)
        val modelYearFrom = view.findViewById<TextView>(R.id.model_year_from)
        val modelYearTo = view.findViewById<TextView>(R.id.model_year_to)
        val name = view.findViewById<TextView>(R.id.name)
        val type = view.findViewById<TextView>(R.id.type)
        val url = view.findViewById<Button>(R.id.file)

    }
}