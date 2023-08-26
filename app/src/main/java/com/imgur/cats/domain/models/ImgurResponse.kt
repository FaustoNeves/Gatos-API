package com.imgur.cats.domain.models

import com.google.gson.annotations.SerializedName

data class ImgurResponse(
    @SerializedName("data")
    var data: List<Data>
)

