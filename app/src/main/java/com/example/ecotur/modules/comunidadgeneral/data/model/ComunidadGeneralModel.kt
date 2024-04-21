package com.example.ecotur.modules.comunidadgeneral.`data`.model

import com.example.ecotur.R
import com.example.ecotur.appcomponents.di.MyApp
import kotlin.String

data class ComunidadGeneralModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFiltros: String? = MyApp.getInstance().resources.getString(R.string.lbl_filtros)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlora: String? = MyApp.getInstance().resources.getString(R.string.lbl_flora)
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
  var txtBsqueda: String? = MyApp.getInstance().resources.getString(R.string.lbl_b_squeda)
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
  var txtNombreOne: String? =
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
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_2024_05_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombrefive: String? = MyApp.getInstance().resources.getString(R.string.lbl_tiram_chic)
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
      MyApp.getInstance().resources.getString(R.string.msg_usuariofot_grafo02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate1: String? = MyApp.getInstance().resources.getString(R.string.lbl_2024_05_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombrefiveOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_iguaza_com_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNombrefourOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_era_un_d_a_soleado)

)
