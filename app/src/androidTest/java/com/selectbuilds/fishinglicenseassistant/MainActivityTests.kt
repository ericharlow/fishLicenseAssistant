package com.selectbuilds.fishinglicenseassistant

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.selectbuilds.fishinglicenseassistant.ui.MainActivity
import org.junit.Rule
import org.junit.Test

class MainActivityTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule<MainActivity>(MainActivity::class.java)

    @Test fun should_display_activity() {
        onView(withId(R.id.HelloWorld)).check(matches(isDisplayed()))
    }
}