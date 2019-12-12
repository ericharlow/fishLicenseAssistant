package com.selectbuilds.fishinglicenseassistant.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.selectbuilds.fishinglicenseassistant.R
import com.selectbuilds.fishinglicenseassistant.data.TextAndWebViewAndAction

class TextAndWebViewAndActionCardViewPresenter :
    CardViewPresenter<TextAndWebViewAndActionViewHolder> {

    override fun createViewHolder(viewItem: ViewGroup): TextAndWebViewAndActionViewHolder {
        val view = LayoutInflater.from(viewItem.context)
            .inflate(R.layout.text_webview_action_card_view, viewItem, false)
        val textView = view.findViewById<TextView>(R.id.CardText)
        val webView = view.findViewById<WebView>(R.id.WebView)
        val action = view.findViewById<TextView>(R.id.Action)
        return TextAndWebViewAndActionViewHolder(textView, webView, action, view)
    }

    override fun bindData(viewHolder: RecyclerView.ViewHolder, item: Any) {
        item as TextAndWebViewAndAction
        viewHolder as TextAndWebViewAndActionViewHolder
        viewHolder.textView.text = item.text
        viewHolder.action.text = item.action.label
        if (viewHolder.webview.url != item.url) {
            viewHolder.webview.loadUrl(item.url)
        }
    }
}
