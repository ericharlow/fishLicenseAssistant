package com.selectbuilds.fishinglicenseassistant.ui

import androidx.recyclerview.widget.RecyclerView
import com.selectbuilds.fishinglicenseassistant.data.*

const val TEXT_VIEW_TYPE = 1
const val TEXT_ACTION_VIEW_TYPE = 2
const val TEXT_TWO_ACTION_VIEW_TYPE = 3
const val TEXT_THREE_ACTION_VIEW_TYPE = 4
const val TEXT_AND_CHIPS_VIEW_TYPE = 5
const val TEXT_WEB_VIEW_ACTION_VIEW_TYPE = 6

class CardViewPresenterSelector(
    private val textCardViewPresenter: CardViewPresenter<TextViewHolder> = TextCardViewPresenter(),
    private val textAndTwoActionsCardViewPresenter: CardViewPresenter<TextAndTwoActionsViewHolder> = TextAndTwoActionsCardViewPresenter(),
    private val textAndChipsCardViewPresenter: CardViewPresenter<TextAndChipsViewHolder> = TextAndChipsCardViewPresenter(),
    private val textAndWebViewAndActionCardViewPresenter: CardViewPresenter<TextAndWebViewAndActionViewHolder> = TextAndWebViewAndActionCardViewPresenter()) {

    fun getItemViewType(item: Any): Int {
        return when(item::class.java) {
            TextAndAction::class.java -> TEXT_ACTION_VIEW_TYPE
            TextAndTwoActions::class.java -> TEXT_TWO_ACTION_VIEW_TYPE
            TextAndThreeActions::class.java -> TEXT_THREE_ACTION_VIEW_TYPE
            TextAndChips::class.java -> TEXT_AND_CHIPS_VIEW_TYPE
            TextAndWebViewAndAction::class.java -> TEXT_WEB_VIEW_ACTION_VIEW_TYPE
            else -> TEXT_VIEW_TYPE
        }
    }

    fun selectPresenter(viewType: Int): CardViewPresenter<out RecyclerView.ViewHolder> {
        return when(viewType) {
            TEXT_TWO_ACTION_VIEW_TYPE -> textAndTwoActionsCardViewPresenter
            TEXT_AND_CHIPS_VIEW_TYPE -> textAndChipsCardViewPresenter
            TEXT_WEB_VIEW_ACTION_VIEW_TYPE -> textAndWebViewAndActionCardViewPresenter
            else -> textCardViewPresenter
        }
    }
}
