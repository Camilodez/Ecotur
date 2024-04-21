package com.mariajosesapplication.app.modules.fotografiascomunidad.ui

import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityFotografiascomunidadBinding
import com.mariajosesapplication.app.modules.fotografiascomunidad.`data`.viewmodel.FotografiascomunidadVM
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
