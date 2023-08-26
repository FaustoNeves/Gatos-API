package com.imgur.cats.domain.models

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("type")
    var type: String,
    @SerializedName("link")
    var link: String
)
