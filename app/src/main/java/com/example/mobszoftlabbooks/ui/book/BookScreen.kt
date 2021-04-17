package com.example.mobszoftlabbooks.ui.book

import io.swagger.client.model.Volumes

interface BookScreen {
    fun showBookDetails(bookData: Volumes)
    fun showError(errorMsg: String)
}