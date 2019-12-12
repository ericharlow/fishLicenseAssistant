package com.selectbuilds.fishinglicenseassistant.data

import android.view.View

data class Action(val label: String, val onClick: (View) -> Unit)
data class TextAndAction(val text: String, val singleAction: Action)
data class TextAndTwoActions(val text: String, val actionOne: Action, val actionTwo: Action)
data class TextAndThreeActions(val text: String, val actionOne: Action, val actionTwo: Action, val actionThree: Action)
data class TextAndChips(val text: String, val values: Array<States>)
data class TextAndWebViewAndAction(val text: String, val url: String, val action: Action)