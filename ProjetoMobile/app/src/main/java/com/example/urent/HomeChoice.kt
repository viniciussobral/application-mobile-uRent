package com.example.urent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeChoice : AppCompatActivity() {

    val temGaragem: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_choice)
    }

    fun alugar(view: View) {

        if (!temGaragem){

            val cadastrarGaragem = Intent(this,CadastroGaragem::class.java)
            startActivity(cadastrarGaragem)
        }else{
            val cadastrarAnuncio = Intent(this,CadastroAnuncio::class.java)
            startActivity(cadastrarAnuncio)
        }
    }
}