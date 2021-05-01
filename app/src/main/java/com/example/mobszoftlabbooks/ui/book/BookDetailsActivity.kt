package com.example.mobszoftlabbooks.ui.book

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mobszoftlabbooks.R
import com.example.mobszoftlabbooks.injector
import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.VolumeInfo
import com.example.mobszoftlabbooks.ui.main.BooksAdapter
import javax.inject.Inject

class BookDetailsActivity : AppCompatActivity(), BookScreen {


    @Inject
    lateinit var bookPresenter: BookPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_book_details)
        val selectedBook = intent.getSerializableExtra(BooksAdapter.KEY_BOOK) as VolumeInfo

        findViewById<TextView>(R.id.idTVTitle).text = selectedBook.title
        findViewById<TextView>(R.id.idTVDescription).text = selectedBook.description
        findViewById<TextView>(R.id.idTVSubTitle).text = selectedBook.authors.toString()
        findViewById<TextView>(R.id.idTVpublisher).text = selectedBook.publisher
        findViewById<TextView>(R.id.idTVNoOfPages).text = selectedBook.pageCount.toString()
        findViewById<TextView>(R.id.idTVPublishDate).text = selectedBook.publishedDate




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