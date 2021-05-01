package com.example.mobszoftlabbooks.test


import com.example.mobszoftlabbooks.testInjector
import com.example.mobszoftlabbooks.ui.book.BookDetailsActivity
import com.example.mobszoftlabbooks.ui.book.BookPresenter
import com.example.mobszoftlabbooks.ui.book.BookScreen
import com.example.mobszoftlabbooks.utils.mock
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.verify
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject


@RunWith(RobolectricTestRunner::class)
class BookTest {
    @Inject
    lateinit var booksPresenter: BookPresenter

    private lateinit var bookScreen: BookScreen
    private lateinit var query: String

    @Before
    @Throws(Exception::class)
    fun setup() {
        testInjector.inject(this)
        bookScreen = mock()
        booksPresenter.attachScreen(bookScreen)
    }

    @Test
    fun testBooks() {


    }

    @After
    fun tearDown() {
        booksPresenter.detachScreen()
    }
}