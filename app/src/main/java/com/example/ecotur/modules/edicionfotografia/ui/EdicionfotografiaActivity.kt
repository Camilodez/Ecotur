package com.example.ecotur.modules.edicionfotografia.ui

import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityEdicionfotografiaBinding
import com.example.ecotur.modules.edicionfotografia.`data`.viewmodel.EdicionfotografiaVM
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
