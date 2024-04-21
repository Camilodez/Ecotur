package com.mariajosesapplication.app.modules.panelgeneral.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariajosesapplication.app.modules.panelgeneral.`data`.model.PanelGeneralModel
import org.koin.core.KoinComponent

class PanelGeneralVM : ViewModel(), KoinComponent {
  val panelGeneralModel: MutableLiveData<PanelGeneralModel> = MutableLiveData(PanelGeneralModel())

  var navArguments: Bundle? = null
}
