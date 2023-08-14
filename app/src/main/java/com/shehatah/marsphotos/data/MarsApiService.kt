package com.shehatah.marsphotos.data

import retrofit2.http.GET

interface MarsApiService {


    @GET("photos")
    suspend fun getPhotos(): String


}