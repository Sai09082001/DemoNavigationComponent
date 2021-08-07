package com.example.demonavigation.view.fragment

import android.view.View
import com.example.demonavigation.R
import com.example.demonavigation.databinding.M001SmsFrgBinding
import com.example.demonavigation.databinding.M002PhoneFrgBinding
import com.example.demonavigation.view.viewmodel.PhoneViewModel
import com.example.demonavigation.view.viewmodel.SMSViewModel

class M002PhoneFragment : BaseFragment<M002PhoneFrgBinding, PhoneViewModel>() {

    companion object {
        val TAG = M002PhoneFragment::class.java.name
    }

    override fun initViews() {
        binding!!.tvSetup.setOnClickListener(this)
    }

    override fun doClickView(v: View?) {
        if(v!!.id==R.id.tv_setup){

        }
    }
    override fun initBinding(mRootView: View): M002PhoneFrgBinding? {
        return M002PhoneFrgBinding.bind(mRootView)
    }

    override fun getViewModelClass(): Class<PhoneViewModel> {
        return PhoneViewModel::class.java
    }

    override fun getLayoutId(): Int {
        return R.layout.m002_phone_frg
    }
}