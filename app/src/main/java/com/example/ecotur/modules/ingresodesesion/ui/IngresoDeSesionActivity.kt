package com.mariajosesapplication.app.modules.ingresodesesion.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityIngresoDeSesionBinding
import com.mariajosesapplication.app.modules.ingresodesesion.`data`.viewmodel.IngresoDeSesionVM
import com.mariajosesapplication.app.modules.registro.ui.RegistroActivity
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
