package com.imgur.cats.data.repository

import com.imgur.cats.domain.models.ImgurResponse

interface Repository {
    suspend fun getCats(queryParameter: String, authorization: String): ImgurResponse
}