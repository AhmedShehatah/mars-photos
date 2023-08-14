package com.shehatah.marsphotos.data

import com.shehatah.marsphotos.data.models.MarsPhoto
import retrofit2.http.GET

interface MarsApiService {


    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>


}