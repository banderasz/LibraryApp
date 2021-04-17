package com.example.mobszoftlabbooks.interactor.book.event

import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.Volumes

data class DeleteBookEvent (
    var code: Int = 0,
    var throwable: Throwable? = null
)