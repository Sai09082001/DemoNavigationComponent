package com.example.demonavigation.view.act

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseAct<V : ViewBinding> : AppCompatActivity() {
    protected var binding: V? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rootView: View = LayoutInflater.from(this).inflate(getLayoutId(), null)
        setContentView(rootView)
        binding = initBinding(rootView)
        initViews()
    }

    abstract fun initViews()

    abstract fun initBinding(rootView: View): V?

    abstract fun getLayoutId(): Int

}