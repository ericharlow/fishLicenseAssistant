package com.selectbuilds.fishinglicenseassistant.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.selectbuilds.fishinglicenseassistant.R
import com.selectbuilds.fishinglicenseassistant.data.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)
        setupRecyclerView(recyclerView)
    }

    private fun setupRecyclerView(recyclerView: RecyclerView) {
        val items = sampleData()
        adapter = MainActivityViewAdapter(items)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.addItemDecoration(CardViewListItemDecoration(resources.getDimensionPixelSize(R.dimen.card_spacing_height)))
        recyclerView.adapter = adapter
    }

    fun onAction1Clicked(view: View) {}

    fun onAction2Clicked(view: View) {}

    fun onCancelActionClicked(view: View) {}

    fun sampleData(): MutableList<Any> {
        return mutableListOf(
            "test 1",
            "test 2",
            "test 3",
            TextAndTwoActions(
                "What Number Do You Prefer?",
                Action(
                    "Number 1",
                    ::onAction1Clicked
                ),
                Action(
                    "Number 2",
                    ::onAction2Clicked
                )
            ),
            TextAndChips("Which State Would You Like To Go Fishing In?", States.values()),
            TextAndWebViewAndAction(
                "Please Wait...",
                "https://app.mt.gov/als/index/index.html",
                Action("Cancel", ::onCancelActionClicked))
        )
    }
}
