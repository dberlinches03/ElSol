package com.example.elsol

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView

class SolarAdapter(private val solarList: MutableList<SolarItem>) : RecyclerView.Adapter<SolarAdapter.SolarViewHolder>() {
    inner class SolarViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageViewSolar)
        val toolbar: Toolbar = view.findViewById(R.id.toolbarSolar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SolarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_solar, parent, false)
        return SolarViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: SolarViewHolder,
        position: Int
    ) {
        val item = solarList[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.toolbar.title = item.name
        holder.toolbar.inflateMenu(R.menu.menu_solar_item)

        holder.toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_copy -> {
                    val copy = SolarItem("${item.name} (Copia)", item.imageResId)
                    solarList.add(position + 1, copy)
                    notifyItemInserted(position+1)
                    true
                }
                R.id.menu_delete -> {
                    solarList.removeAt(position)
                    notifyItemRemoved(position)
                    true
                }
                else -> false
            }
        }
    }

    override fun getItemCount() = solarList.size

}