package com.example.mobszoftlabbooks.interactor.book

import android.util.Log
import com.example.mobszoftlabbooks.interactor.book.event.DeleteBookEvent
import com.example.mobszoftlabbooks.interactor.book.event.GetBookEvent
import com.example.mobszoftlabbooks.interactor.book.event.UpdateFavoriteEvent
import com.example.mobszoftlabbooks.interactor.book.event.GetBooksEvent
import com.example.mobszoftlabbooks.interactor.book.event.UpdateBookEvent
import com.example.mobszoftlabbooks.model.DataBaseModule
import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.database.AppDatabase
import com.example.mobszoftlabbooks.network.BooksApi
import com.example.mobszoftlabbooks.network.NetworkConfig.API_KEY
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

class BookInteractor @Inject constructor(private var booksApi: BooksApi){


    fun getBooks(bookQuery: String){
        val event = GetBooksEvent()
        try {
            val booksQueryCall = booksApi.searchBooks(bookQuery, API_KEY)
            val response = booksQueryCall.execute()
            Log.d("Reponse", response.body().toString())
            if (response.code() != 200) {
                throw Exception("Result code is not 200")
            }
            event.code = response.code()
            event.books = response.body()?.items
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }
    }

//    fun favoriteBook(book: Volume) {
//        val event = UpdateFavoriteEvent()
//        db.bookDao().favourite(book)
//        event.isFavorite = true
//        EventBus.getDefault().post(event)
//    }
//
//    fun unfavoriteBook(book: Volume) {
//        val event = UpdateFavoriteEvent()
//        db.bookDao().unfavourite(book)
//        event.isFavorite = false
//        EventBus.getDefault().post(event)
//    }
//
//    fun checkIfFavourite(book: Volume) {
//        val event = UpdateFavoriteEvent()
//        event.isFavorite = db.bookDao().isFavourite(book.id!!)
//        EventBus.getDefault().post(event)
//    }

    fun getBook(bookId: String){
        val event = GetBookEvent()
        try {
            val booksQueryCall = booksApi.searchBook(bookId, API_KEY)

            val response = booksQueryCall.execute()
            Log.d("Reponse", response.body().toString())
            if (response.code() != 200) {
                throw Exception("Result code is not 200")
            }
            event.code = response.code()
            event.book = response.body()
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }
    }

    fun updateBook(bookId: String, book: Volume){
        val event = UpdateBookEvent()
        try {
            val booksQueryCall = booksApi.volumesIdPut(bookId, API_KEY, book)

            val response = booksQueryCall.execute()
            Log.d("Reponse", response.body().toString())
            if (response.code() != 200) {
                throw Exception("Result code is not 200")
            }
            event.code = response.code()
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }
    }

    fun deleteBook(bookId: String){
        val event = DeleteBookEvent()
        try {
            val booksQueryCall = booksApi.volumesIdDelete(bookId, API_KEY)

            val response = booksQueryCall.execute()
            Log.d("Reponse", response.body().toString())
            if (response.code() != 200) {
                throw Exception("Result code is not 200")
            }
            event.code = response.code()
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }
    }

}