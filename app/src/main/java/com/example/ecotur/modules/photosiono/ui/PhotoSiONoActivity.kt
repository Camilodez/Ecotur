package com.example.ecotur.modules.photosiono.ui

import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityPhotoSiONoBinding
import com.example.ecotur.modules.photosiono.`data`.viewmodel.PhotoSiONoVM
import kotlin.String
import kotlin.Unit

class PhotoSiONoActivity : BaseActivity<ActivityPhotoSiONoBinding>(R.layout.activity_photo_si_o_no)
    {
  private val viewModel: PhotoSiONoVM by viewModels<PhotoSiONoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.photoSiONoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PHOTO_SI_O_NO_ACTIVITY"

  }
}
