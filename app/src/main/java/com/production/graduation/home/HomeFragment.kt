package com.production.graduation.home

import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.production.graduation.R
import com.production.graduation.base.BaseFragment
import com.production.graduation.databinding.FragmentHomeBinding
import com.production.graduation.home.di.HomeComponent
import com.production.graduation.main.MainActivity

/**
 * Created by student on 2018/02/01.
 */

class HomeFragment() : BaseFragment<HomeViewModel>(){
    private lateinit var component: HomeComponent
    private lateinit var binding: FragmentHomeBinding

    companion object {
        fun newInstance() : HomeFragment{
            return HomeFragment().apply {
                arguments = Bundle()
            }
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        component = (activity as MainActivity).component
                .newHomeComponent()
        component.inject(this)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        return binding.root
    }
}