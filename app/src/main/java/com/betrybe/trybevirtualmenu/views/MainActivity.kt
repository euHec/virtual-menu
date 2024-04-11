package com.betrybe.trybevirtualmenu.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.adapters.DishesAdapter
import com.betrybe.trybevirtualmenu.interfaces.DishesItensListener
import com.betrybe.trybevirtualmenu.models.Dishes
import com.betrybe.trybevirtualmenu.models.TrybeMenuDataBase

class MainActivity : AppCompatActivity(), DishesItensListener {

    private val dishesList: RecyclerView by lazy { findViewById(R.id.main_menu) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dishes: List<Dishes> = TrybeMenuDataBase.getDishes()

        val adapter = DishesAdapter(dishes)
        adapter.setDisheListener(this)

        dishesList.layoutManager = LinearLayoutManager(this)
        dishesList.adapter = adapter
    }

    override fun onDisheClick(view: View, position: Int) {
        val intent = Intent(baseContext, MenuItemDetailActivity::class.java)
        intent.putExtra("dish_id", position)
        startActivity(intent)
    }
}
