package com.example.mobszoftlabbooks.ui.book

import com.example.mobszoftlabbooks.model.BookResult

interface BookScreen {
    fun showBookDetails(bookData: BookResult)
    fun showError(errorMsg: String)
}