package com.example.mobszoftlabbooks.ui.main

import com.example.mobszoftlabbooks.interactor.main.MainInteractor
import com.example.mobszoftlabbooks.ui.Presenter
import java.util.concurrent.Executor
import javax.inject.Inject

class MainPresenter @Inject constructor(private val mainInteractor: MainInteractor) : Presenter<MainScreen>()  {

    fun showBooksSearchList(bookSearchTerm: String) {
        screen?.showBooks(bookSearchTerm)
    }
}