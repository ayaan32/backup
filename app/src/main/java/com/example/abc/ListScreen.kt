package com.example.abc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ListScreen : AppCompatActivity() {
    private val FlightList = ArrayList<FlightModel>()
    private lateinit var FlightListAdapter: FlightListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_screen)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        FlightListAdapter = FlightListAdapter(FlightList)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = FlightListAdapter
        prepareMovieData()
    }
    private fun prepareMovieData() {
        FlightList.add(FlightModel("18:30","21:30","LKO","BLR","Indigo",5532.20))
        FlightList.add(FlightModel("15:30","19:30","KNP","BLR","Indigo",8932.20))
        FlightList.add(FlightModel("18:30","21:30","LKO","BLR","Indigo",6738.20))
        FlightList.add(FlightModel("18:30","21:30","LKO","BLR","Indigo",6890.50))
        FlightList.add(FlightModel("15:30","19:30","KNP","BLR","Indigo",8970.20))
        FlightList.add(FlightModel("18:30","21:30","LKO","BLR","Indigo",7735.00))

    }
    }
