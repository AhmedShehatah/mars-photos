package com.shehatah.marsphotos.data.models

import com.squareup.moshi.Json

data class MarsPhoto(val id: String, @Json(name = "img_src") val imgSrc: String)