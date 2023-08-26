package com.imgur.cats.data.repository

import com.imgur.cats.data.api.ImgurApi
import com.imgur.cats.domain.models.ImgurResponse
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val imgurAPI: ImgurApi) : Repository {
    override suspend fun getCats(queryParameter: String, authorization: String): ImgurResponse {
        return imgurAPI.getCats(queryParameter, authorization)
    }
}