package com.hiromu.groupiesample.binding

import com.hiromu.groupiesample.Fruit
import com.hiromu.groupiesample.R
import com.hiromu.groupiesample.databinding.BindItemBinding
import com.xwray.groupie.databinding.BindableItem

class BindingItem(
    private val fruit: Fruit
) : BindableItem<BindItemBinding>() {
    override fun bind(viewBinding: BindItemBinding, position: Int) {
        viewBinding.title = fruit.title
    }

    override fun getLayout(): Int = R.layout.bind_item
}
