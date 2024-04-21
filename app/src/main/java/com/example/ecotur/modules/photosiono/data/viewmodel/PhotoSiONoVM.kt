package com.example.ecotur.modules.photosiono.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ecotur.modules.photosiono.`data`.model.PhotoSiONoModel
import org.koin.core.KoinComponent

class PhotoSiONoVM : ViewModel(), KoinComponent {
  val photoSiONoModel: MutableLiveData<PhotoSiONoModel> = MutableLiveData(PhotoSiONoModel())

  var navArguments: Bundle? = null
}
