package com.hiromu.groupiesample.groupie

import com.hiromu.groupiesample.Fruit
import com.hiromu.groupiesample.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item.view.*

class FruitItem(private val fruit: Fruit): Item() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.title.text = fruit.title
    }

    override fun getLayout(): Int = R.layout.item
}
