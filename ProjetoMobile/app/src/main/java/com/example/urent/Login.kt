package com.example.urent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.urent.conexaoApi.ConexaoApiUrent
import com.example.urent.entities.Credenciais
import com.example.urent.entities.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

        val apiUrent = ConexaoApiUrent.criar()
        val userLogin = Credenciais(
            etEmail.text.toString(),
            etSenha.text.toString()
        )

        apiUrent.post(userLogin).enqueue(object : Callback<Usuario> {
            override fun onFailure(call: Call<Usuario>, t: Throwable) {
                Toast.makeText(baseContext, "Erro na chamada: ${t.message}", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<Usuario>, response: Response<Usuario>) {
                if (response.code() == 200){
                    val usuarioLogado = response.body()
                    println("Filme ${usuarioLogado} criado com Sucesso!")

                    goHomeChoice(usuarioLogado!!)

                } else{
                    Toast.makeText(baseContext, "Senha e/ou Email Inválido(s)", Toast.LENGTH_SHORT).show()
                    println("Erro ao logar!!")
                }
            }
        })



//        if (etEmail.text.toString().equals("email") && etSenha.text.toString().equals("senha")){
//            val homeChoice = Intent(this,HomeChoice::class.java)
//            startActivity(homeChoice)
//
//            println("oi")
//        }else{
//            Toast.makeText(baseContext, "Senha e/ou Email Inválido(s)", Toast.LENGTH_SHORT).show()
//        }

    }

    fun goHomeChoice(usuario:Usuario){


        val homeChoice = Intent(this,HomeChoice::class.java)
        homeChoice.putExtra("usuarioNome",usuario.nome)

        startActivity(homeChoice)


    }

    fun sair(view: View) {

        val telaInicio = Intent(this,TelaInicial::class.java)
        startActivity(telaInicio)

    }


}