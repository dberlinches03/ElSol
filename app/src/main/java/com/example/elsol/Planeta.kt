package com.example.elsol

data class Planeta (val nombre: String, val diametro: Double?, val distanciaAlSol: Double?, val densidad: Int?) {
    override fun toString(): String = nombre
}