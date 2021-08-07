package com.example.demonavigation.view.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.example.demonavigation.R
import com.example.demonavigation.view.viewmodel.BaseViewModel

abstract class BaseFragment<K : ViewBinding, V : BaseViewModel> : Fragment(), View.OnClickListener{
    lateinit var mContext: Context
    lateinit var mRootView: View
    var mData: Any? = null
    lateinit var mViewModel: V
    protected var binding: K? = null

    fun <T : View> findViewById(id: Int): T? {
        return findViewById(id, null)
    }

    fun <T : View> findViewById(id: Int, event: View.OnClickListener?): T? {
        val v: T? = mRootView.findViewById(id)
        if (event != null) {
            v?.setOnClickListener(event)
        }
        return v
    }

    final override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = inflater.inflate(getLayoutId(), container, false)
        mViewModel = ViewModelProvider(this).get(getViewModelClass())
        binding = initBinding(mRootView)
        initViews()
        return mRootView
    }

    final override fun onClick(v: View?) {
        v?.startAnimation(AnimationUtils.loadAnimation(mContext, R.anim.abc_popup_enter))
        doClickView(v)
    }

    open fun doClickView(v: View?) {
        TODO("Not yet implemented")
    }

    abstract fun initViews()

    abstract fun initBinding(mRootView: View): K?

    abstract fun getViewModelClass(): Class<V>

    protected abstract fun getLayoutId(): Int

}