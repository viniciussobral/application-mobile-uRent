package com.example.urent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
    }

    fun entrarEmail(view: View) {

        val telaLogin = Intent(this,Login::class.java)
        startActivity(telaLogin)
    }

    fun criarConta(view: View) {}
}