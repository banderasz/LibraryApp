package com.example.mobszoftlabbooks.interactor.book.event

import com.example.mobszoftlabbooks.model.Volume
import com.example.mobszoftlabbooks.model.VolumeInfo
import com.example.mobszoftlabbooks.model.Volumes

data class GetBookEvent (
    var code: Int = 0,
    var book: Volume? = null,
    var throwable: Throwable? = null
)