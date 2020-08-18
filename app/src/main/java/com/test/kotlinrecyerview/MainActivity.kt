package com.test.kotlinrecyerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = generateDummyList(50)
        recyer.adapter = ExampleAdapter(exampleList)
        recyer.layoutManager = LinearLayoutManager(this)
        recyer.setHasFixedSize(true)
    }

    private fun generateDummyList(size : Int):List<ExampleItem>{

        val list = ArrayList<ExampleItem>()

        for (i in 0 until size){
            val drawable = when(i % 3){
                0 -> R.drawable.ic_baseline
                1 -> R.drawable.ic_baseline_airline
                else -> R.drawable.ic_launcher_background
            }
            val item = ExampleItem(drawable , "Item $i" , "Line 2")
            list += item
        }
        return list
    }
}