package com.imgur.cats.domain.models

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("images")
    var images: List<Image>
)
