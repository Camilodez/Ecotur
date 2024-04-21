package com.mariajosesapplication.app.modules.panelgeneral.`data`.model

import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PanelGeneralModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTemperature: String? =
      MyApp.getInstance().resources.getString(R.string.msg_d_a_lluvioso_7_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_200_especies_vistas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRachade: String? = MyApp.getInstance().resources.getString(R.string.msg_racha_de_20_d_as)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFauna: String? = MyApp.getInstance().resources.getString(R.string.lbl_fauna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.msg_20_especies_vistas2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlora: String? = MyApp.getInstance().resources.getString(R.string.lbl_flora2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.msg_10_especies_vistas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreOne: String? = MyApp.getInstance().resources.getString(R.string.msg_ltima_fotograf_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_2023_05_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombrefive: String? = MyApp.getInstance().resources.getString(R.string.lbl_tiram_chic)

)
