package com.shehatah.marsphotos.repo

interface MarsRepo {
   suspend fun getPhotos():String
}