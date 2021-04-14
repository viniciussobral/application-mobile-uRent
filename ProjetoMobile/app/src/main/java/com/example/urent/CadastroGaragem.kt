package com.example.urent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CadastroGaragem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_garagem)
    }

    fun cadastrarAnuncio(view: View) {

        val cadastroAnuncio = Intent(this,CadastroAnuncio::class.java)
        startActivity(cadastroAnuncio)
    }
}