package com.example.viewpejer.conection

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object UserClien {
    val BASEURL = "https://reqres.in/"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiServis = getRetrofit().create(Servis::class.java)
}