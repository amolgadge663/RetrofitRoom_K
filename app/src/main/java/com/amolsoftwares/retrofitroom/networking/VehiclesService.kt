package com.amolsoftwares.retrofitroom.networking

import android.util.Log
import android.widget.TextView
import com.amolsoftwares.retrofitroom.Results
import com.amolsoftwares.retrofitroom.model.Result
import com.amolsoftwares.retrofitroom.model.VehiclesDataModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VehiclesService {

    val TAG: String = "Amol"

    fun getVehicleDetails(results: Results) {
        val call: Call<VehiclesDataModel> =
            RetrofitProvider.getRetrofit().create(ApiInterface::class.java).vehicle()

        call.enqueue(object : Callback<VehiclesDataModel> {
            override fun onResponse(
                call: Call<VehiclesDataModel>,
                response: Response<VehiclesDataModel>
            ) {

                val vehiclesDataModel: VehiclesDataModel? = response.body()
                val vl: List<Result> = response.body()?.Results as List<Result>


                Log.d(TAG, "onResponse: ${vehiclesDataModel.toString()}")
                Log.d(TAG, "onVl: ${vl[0].Name}")

                results.sendResults(vehiclesDataModel!!)
            }

            override fun onFailure(call: Call<VehiclesDataModel>, t: Throwable) {
                Log.d(TAG, "onFailure: " + t.message)
            }
        })
    }
}