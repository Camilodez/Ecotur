package com.example.ecotur.modules.comunidadgeneral.ui

import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityComunidadGeneralBinding
import com.example.ecotur.modules.comunidadgeneral.`data`.viewmodel.ComunidadGeneralVM
import kotlin.String
import kotlin.Unit

class ComunidadGeneralActivity :
    BaseActivity<ActivityComunidadGeneralBinding>(R.layout.activity_comunidad_general) {
  private val viewModel: ComunidadGeneralVM by viewModels<ComunidadGeneralVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comunidadGeneralVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "COMUNIDAD_GENERAL_ACTIVITY"

  }
}
