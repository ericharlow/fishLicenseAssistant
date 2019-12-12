package com.selectbuilds.fishinglicenseassistant.ui

import android.view.View
import android.webkit.WebView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TextAndWebViewAndActionViewHolder(
    val textView: TextView, val webview: WebView, val action: TextView, container: View)
    : RecyclerView.ViewHolder(container)
