package com.example.ecotur.modules.ecodex.ui

import android.view.View
import androidx.activity.viewModels
import com.example.ecotur.R
import com.example.ecotur.appcomponents.base.BaseActivity
import com.example.ecotur.databinding.ActivityEcodexBinding
import com.example.ecotur.modules.ecodex.`data`.model.UserprofileRowModel
import com.example.ecotur.modules.ecodex.`data`.viewmodel.EcodexVM
import com.example.ecotur.modules.ecodex.ui.UserprofileAdapter
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
