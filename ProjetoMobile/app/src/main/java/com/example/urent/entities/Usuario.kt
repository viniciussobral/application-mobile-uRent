package com.example.urent.entities

import java.time.LocalDate

data class Usuario (
    val id: Int,
    val nome: String,
    val cpf: String,
    val dataNasc: String,
    val cnh: String,
    val cep: String,
    val email: String,
    val senha: String,
    val avaliacao: Double
)