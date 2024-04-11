package com.betrybe.trybevirtualmenu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.models.Dishes

class DishesAdapter (val dishes: List<Dishes>): Adapter<DishesAdapter.DishViewHolder>() {

    class DishViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.item_menu_name)
        val image = view.findViewById<TextView>(R.id.item_menu_image)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DishesAdapter.DishViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu_card_view, parent, false)
        return DishViewHolder(view)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        holder.name.text = dishes[position].name
        holder.image.setImageResource(dishes[position].image)
    }

    override fun getItemCount(): Int = dishes.size

}