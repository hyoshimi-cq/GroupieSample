package com.hiromu.groupiesample.section

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.hiromu.groupiesample.Drink
import com.hiromu.groupiesample.Fruit
import com.hiromu.groupiesample.R
import com.hiromu.groupiesample.groupie.FruitItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.fragment_list.view.*

class SectionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = GroupAdapter<ViewHolder>().also {
            it.spanCount = 2
        }
        view.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false).also {
            it.spanSizeLookup = adapter.spanSizeLookup
        }
        view.recyclerView.addItemDecoration(DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL))
        view.recyclerView.adapter = adapter

        val fruitSection = Section().also { it.setPlaceholder(LoadingItem()) }
        val drinkSection = Section()

        val sections = listOf(fruitSection, drinkSection)
        adapter.addAll(sections)

        view.postDelayed({
            fruitSection.removePlaceholder()
            fruitSection.setHeader(HeaderItem("Fruit"))
            fruitSection.setFooter(FooterItem("fruit end"))
            fruitSection.update(Fruit.all().map { FruitItem(it) })

            drinkSection.setHeader(HeaderItem("Drink"))
            drinkSection.setFooter(FooterItem("drink end"))
            drinkSection.update(Drink.all().map { DrinkItem(it) })
        }, 2000)
    }
}
