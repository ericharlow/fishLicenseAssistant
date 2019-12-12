package com.selectbuilds.fishinglicenseassistant.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

interface CardViewPresenter<T : RecyclerView.ViewHolder> {
    fun createViewHolder(viewItem: ViewGroup): T
    fun bindData(viewHolder: RecyclerView.ViewHolder, item: Any)
}
