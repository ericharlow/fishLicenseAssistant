package com.selectbuilds.fishinglicenseassistant.ui

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class CardViewListItemDecoration(private val spaceHeight: Int): RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.apply {
            right = spaceHeight
            left = spaceHeight
            bottom = spaceHeight

            if (parent.getChildAdapterPosition(view) == 0) {
                top = spaceHeight
            }
        }
    }
}