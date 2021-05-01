package com.example.mobszoftlabbooks.ui.book

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mobszoftlabbooks.R
import com.example.mobszoftlabbooks.injector
import com.example.mobszoftlabbooks.model.DataBaseModule
import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.VolumeInfo
import com.example.mobszoftlabbooks.model.database.AppDatabase
import com.example.mobszoftlabbooks.ui.about.AboutActivity
import com.example.mobszoftlabbooks.ui.main.BooksAdapter
import javax.inject.Inject

class BookDetailsActivity : AppCompatActivity(), BookScreen {
    private var isFavourite = false


    @Inject
    lateinit var bookPresenter: BookPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector.inject(this)
        setContentView(R.layout.activity_book_details)
        val selectedVolume = intent.getSerializableExtra(BooksAdapter.KEY_BOOK) as Volume
        bookPresenter.setSelectedCountry(selectedVolume)
        val selectedBook = selectedVolume.volumeInfo!!

        findViewById<TextView>(R.id.idTVTitle).text = selectedBook.title
        findViewById<TextView>(R.id.idTVDescription).text = selectedBook.description
        findViewById<TextView>(R.id.idTVSubTitle).text = selectedBook.authors.toString()
        findViewById<TextView>(R.id.idTVpublisher).text = selectedBook.publisher
        findViewById<TextView>(R.id.idTVNoOfPages).text = selectedBook.pageCount.toString()
        findViewById<TextView>(R.id.idTVPublishDate).text = selectedBook.publishedDate

        val favoriteBtn: ImageButton = findViewById(R.id.idBtnFavorite);
        if (isFavourite){
            favoriteBtn.setImageDrawable(Drawable.createFromPath("@android:drawable/ic_search_category_default"))
        }
        else{
            favoriteBtn.setImageDrawable(Drawable.createFromPath("@android:drawable/btn_star"))
        }




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

    override fun updateFavoriteState(isFavourite: Boolean) {
        this.isFavourite = isFavourite
        invalidateOptionsMenu()
    }
}