package com.example.demonavigation.view.fragment

import android.view.View
import com.example.demonavigation.R
import com.example.demonavigation.databinding.M000MenuFrgBinding
import com.example.demonavigation.databinding.M001SmsFrgBinding
import com.example.demonavigation.view.viewmodel.MenuViewModel
import com.example.demonavigation.view.viewmodel.SMSViewModel

class M001SMSFragment : BaseFragment<M001SmsFrgBinding, SMSViewModel>() {

    companion object {
        val TAG = M001SMSFragment::class.java.name
    }

    override fun initViews() {
        binding!!.tvSetup.setOnClickListener(this)
    }

    override fun doClickView(v: View?) {
        if(v!!.id==R.id.tv_setup){

        }
    }
    override fun initBinding(mRootView: View): M001SmsFrgBinding? {
        return M001SmsFrgBinding.bind(mRootView)
    }

    override fun getViewModelClass(): Class<SMSViewModel> {
        return SMSViewModel::class.java
    }

    override fun getLayoutId(): Int {
        return R.layout.m001_sms_frg
    }
}