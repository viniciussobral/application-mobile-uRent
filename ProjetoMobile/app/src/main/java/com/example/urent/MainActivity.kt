package com.example.urent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun trocar(view: View) {

        val telaInicio = Intent(this,TelaInicial::class.java)
        startActivity(telaInicio)
    }
}