package com.selectbuilds.fishinglicenseassistant.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainActivityViewAdapter(
    private val items: MutableList<Any> = mutableListOf(),
    private val presenterSelector: CardViewPresenterSelector = CardViewPresenterSelector())
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int =
        presenterSelector.getItemViewType(items[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        presenterSelector.selectPresenter(viewType).createViewHolder(parent)

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        presenterSelector.selectPresenter(getItemViewType(position)).bindData(holder, items[position])
}
