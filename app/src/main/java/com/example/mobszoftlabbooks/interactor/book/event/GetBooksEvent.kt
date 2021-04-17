package com.example.mobszoftlabbooks.interactor.book.event

import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.Volumes

data class GetBooksEvent (
    var code: Int = 0,
    var books: List<Volume>? = null,
    var throwable: Throwable? = null
)