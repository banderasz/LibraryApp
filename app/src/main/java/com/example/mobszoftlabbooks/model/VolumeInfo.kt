package com.example.mobszoftlabbooks.model

import android.os.Build
import androidx.annotation.RequiresApi
import com.google.gson.annotations.SerializedName
import java.math.BigDecimal
import java.util.*

data class VolumeInfo(
    /**
     */
    @SerializedName("title")
    var title: String? = null,

    /**
     */
    @SerializedName("authors")
    var authors: List<String> = ArrayList(),

    /**
     */
    @SerializedName("publisher")
    var publisher: String? = null,

    /**
     */
    @SerializedName("publishedDate")
    var publishedDate: Date? = null,

    /**
     */
    @SerializedName("description")
    var description: Date? = null,

    /**
     */
    @SerializedName("pageCount")
    var pageCount: Int? = null,

    /**
     */
    @SerializedName("categories")
    var categories: List<String> = ArrayList(),

    /**
     */
    @SerializedName("averageRating")
    var averageRating: BigDecimal? = null
)