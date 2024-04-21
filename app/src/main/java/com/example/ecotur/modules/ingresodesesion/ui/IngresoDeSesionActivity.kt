package com.example.ecotur.modules.ingresodesesion.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityIngresoDeSesionBinding
import com.example.ecotur.modules.ingresodesesion.`data`.viewmodel.IngresoDeSesionVM
import com.example.ecotur.modules.registro.ui.RegistroActivity
import kotlin.String
import kotlin.Unit

class IngresoDeSesionActivity :
    BaseActivity<ActivityIngresoDeSesionBinding>(R.layout.activity_ingreso_de_sesion) {
  private val viewModel: IngresoDeSesionVM by viewModels<IngresoDeSesionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ingresoDeSesionVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = RegistroActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "INGRESO_DE_SESION_ACTIVITY"

    }
  }
