package com.example.urent

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.urent.conexaoApi.ConexaoApiUrent
import com.example.urent.entities.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            trocar()
        },3000)

        //Listagem de usuarios
//        val layoutLista: LinearLayout = findViewById(R.id.layout_lista)
//
//        val apiUrent = ConexaoApiUrent.criar()
//
//        apiUrent.get().enqueue(object : Callback<List<Usuario>> {
//            override fun onResponse(call: Call<List<Usuario>>, response: Response<List<Usuario>>) {
//                response.body()?.forEach {
//                    val tvUsuario = TextView(baseContext)
//                    tvUsuario.text = "Id: ${it.id} - Nome: ${it.nome}"
//                    tvUsuario.setTextColor(Color.parseColor("#9911AA"))
//
//                    layoutLista.addView(tvUsuario)
//                }
//            }
//
//            override fun onFailure(call: Call<List<Usuario>>, t: Throwable) {
//                Toast.makeText(baseContext, "Erro na chamada: ${t.message}", Toast.LENGTH_SHORT).show()
//                Log.e("Erro", "Erro Louco: " + t.message!!)
//
//            }
//
//
//        })

    }

    fun trocar() {

        val telaInicio = Intent(this,TelaInicial::class.java)
        startActivity(telaInicio)
    }
}