package com.mariajosesapplication.app.modules.photosiono.ui

import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityPhotoSiONoBinding
import com.mariajosesapplication.app.modules.photosiono.`data`.viewmodel.PhotoSiONoVM
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
