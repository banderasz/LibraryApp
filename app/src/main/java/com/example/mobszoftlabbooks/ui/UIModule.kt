package com.example.mobszoftlabbooks.ui

import android.content.Context
import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import com.example.mobszoftlabbooks.interactor.main.MainInteractor
import com.example.mobszoftlabbooks.ui.main.MainPresenter
import com.example.mobszoftlabbooks.ui.book.BookPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun mainPresenter(mainInteractor: MainInteractor) = MainPresenter(mainInteractor)

    @Provides
    @Singleton
    fun booksPresenter(bookInteractor: BookInteractor) = BookPresenter(bookInteractor)


}
