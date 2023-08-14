package com.shehatah.marsphotos.data

import retrofit2.http.GET

interface MarsApiService {


    @GET("photo")
    suspend fun getPhotos(): String


}