package com.shehatah.marsphotos.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.shehatah.marsphotos.R
import com.shehatah.marsphotos.databinding.FragmentOverviewBinding
import com.shehatah.marsphotos.viewmodel.OverviewViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OverviewFragment : Fragment(R.layout.fragment_overview) {

    private lateinit var binding: FragmentOverviewBinding

    private val viewModel: OverviewViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOverviewBinding.bind(view)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.imagesRecycler.adapter = PhotoGridAdapter()
        viewModel.getMarsPhotos()
    }

}