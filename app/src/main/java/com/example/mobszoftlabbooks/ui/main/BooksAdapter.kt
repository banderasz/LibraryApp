package com.example.mobszoftlabbooks.ui.main

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobszoftlabbooks.R
import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.VolumeInfo
import com.example.mobszoftlabbooks.ui.book.BookDetailsActivity


class BooksAdapter constructor(
    private val context: Context,
    private var books: List<Volume>
) : RecyclerView.Adapter<BooksAdapter.BookViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): BookViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.book_rv_item, viewGroup, false)
        return BookViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book: Volume = books[position]
        val bookinfo: VolumeInfo = book.volumeInfo!!
        holder.nameTV.setText(bookinfo.title)
        holder.publisherTV.setText(bookinfo.publisher)
        holder.pageCountTV.setText("No of Pages : " + bookinfo.pageCount)
        holder.dateTV.setText(bookinfo.publishedDate.toString())

        holder.itemView.setOnClickListener { // inside on click listener method we are calling a new activity
            // and passing all the data of that item in next intent.
            val i = Intent(context, BookDetailsActivity::class.java)
            i.putExtra("title", bookinfo.title)
            i.putExtra("authors", bookinfo.authors.toString())
            i.putExtra("publisher", bookinfo.publisher)
            i.putExtra("publishedDate", bookinfo.publishedDate)
            i.putExtra("description", bookinfo.description)
            i.putExtra("pageCount", bookinfo.pageCount)

            // after passing that data we are
            // starting our new  intent.
            context.startActivity(i)
        }
    }

    override fun getItemCount() = books.size

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // below line is use to initialize
        // our text view and image views.
        var nameTV: TextView
        var publisherTV: TextView
        var pageCountTV: TextView
        var dateTV: TextView
        var bookIV: ImageView

        init {
            nameTV = itemView.findViewById(R.id.idTVBookTitle)
            publisherTV = itemView.findViewById(R.id.idTVpublisher)
            pageCountTV = itemView.findViewById(R.id.idTVPageCount)
            dateTV = itemView.findViewById(R.id.idTVDate)
            bookIV = itemView.findViewById(R.id.idIVbook)
        }
    }
}