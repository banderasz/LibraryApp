package com.example.mobszoftlabbooks.test

import android.content.Intent
import android.support.test.runner.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId

import com.example.mobszoftlabbooks.ui.main.MainActivity
import com.example.mobszoftlabbooks.utils.AndroidTestUtils.setTestInjector
import com.example.mobszoftlabbooks.utils.EspressoTest
import com.example.mobszoftlabbooks.utils.matchToolbarTitle
import com.example.mobszoftlabbooks.R
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainAndroidTest : EspressoTest<MainActivity>(MainActivity::class.java) {

    @Before
    fun setUp() {
        setTestInjector()
        activityRule.launchActivity(Intent())
    }

    @Test
    fun testNavigateToArtistActivity() {
        onView(withId(R.id.idEdtSearchBooks)).perform(typeText(BOOK), closeSoftKeyboard())
        onView(withId(R.id.idBtnSearch)).perform(click())
        matchToolbarTitle(ARTIST_ACTIVITY_TITLE)
    }

    companion object {
        private const val BOOK = "kotlin"
        private const val ARTIST_ACTIVITY_TITLE = "ArtistsActivity"
    }


}