package com.example.urent.conexaoApi

import com.example.urent.entities.Credenciais
import com.example.urent.entities.Usuario
import retrofit2.Call
import retrofit2.http.*

interface ApiUrent {

//    @GET("login")
//    fun get(): Call<List<Filme>>
//
//    @GET("filmes/{id}")
//    fun get(@Path("id") id:Int) : Call<Filme>
//
//    @DELETE("filmes/{id}")
//    fun delete(@Path("id") id:Int) : Call<Void>
//
//    @POST("filmes")
//    fun post(@Body novoFilme:Filme): Call<Filme>

    @GET("usuarios")
    fun get(): Call<List<Usuario>>

    @POST("usuarios/login")
    fun post(@Body novoUsuario: Credenciais): Call<Usuario>

}