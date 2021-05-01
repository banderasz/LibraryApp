package com.example.mobszoftlabbooks.model

import android.os.Build
import androidx.annotation.RequiresApi
import com.google.gson.annotations.SerializedName
import java.util.*

data class Volume (
    /**
     */
    @SerializedName("kind")
    var kind: String? = null,

    /**
     */
    @SerializedName("id")
    var id: String? = null,

    /**
     */
    @SerializedName("etag")
    var etag: String? = null,

    /**
     */
    @SerializedName("selfLink")
    var selfLink: String? = null,

    /**
     */
    @SerializedName("volumeInfo")
    var volumeInfo: VolumeInfo? = null
)