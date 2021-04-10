package com.example.urent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    lateinit var etEmail: EditText
    lateinit var etSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.et_email)
        etSenha = findViewById(R.id.et_senha)
    }

    fun entrar(view: View) {

        if (etEmail.text.toString().equals("email") && etSenha.text.toString().equals("senha")){
            val homeChoice = Intent(this,HomeChoice::class.java)
            startActivity(homeChoice)

            println("oi")
        }else{
            Toast.makeText(baseContext, "Senha e/ou Email Inválido(s)", Toast.LENGTH_SHORT).show()
        }

    }

    fun sair(view: View) {

        val telaInicio = Intent(this,TelaInicial::class.java)
        startActivity(telaInicio)

    }


}