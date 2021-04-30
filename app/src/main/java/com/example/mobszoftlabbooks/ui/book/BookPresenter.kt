package com.example.mobszoftlabbooks.ui.book

import com.example.mobszoftlabbooks.interactor.book.BookInteractor
import com.example.mobszoftlabbooks.ui.Presenter
import com.example.mobszoftlabbooks.ui.main.MainScreen
import java.util.concurrent.Executor
import javax.inject.Inject

class BookPresenter @Inject constructor(private val executor: Executor, private val bookInteractor: BookInteractor) : Presenter<BookScreen>()  {
    fun queryBookDetails() {
        TODO("Not yet implemented")
    }
}