package com.example.mobszoftlabbooks.ui.main

import com.example.mobszoftlabbooks.model.Volume

interface MainScreen {
    fun showBooks(books:  List<Volume>?)
    fun showNetworkError(errorMsg: String)
}