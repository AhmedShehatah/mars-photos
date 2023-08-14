package com.shehatah.marsphotos.repo

import com.shehatah.marsphotos.data.MarsApiService
import com.shehatah.marsphotos.data.models.MarsPhoto

class MarsRepoImpl(private val api: MarsApiService) : MarsRepo {

    override suspend fun getPhotos(): List<MarsPhoto> {
        return api.getPhotos()
    }
}