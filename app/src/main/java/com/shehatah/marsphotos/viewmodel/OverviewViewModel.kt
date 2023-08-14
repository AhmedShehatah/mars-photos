package com.shehatah.marsphotos.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shehatah.marsphotos.repo.MarsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OverviewViewModel @Inject constructor(private val repo: MarsRepo) : ViewModel() {


    private val _photos = MutableStateFlow<String?>(null)
    val photos = _photos
     fun getMarsPhotos() {

        viewModelScope.launch {
            _photos.value = repo.getPhotos()
        }
    }

}