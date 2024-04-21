package com.example.ecotur.modules.edicionperfil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ecotur.modules.edicionperfil.`data`.model.EdicionperfilModel
import org.koin.core.KoinComponent

class EdicionperfilVM : ViewModel(), KoinComponent {
  val edicionperfilModel: MutableLiveData<EdicionperfilModel> =
      MutableLiveData(EdicionperfilModel())

  var navArguments: Bundle? = null
}
