package com.example.mobszoftlabbooks.model

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import java.util.*
@Entity
data class Volumes(
    /**
     */
    @SerializedName("kind")
    var kind: String? = null,

    /**
     */
    @SerializedName("totalItems")
    var totalItems: Int? = null,

    /**
     */
    @SerializedName("items")
    var items: List<Volume> = ArrayList()
)