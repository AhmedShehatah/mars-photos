package com.shehatah.marsphotos.di

import com.shehatah.marsphotos.data.MarsApiService
import com.shehatah.marsphotos.repo.MarsRepo
import com.shehatah.marsphotos.repo.MarsRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Singleton
    @Provides
    fun provideMarsRepo(marsApiService: MarsApiService): MarsRepo {
        return MarsRepoImpl(marsApiService)
    }
}