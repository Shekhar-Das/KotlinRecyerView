package com.test.kotlinrecyerview

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_exmaple.view.*

class ExampleAdapter(private val exampleList: List<ExampleItem>) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_exmaple,
            parent, false
        )
        return ExampleViewHolder(itemView)
    }

    override fun getItemCount() = exampleList.size


    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageResouce)
        holder.textOne.text = currentItem.textOne
        holder.textTwo.text = currentItem.textTwo

        /*if (position == 0){
            holder.textOne.setBackgroundColor(Color.YELLOW)
        }*/


    }

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.tv_item_icon
        val textOne: TextView = itemView.tv_item_explain
        val textTwo: TextView = itemView.tv_item_explain_name

    }
}