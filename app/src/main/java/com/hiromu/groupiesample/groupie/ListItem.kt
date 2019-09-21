package com.hiromu.groupiesample.groupie

import com.hiromu.groupiesample.Fruit
import com.hiromu.groupiesample.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item.view.*

class ListItem(private val fruit: Fruit): Item() {

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.title.let {
            it.text = fruit.title
            it.setBackgroundResource(fruit.bgColor)
        }
    }

    override fun getLayout(): Int = R.layout.item
}
