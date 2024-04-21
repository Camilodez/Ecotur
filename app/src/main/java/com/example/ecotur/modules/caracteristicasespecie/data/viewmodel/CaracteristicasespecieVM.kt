package com.example.ecotur.modules.caracteristicasespecie.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ecotur.modules.caracteristicasespecie.`data`.model.CaracteristicasespecieModel
import org.koin.core.KoinComponent

class CaracteristicasespecieVM : ViewModel(), KoinComponent {
  val caracteristicasespecieModel: MutableLiveData<CaracteristicasespecieModel> =
      MutableLiveData(CaracteristicasespecieModel())

  var navArguments: Bundle? = null
}
