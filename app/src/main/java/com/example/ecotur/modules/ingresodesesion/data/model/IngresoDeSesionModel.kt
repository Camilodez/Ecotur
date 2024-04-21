package com.example.ecotur.modules.ingresodesesion.`data`.model

import com.example.ecotur.R
import com.example.ecotur.appcomponents.di.MyApp
import kotlin.String

data class IngresoDeSesionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUsuario: String? = MyApp.getInstance().resources.getString(R.string.lbl_usuario)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContrasea: String? = MyApp.getInstance().resources.getString(R.string.lbl_contrase_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecuperar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_problemas_al_ingresar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null
)
