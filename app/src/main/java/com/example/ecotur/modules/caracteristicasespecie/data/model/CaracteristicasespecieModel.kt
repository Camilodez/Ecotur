package com.example.ecotur.modules.caracteristicasespecie.`data`.model

import com.example.ecotur.R
import com.example.ecotur.appcomponents.di.MyApp
import kotlin.String

data class CaracteristicasespecieModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tinam_chic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombretwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dendrocygna_autumnalis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFotografascoun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_30_fotograf_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtObservacionesCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_400_observaciones)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etDescriptionValue: String? = null
)
