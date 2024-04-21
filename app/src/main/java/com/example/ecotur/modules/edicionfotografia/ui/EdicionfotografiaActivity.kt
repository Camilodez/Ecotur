package com.mariajosesapplication.app.modules.edicionfotografia.ui

import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityEdicionfotografiaBinding
import com.mariajosesapplication.app.modules.edicionfotografia.`data`.viewmodel.EdicionfotografiaVM
import kotlin.String
import kotlin.Unit

class EdicionfotografiaActivity :
    BaseActivity<ActivityEdicionfotografiaBinding>(R.layout.activity_edicionfotografia) {
  private val viewModel: EdicionfotografiaVM by viewModels<EdicionfotografiaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.edicionfotografiaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDICIONFOTOGRAFIA_ACTIVITY"

  }
}
