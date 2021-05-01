package com.example.mobszoftlabbooks.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mobszoftlabbooks.R
import com.example.mobszoftlabbooks.injector
import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.ui.book.BookDetailsActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity(), MainScreen {

    private var displayedBooks: MutableList<Volume> = mutableListOf()
    private var booksAdapter: BooksAdapter? = null
//    private val book by lazy { arguments!!.getString(KEY_BOOK)!! }
    private var selectedBook: String? = null
    lateinit var recyclerViewBooks : RecyclerView


    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val searchEdt: EditText = findViewById(R.id.idEdtSearchBooks);
        val searchBtn: ImageButton = findViewById(R.id.idBtnSearch);
        recyclerViewBooks = findViewById<RecyclerView>(R.id.idRVBooks)
        booksAdapter = BooksAdapter(this, displayedBooks)
        recyclerViewBooks.adapter = booksAdapter
        recyclerViewBooks.layoutManager = LinearLayoutManager(this)

        injector.inject(this)
        searchBtn.setOnClickListener {
            mainPresenter.showBooksSearchList(searchEdt.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        mainPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.detachScreen()
    }

    override fun showBooks(books:  List<Volume>) {
        /*displayedBooks.clear()
        if(books != null){
            displayedBooks.addAll(books)
        }
        booksAdapter?.notifyDataSetChanged()
        if (displayedBooks.isEmpty()) {
            recyclerViewBooks?.visibility = View.GONE
        } else {
            recyclerViewBooks?.visibility = View.VISIBLE
        }*/
        booksAdapter?.setBooks(books);
    }

    override fun showNetworkError(errorMsg: String) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show()
    }

    companion object {
        const val KEY_BOOK = "KEY_BOOK"
    }
}