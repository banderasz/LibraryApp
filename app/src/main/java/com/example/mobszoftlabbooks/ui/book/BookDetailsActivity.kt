package com.example.mobszoftlabbooks.ui.book

import androidx.appcompat.app.AppCompatActivity
import com.example.mobszoftlabbooks.model.BookResult

class BookDetailsActivity : AppCompatActivity(), BookScreen {
    override fun showBookDetails(bookData: BookResult) {
        TODO("Not yet implemented")
    }

    override fun showError(errorMsg: String) {
        TODO("Not yet implemented")
    }

    override fun onStart() {
        super.onStart()
        BookPresenter.attachScreen(this)
    }

    override fun onStop() {
        BookPresenter.detachScreen()
        super.onStop()
    }
}