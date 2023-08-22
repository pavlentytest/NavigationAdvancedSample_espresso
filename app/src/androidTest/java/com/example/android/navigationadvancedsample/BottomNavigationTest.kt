/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigationadvancedsample

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.NoActivityResumedException
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.hamcrest.CoreMatchers.allOf
import org.junit.Assert.fail
import org.junit.Rule
import org.junit.Test


class BottomNavigationTest {

   // @get:Rule var instantTaskExecutorRule = InstantTaskExecutorRule()

    //@get:Rule var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @get:Rule
    var activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun bottomNavView_clickOnAllItems() {

    }

    @Test
    fun bottomNavView_backGoesToFirstItem() {

    }

    @Test(expected = NoActivityResumedException::class)
    fun bottomNavView_backfromFirstItemExits() {

    }

    @Test
    fun bottomNavView_backstackMaintained() {
    }

    @Test
    fun bottomNavView_registerBackRegister() {

    }

    private fun assertSecondScreen() {
        onView(allOf(withText(R.string.title_list), isDescendantOfA(withId(R.id.action_bar))))
                .check(matches(isDisplayed()))
    }

    private fun openSecondScreen() {
        onView(allOf(withContentDescription(R.string.title_list), isDisplayed()))
                .perform(click())
    }

    private fun assertDeeperThirdScreen() {
        onView(withText(R.string.done))
                .check(matches(isDisplayed()))
    }

    private fun openFirstScreen() {
        onView(allOf(withContentDescription(R.string.title_home), isDisplayed()))
                .perform(click())
    }

    private fun assertFirstScreen() {
        onView(withText(R.string.welcome))
                .check(matches(isDisplayed()))
    }

    private fun openThirdScreen() {
        onView(allOf(withContentDescription(R.string.title_register), isDisplayed()))
                .perform(click())
    }

    private fun assertThirdScreen() {
        onView(withText(R.string.select_an_avatar))
                .check(matches(isDisplayed()))
    }
}
