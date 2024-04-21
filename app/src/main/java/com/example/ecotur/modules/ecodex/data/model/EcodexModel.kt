package com.example.ecotur.modules.ecodex.`data`.model

import com.example.ecotur.R
import com.example.ecotur.appcomponents.di.MyApp
import kotlin.String

data class EcodexModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFauna: String? = MyApp.getInstance().resources.getString(R.string.lbl_fauna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiltros: String? = MyApp.getInstance().resources.getString(R.string.lbl_filtros)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOtros: String? = MyApp.getInstance().resources.getString(R.string.lbl_otros)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEspeciesvistas: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_especies_vistas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEspeciesno: String? =
      MyApp.getInstance().resources.getString(R.string.msg_especies_no_vistas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBsqueda: String? = MyApp.getInstance().resources.getString(R.string.lbl_b_squeda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etAvistamientosCoValue: String? = null
)
