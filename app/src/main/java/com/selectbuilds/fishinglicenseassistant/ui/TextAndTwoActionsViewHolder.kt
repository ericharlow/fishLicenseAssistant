package com.selectbuilds.fishinglicenseassistant.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextAndTwoActionsViewHolder(
    val textView: TextView, val action1: TextView, val action2: TextView, container: View)
    : RecyclerView.ViewHolder(container)