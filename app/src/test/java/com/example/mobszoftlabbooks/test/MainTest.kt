package com.example.mobszoftlabbooks.test


import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.Volumes
import com.example.mobszoftlabbooks.testInjector
import com.example.mobszoftlabbooks.ui.main.MainPresenter
import com.example.mobszoftlabbooks.ui.main.MainScreen
import com.example.mobszoftlabbooks.utils.argumentCaptor
import com.example.mobszoftlabbooks.utils.mock
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.verify
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class MainTest {
    @Inject
    lateinit var mainPresenter: MainPresenter
    private lateinit var mainScreen: MainScreen

    @Throws(Exception::class)
    @Before
    fun setup() {
        testInjector.inject(this)
        mainScreen = mock()
        mainPresenter.attachScreen(mainScreen)
    }

    @Test
    fun testSearch() {
        val bookstring = "kotlin"
        mainPresenter.showBooksSearchList(bookstring)
        val volumes = argumentCaptor<Volumes>()
        val volumes_ =  volumes.capture()

        val volumes2 = argumentCaptor<MutableList<Volume>>()
        val volumes2_ =  volumes2.capture()

        val volume = argumentCaptor<Volume>()
        val volume_ =  volume.capture()

        mainScreen.showBooks()


    }

    @After
    fun tearDown() {
        mainPresenter.detachScreen()
    }
}