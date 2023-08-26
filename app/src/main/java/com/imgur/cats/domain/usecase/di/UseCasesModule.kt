package com.imgur.cats.domain.usecase.di

import com.imgur.cats.domain.usecase.GetCatsUseCase
import com.imgur.cats.domain.usecase.GetCatsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface UseCasesModule {

    @Binds
    fun bindsGetCasesUseCaseImplementation(getCatsUseCaseImpl: GetCatsUseCaseImpl): GetCatsUseCase
}