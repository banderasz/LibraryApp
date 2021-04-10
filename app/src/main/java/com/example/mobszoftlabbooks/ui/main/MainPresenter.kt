package com.example.mobszoftlabbooks.ui.main

import com.example.mobszoftlabbooks.ui.Presenter

class MainPresenter : Presenter<MainScreen>() {

    fun showBooksSearchList(bookSearchTerm: String) {
        screen?.showBooks(bookSearchTerm)
    }
}