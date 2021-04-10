package com.example.mobszoftlabbooks.interactor.book

import com.example.mobszoftlabbooks.network.BooksApi
import javax.inject.Inject

class BookInteractor @Inject constructor(private var booksApi: BooksApi){
}