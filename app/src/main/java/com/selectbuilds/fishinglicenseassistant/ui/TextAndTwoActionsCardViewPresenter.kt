package com.selectbuilds.fishinglicenseassistant.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.selectbuilds.fishinglicenseassistant.R
import com.selectbuilds.fishinglicenseassistant.data.TextAndTwoActions

class TextAndTwoActionsCardViewPresenter : CardViewPresenter<TextAndTwoActionsViewHolder> {
    override fun createViewHolder(viewItem: ViewGroup): TextAndTwoActionsViewHolder {
        val view = LayoutInflater.from(viewItem.context)
            .inflate(R.layout.text_two_actions, viewItem, false)
        return TextAndTwoActionsViewHolder(
            view.findViewById(R.id.CardText),
            view.findViewById(R.id.Action1),
            view.findViewById(R.id.Action2),
            view)
    }

    override fun bindData(viewHolder: RecyclerView.ViewHolder, item: Any) {
        item as TextAndTwoActions
        viewHolder as TextAndTwoActionsViewHolder
        viewHolder.textView.text = item.text
        viewHolder.action1.text = item.actionOne.label
        viewHolder.action2.text = item.actionTwo.label
    }
}
