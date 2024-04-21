package com.mariajosesapplication.app.modules.ecodex.ui

import android.view.View
import androidx.activity.viewModels
import com.mariajosesapplication.app.R
import com.mariajosesapplication.app.appcomponents.base.BaseActivity
import com.mariajosesapplication.app.databinding.ActivityEcodexBinding
import com.mariajosesapplication.app.modules.ecodex.`data`.model.UserprofileRowModel
import com.mariajosesapplication.app.modules.ecodex.`data`.viewmodel.EcodexVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EcodexActivity : BaseActivity<ActivityEcodexBinding>(R.layout.activity_ecodex) {
  private val viewModel: EcodexVM by viewModels<EcodexVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val userprofileAdapter =
    UserprofileAdapter(viewModel.userprofileList.value?:mutableListOf())
    binding.recyclerUserprofile.adapter = userprofileAdapter
    userprofileAdapter.setOnItemClickListener(
    object : UserprofileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UserprofileRowModel) {
        onClickRecyclerUserprofile(view, position, item)
      }
    }
    )
    viewModel.userprofileList.observe(this) {
      userprofileAdapter.updateData(it)
    }
    binding.ecodexVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerUserprofile(
    view: View,
    position: Int,
    item: UserprofileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ECODEX_ACTIVITY"

  }
}
