package com.mariajosesapplication.app.modules.fotografiascomunidad.`data`.model

import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FotografiascomunidadModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tus_fotograf_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_2023_05_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombrefive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_era_un_d_a_soleado)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreoneOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ltimas_fotograf_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombretwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_usuariofot_grafo01)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate1: String? = MyApp.getInstance().resources.getString(R.string.lbl_2024_05_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombrefour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_era_un_d_a_soleado)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombretwoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_usuariofot_grafo01)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2024_05_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombrefourOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_era_un_d_a_soleado)

)
