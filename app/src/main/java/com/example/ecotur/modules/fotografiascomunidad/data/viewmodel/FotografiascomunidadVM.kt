package com.mariajosesapplication.app.modules.fotografiascomunidad.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariajosesapplication.app.modules.fotografiascomunidad.`data`.model.FotografiascomunidadModel
import org.koin.core.KoinComponent

class FotografiascomunidadVM : ViewModel(), KoinComponent {
  val fotografiascomunidadModel: MutableLiveData<FotografiascomunidadModel> =
      MutableLiveData(FotografiascomunidadModel())

  var navArguments: Bundle? = null
}
