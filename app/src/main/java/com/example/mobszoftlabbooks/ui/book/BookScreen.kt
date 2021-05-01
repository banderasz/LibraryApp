package com.example.mobszoftlabbooks.ui.book

import com.example.mobszoftlabbooks.model.Volume

interface BookScreen {
    fun showBookDetails(bookData: Volume)
    fun showError(errorMsg: String)
    fun updateFavoriteState(isFavourite: Boolean)
}