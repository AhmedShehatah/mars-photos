package com.shehatah.marsphotos.repo

import com.shehatah.marsphotos.data.models.MarsPhoto

interface MarsRepo {
    suspend fun getPhotos(): List<MarsPhoto>
}