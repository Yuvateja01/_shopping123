package com.example.android.shop.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.android.shop.Model.Category
import com.example.android.shop.Model.Dataservice
import com.example.android.shop.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,Dataservice.category)
        listview.adapter=adapter
    }

}

