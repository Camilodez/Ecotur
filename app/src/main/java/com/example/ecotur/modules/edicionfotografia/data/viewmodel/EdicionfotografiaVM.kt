package com.mariajosesapplication.app.modules.edicionfotografia.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariajosesapplication.app.modules.edicionfotografia.`data`.model.EdicionfotografiaModel
import org.koin.core.KoinComponent

class EdicionfotografiaVM : ViewModel(), KoinComponent {
  val edicionfotografiaModel: MutableLiveData<EdicionfotografiaModel> =
      MutableLiveData(EdicionfotografiaModel())

  var navArguments: Bundle? = null
}
