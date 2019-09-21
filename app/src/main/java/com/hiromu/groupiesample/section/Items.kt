package com.hiromu.groupiesample.section

import com.hiromu.groupiesample.Drink
import com.hiromu.groupiesample.R
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item.view.*
import kotlinx.android.synthetic.main.item_footer.view.*
import kotlinx.android.synthetic.main.item_header.view.*

class DrinkItem(
    private val drink: Drink
) : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.title.text = drink.title
    }

    override fun getLayout(): Int = R.layout.item

    override fun getSpanSize(spanCount: Int, position: Int): Int {
        return spanCount / 2
    }
}

class HeaderItem(
    private val title: String
) : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.headerTitle.text = title
    }

    override fun getLayout(): Int = R.layout.item_header
}

class FooterItem(
    private val title: String
) : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.footerTitle.text = title
    }

    override fun getLayout(): Int = R.layout.item_footer
}

class LoadingItem : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {

    }

    override fun getLayout(): Int = R.layout.item_loading
}
