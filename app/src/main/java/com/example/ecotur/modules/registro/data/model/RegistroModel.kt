package com.example.ecotur.modules.registro.`data`.model

import com.example.ecotur.R
import com.example.ecotur.appcomponents.di.MyApp
import kotlin.String

data class RegistroModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUsuario: String? = MyApp.getInstance().resources.getString(R.string.lbl_usuario)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCorreoelectr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_correo_electr_nico)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContrasea: String? = MyApp.getInstance().resources.getString(R.string.lbl_contrase_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVuelvea: String? = MyApp.getInstance().resources.getString(R.string.msg_vuelve_a_colocar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegistro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ya_tienes_una_cuenta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailvalueOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailvalueValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguage1Value: String? = null
)
