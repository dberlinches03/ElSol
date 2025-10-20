package com.example.elsol

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val solarItems = mutableListOf(
        SolarItem("Corona solar", R.drawable.corona_solar),
        SolarItem("Erupción solar", R.drawable.erupcionsolar),
        SolarItem("Espículas", R.drawable.espiculas),
        SolarItem("Filamentos", R.drawable.filamentos),
        SolarItem("Magnetosfera", R.drawable.magnetosfera),
        SolarItem("Mancha solar", R.drawable.manchasolar)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.solarRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = SolarAdapter(solarItems)
    }
}