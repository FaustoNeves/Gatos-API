package com.imgur.cats.data.api

import com.imgur.cats.domain.models.ImgurResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ImgurApi {

    @GET("3/gallery/search/")
    suspend fun getCats(
        @Query("q") queryParameter: String,
        @Header("Authorization") authorization: String
    ): ImgurResponse
}