package com.mariajosesapplication.app.modules.ecodex.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariajosesapplication.app.modules.ecodex.`data`.model.EcodexModel
import com.mariajosesapplication.app.modules.ecodex.`data`.model.UserprofileRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EcodexVM : ViewModel(), KoinComponent {
  val ecodexModel: MutableLiveData<EcodexModel> = MutableLiveData(EcodexModel())

  var navArguments: Bundle? = null

  val userprofileList: MutableLiveData<MutableList<UserprofileRowModel>> =
      MutableLiveData(mutableListOf())
}
