package com.betrybe.trybevirtualmenu.views

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.models.TrybeMenuDataBase

class MenuItemDetailActivity : AppCompatActivity() {

    private val backButton: Button by lazy { findViewById(R.id.detail_back) }
    private val name: TextView by lazy { findViewById(R.id.detail_name)  }
    private val image: ImageView by lazy { findViewById(R.id.detail_image)  }
    private val description: TextView by lazy { findViewById(R.id.detail_description)  }
    private val price: TextView by lazy { findViewById(R.id.detail_price)  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val dishId = intent.getIntExtra("dish_id", 0)

        val dish = TrybeMenuDataBase.getDishesById(dishId + 1)!!

        name.text = dish.name
        image.setImageResource(dish.image)
        description.text = dish.description
        price.text = buildString {
            append("R$")
            append(dish.price.toString())
        }

        backButton.setOnClickListener { finish() }
    }
}
