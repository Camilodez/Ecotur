package com.example.ecotur.modules.edicionperfil.ui

import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityEdicionperfilBinding
import com.example.ecotur.modules.edicionperfil.`data`.viewmodel.EdicionperfilVM
import kotlin.String
import kotlin.Unit

class EdicionperfilActivity :
    BaseActivity<ActivityEdicionperfilBinding>(R.layout.activity_edicionperfil) {
  private val viewModel: EdicionperfilVM by viewModels<EdicionperfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.edicionperfilVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDICIONPERFIL_ACTIVITY"

  }
}
