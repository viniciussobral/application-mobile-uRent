package com.example.urent.conexaoApi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ConexaoApiUrent {

    fun criar(): ApiUrent{

        return Retrofit.Builder()
            .baseUrl("http://192.168.1.239:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiUrent::class.java)
    }

}