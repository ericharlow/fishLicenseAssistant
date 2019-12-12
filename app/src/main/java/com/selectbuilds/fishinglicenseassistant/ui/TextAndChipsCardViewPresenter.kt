package com.selectbuilds.fishinglicenseassistant.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.selectbuilds.fishinglicenseassistant.R
import com.selectbuilds.fishinglicenseassistant.data.States
import com.selectbuilds.fishinglicenseassistant.data.TextAndChips

class TextAndChipsCardViewPresenter : CardViewPresenter<TextAndChipsViewHolder> {
    override fun createViewHolder(viewItem: ViewGroup): TextAndChipsViewHolder {
        val layoutInflater = LayoutInflater.from(viewItem.context)
        val view = layoutInflater.inflate(R.layout.text_and_chips_card_view, viewItem, false)
        val textView = view.findViewById<TextView>(R.id.CardText)
        val chipGroup = view.findViewById<ChipGroup>(R.id.ChipGroup)
        // TODO: how to get chip content (States)?
        for ((index, state) in States.values().withIndex()) {
            val chip = layoutInflater.inflate(R.layout.choice_chip, chipGroup, false) as Chip
            chip.id = index
            chip.text = state.name // TODO: get i18n string
            chipGroup.addView(chip)
        }
        chipGroup.setOnCheckedChangeListener { chipGroup, id ->
            for (i in 0 until chipGroup.childCount) {
                val chip = chipGroup.getChildAt(i)
                chip.isSelected = chip.id == id
            }
        }
        return TextAndChipsViewHolder(textView, view)
    }

    override fun bindData(viewHolder: RecyclerView.ViewHolder, item: Any) {
        viewHolder as TextAndChipsViewHolder
        item as TextAndChips
        viewHolder.textView.text = item.text
    }
}
