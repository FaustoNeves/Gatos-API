package com.imgur.cats.data.repository.di

import com.imgur.cats.data.repository.Repository
import com.imgur.cats.data.repository.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {

    @Binds
    fun bindsRepositoryImplementation(repositoryImpl: RepositoryImpl): Repository
}