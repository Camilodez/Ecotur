package com.mariajosesapplication.app.modules.edicionfotografia.`data`.model

import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EdicionfotografiaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNombreOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_post)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocacin: String? = MyApp.getInstance().resources.getString(R.string.lbl_locaci_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMencin: String? = MyApp.getInstance().resources.getString(R.string.lbl_menci_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodospueden: String? =
      MyApp.getInstance().resources.getString(R.string.msg_todos_pueden_ver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompartira: String? =
      MyApp.getInstance().resources.getString(R.string.msg_compartir_a_otra)

)
