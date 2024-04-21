package com.example.ecotur.modules.panelgeneral.ui

import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityPanelGeneralBinding
import com.example.ecotur.modules.panelgeneral.`data`.viewmodel.PanelGeneralVM
import kotlin.String
import kotlin.Unit

class PanelGeneralActivity :
    BaseActivity<ActivityPanelGeneralBinding>(R.layout.activity_panel_general) {
  private val viewModel: PanelGeneralVM by viewModels<PanelGeneralVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.panelGeneralVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PANEL_GENERAL_ACTIVITY"

  }
}
