package com.example.urent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CadastroAnuncio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_anuncio)
    }

    fun finalizarAnuncio(view: View) {
        val meusAnuncios = Intent(this,MeusAnuncios::class.java)
        startActivity(meusAnuncios)
    }
}