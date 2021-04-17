package com.example.mobszoftlabbooks.ui.book

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobszoftlabbooks.injector
import io.swagger.client.model.Volume
import javax.inject.Inject

class BookDetailsActivity : AppCompatActivity(), BookScreen {


    @Inject
    lateinit var bookPresenter: BookPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
    }

    override fun onStart() {
        super.onStart()
        bookPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        bookPresenter.detachScreen()
    }


    override fun showBookDetails(bookData: Volume) {
        TODO("Not yet implemented")
    }

    override fun showError(errorMsg: String) {
        TODO("Not yet implemented")
    }
}