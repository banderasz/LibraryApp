package com.example.mobszoftlabbooks.model

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.math.BigDecimal
import java.util.*
@Entity
data class VolumeInfo(
    /**
     */

    @SerializedName("title")
    var title:  String = "",

    /**
     */
    @SerializedName("authors")
    var authors: List<String> = ArrayList(),

    /**
     */
    @SerializedName("publisher")
    var publisher:  String = "",

    /**
     */
    @SerializedName("publishedDate")
    var publishedDate: String = "",

    /**
     */
    @SerializedName("description")
    var description:  String = "",

    /**
     */
    @SerializedName("pageCount")
    var pageCount: Int = 0,

    /**
     */
    @SerializedName("categories")
    var categories: List<String> = ArrayList(),

    /**
     */
    @SerializedName("averageRating")
    var averageRating: BigDecimal? = null


) : Serializable