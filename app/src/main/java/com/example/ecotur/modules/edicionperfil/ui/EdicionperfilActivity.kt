package com.mariajosesapplication.app.modules.edicionperfil.ui

import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityEdicionperfilBinding
import com.mariajosesapplication.app.modules.edicionperfil.`data`.viewmodel.EdicionperfilVM
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
