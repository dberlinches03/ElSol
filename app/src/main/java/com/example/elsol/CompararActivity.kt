package com.example.elsol

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CompararActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.comparar_planetas)

        val listaPlanetas = listOf(
            Planeta("Mercurio", 0.382, 0.387, 5400),
            Planeta("Venus", 0.949, 0.723, 5250),
            Planeta("Tierra", 1.0, 1.0, 5520),
            Planeta("Marte", 0.53, 1.542, 3960),
            Planeta("Júpiter", 11.2, 5.203, 1350),
            Planeta("Saturno", 9.41, 9.539, 700),
            Planeta("Urano", 3.38, 19.81, 1200),
            Planeta("Neptuno", 3.81, 30.07, 1500),
            Planeta("Plutón", null, 39.44, null)
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, listaPlanetas)

        val auto1 = findViewById<AutoCompleteTextView>(R.id.auto1)
        val auto2 = findViewById<AutoCompleteTextView>(R.id.auto2)

        auto1.setAdapter(adapter)
        auto2.setAdapter(adapter)

        auto1.setOnItemClickListener { _, _, position, _ ->
            val planeta = adapter.getItem(position)!!
            findViewById<TextView>(R.id.diametro1).text = planeta.diametro?.toString() ?: "???"
            findViewById<TextView>(R.id.distancia1).text = planeta.distanciaAlSol?.toString() ?: "???"
            findViewById<TextView>(R.id.densidad1).text = planeta.densidad?.toString() ?: "???"
        }

        auto2.setOnItemClickListener { _, _, position, _ ->
            val planeta = adapter.getItem(position)!!
            findViewById<TextView>(R.id.diametro2).text = planeta.diametro?.toString() ?: "???"
            findViewById<TextView>(R.id.distancia2).text = planeta.distanciaAlSol?.toString() ?: "???"
            findViewById<TextView>(R.id.densidad2).text = planeta.densidad?.toString() ?: "???"
        }
    }
}
