package com.example.ecotur.modules.ecodex.`data`.model

import com.example.ecotur.R
import com.example.ecotur.appcomponents.di.MyApp
import kotlin.String

data class UserprofileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_tinam_chic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dendrocygna_autumnalis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescripcin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ave_furtiva_casi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserAvistamient: String? =
      MyApp.getInstance().resources.getString(R.string.msg_avistamientos_400)

)
