package com.betrybe.trybevirtualmenu.interfaces

import android.view.View

interface DishesItensListener {
    fun onDisheClick(view: View, position: Int)
}