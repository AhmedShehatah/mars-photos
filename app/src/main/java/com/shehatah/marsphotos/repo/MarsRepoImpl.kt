package com.shehatah.marsphotos.repo

import com.shehatah.marsphotos.data.MarsApiService

class MarsRepoImpl(private val api: MarsApiService) : MarsRepo {

    override suspend fun getPhotos(): String {
        return api.getPhotos()
    }
}