package com.selectbuilds.fishinglicenseassistant.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.selectbuilds.fishinglicenseassistant.R

class TextCardViewPresenter : CardViewPresenter<TextViewHolder> {
    override fun createViewHolder(viewItem: ViewGroup): TextViewHolder {
        val view = LayoutInflater.from(viewItem.context)
            .inflate(R.layout.text_card_view, viewItem, false)
        val textView = view.findViewById<TextView>(R.id.CardText)
        return TextViewHolder(textView, view)
    }

    override fun bindData(viewHolder: RecyclerView.ViewHolder, item: Any) {
        viewHolder as TextViewHolder
        viewHolder.textView.text = item.toString()
    }
}
