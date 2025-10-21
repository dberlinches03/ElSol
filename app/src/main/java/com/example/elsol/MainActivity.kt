package com.example.elsol

<<<<<<< HEAD
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
=======
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
>>>>>>> e70c7479118de3ba7dcd499af8ae29dd5f6dad94
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
<<<<<<< HEAD

        val toolbar = findViewById<Toolbar>(R.id.toolbarMain)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_comparar -> {
                val intent = Intent(this, CompararActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
=======
>>>>>>> e70c7479118de3ba7dcd499af8ae29dd5f6dad94
    }
}