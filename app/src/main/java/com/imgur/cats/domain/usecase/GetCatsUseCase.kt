package com.imgur.cats.domain.usecase

import com.imgur.cats.data.repository.Repository
import com.imgur.cats.domain.models.ImgurResponse
import javax.inject.Inject

interface GetCatsUseCase {
    suspend fun getCats(queryParameter: String, authorization: String): ImgurResponse
}

class GetCatsUseCaseImpl @Inject constructor(private val repository: Repository) : GetCatsUseCase {
    override suspend fun getCats(queryParameter: String, authorization: String): ImgurResponse {
        return repository.getCats(queryParameter, authorization)
    }
}