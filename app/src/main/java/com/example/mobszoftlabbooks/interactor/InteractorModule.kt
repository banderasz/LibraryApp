package com.example.mobszoftlabbooks.interactor

import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import dagger.Module
import dagger.Provides
import com.example.mobszoftlabbooks.network.BooksApi
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideBooksInteractor(booksApi: BooksApi) = BookInteractor(booksApi)
}