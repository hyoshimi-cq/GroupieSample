package com.hiromu.groupiesample.standard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hiromu.groupiesample.Fruit
import com.hiromu.groupiesample.R
import kotlinx.android.synthetic.main.item.view.*

class StandardAdapter : RecyclerView.Adapter<StandardAdapter.ViewHolder>() {

    var items: List<Fruit> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.title.text = items[position].title
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view)
}
