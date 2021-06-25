package com.amolsoftwares.retrofitroom.networking

import com.amolsoftwares.retrofitroom.model.VehiclesDataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("https://vpic.nhtsa.dot.gov/api/vehicles/GetParts?format=json")
    fun vehicle(): Call<VehiclesDataModel>

    @GET("/api/vehicles/GetParts?format=json")
    fun vehicle2(): Call<VehiclesDataModel>

}