package com.example.ecotur.modules.caracteristicasespecie.ui

import androidx.activity.viewModels
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityCaracteristicasespecieBinding
import com.example.ecotur.modules.caracteristicasespecie.`data`.viewmodel.CaracteristicasespecieVM
import kotlin.String
import kotlin.Unit

class CaracteristicasespecieActivity :
    BaseActivity<ActivityCaracteristicasespecieBinding>(R.layout.activity_caracteristicasespecie),
    OnMapReadyCallback {
  private val viewModel: CaracteristicasespecieVM by viewModels<CaracteristicasespecieVM>()

  private var mMap: GoogleMap? = null


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.caracteristicasespecieVM = viewModel
    val mapFragment = supportFragmentManager.findFragmentById(R.id.mapMap) as?
    SupportMapFragment
    mapFragment?.getMapAsync(this)
  }

  override fun onMapReady(p0: GoogleMap): Unit {
    mMap = p0
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CARACTERISTICASESPECIE_ACTIVITY"

  }
}
