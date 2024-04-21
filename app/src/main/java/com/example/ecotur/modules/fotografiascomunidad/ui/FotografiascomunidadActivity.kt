package com.example.ecotur.modules.fotografiascomunidad.ui

import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityFotografiascomunidadBinding
import com.example.ecotur.modules.fotografiascomunidad.`data`.viewmodel.FotografiascomunidadVM
import kotlin.String
import kotlin.Unit

class FotografiascomunidadActivity :
    BaseActivity<ActivityFotografiascomunidadBinding>(R.layout.activity_fotografiascomunidad) {
  private val viewModel: FotografiascomunidadVM by viewModels<FotografiascomunidadVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fotografiascomunidadVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FOTOGRAFIASCOMUNIDAD_ACTIVITY"

  }
}
