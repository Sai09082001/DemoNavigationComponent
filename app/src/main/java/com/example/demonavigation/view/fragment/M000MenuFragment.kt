package com.example.demonavigation.view.fragment

import android.view.View
import androidx.navigation.fragment.NavHostFragment
import com.example.demonavigation.R
import com.example.demonavigation.databinding.M000MenuFrgBinding
import com.example.demonavigation.view.viewmodel.MenuViewModel


class M000MenuFragment : BaseFragment<M000MenuFrgBinding, MenuViewModel>() {

    companion object {
        const val KEY_SHOW_PHONE = "KEY_SHOW_PHONE"
        const val KEY_SHOW_SMS = "KEY_SHOW_SMS"
        val TAG = M000MenuFragment::class.java.name
    }

    override fun initViews() {
        binding!!.frameMessage.setOnClickListener(this)
        binding!!.framePhone.setOnClickListener(this)
    }

    override fun doClickView(v: View?) {
        if(v!!.id == R.id.frame_message){
            NavHostFragment.findNavController(this).navigate(R.id.smsFragment)
        }else if(v!!.id == R.id.frame_phone){
            NavHostFragment.findNavController(this).navigate(R.id.phoneFragment)
        }
    }

    override fun initBinding(mRootView: View): M000MenuFrgBinding? {
        return M000MenuFrgBinding.bind(mRootView)
    }

    override fun getViewModelClass(): Class<MenuViewModel> {
        return MenuViewModel::class.java
    }

    override fun getLayoutId(): Int {
        return R.layout.m000_menu_frg
    }
}