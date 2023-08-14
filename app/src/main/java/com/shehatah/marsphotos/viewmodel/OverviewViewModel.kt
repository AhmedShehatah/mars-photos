package com.shehatah.marsphotos.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shehatah.marsphotos.data.models.MarsPhoto
import com.shehatah.marsphotos.repo.MarsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class OverviewViewModel @Inject constructor(private val repo: MarsRepo) : ViewModel() {


    private val _photos = MutableStateFlow<List<MarsPhoto>?>(null)
    val photos: MutableStateFlow<List<MarsPhoto>?> = _photos
    fun getMarsPhotos() {

        try {

            viewModelScope.launch {
                _photos.value = repo.getPhotos()
            }
            Timber.i("Got Data here")
        } catch (e: Exception) {
            Timber.e("OverviewModel error", e)
        }
    }

}