package com.amolsoftwares.retrofitroom.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {

    private var retrofit: Retrofit? = null

    /*@Override
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val okHttlBuilder = okHttpClient.newBuilder()
        return Retrofit.Builder()
            .client(okHttlBuilder.build())
            .baseUrl("https://vpic.nhtsa.dot.gov/")
            .build()
    }*/

    fun getRetrofit(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://vpic.nhtsa.dot.gov").build()
        }
        return retrofit!!
    }
}