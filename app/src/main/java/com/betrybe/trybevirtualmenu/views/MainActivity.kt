package com.betrybe.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.adapters.DishesAdapter
import com.betrybe.trybevirtualmenu.models.Dishes
import com.betrybe.trybevirtualmenu.models.TrybeMenuDataBase

class MainActivity : AppCompatActivity() {

    private val dishesList: RecyclerView by lazy { findViewById(R.id.main_linear_container) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dishes: List<Dishes> = TrybeMenuDataBase.getDishes()

        val adapter = DishesAdapter(dishes)

        dishesList.layoutManager = LinearLayoutManager(this)
        dishesList.adapter = adapter
    }
}
