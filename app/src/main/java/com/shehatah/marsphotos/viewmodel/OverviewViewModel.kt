package com.shehatah.marsphotos.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shehatah.marsphotos.repo.MarsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OverviewViewModel @Inject constructor(private val repo: MarsRepo) : ViewModel() {

    private fun getMarsPhotos() {

        viewModelScope.launch { }
    }

}