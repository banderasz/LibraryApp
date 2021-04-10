package com.example.mobszoftlabbooks.interactor.main

import com.example.mobszoftlabbooks.network.BooksApi
import javax.inject.Inject

class MainInteractor  @Inject constructor(private var booksApi: BooksApi){
}