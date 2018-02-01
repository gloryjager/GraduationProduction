package com.production.graduation.base

import android.os.Bundle
import android.support.v4.app.Fragment
import javax.inject.Inject

/**
 * Created by student on 2018/02/01.
 */

abstract class BaseFragment<VM : BaseViewModel> : Fragment() {
    @Inject
    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.create()
    }

    override fun onStart() {
        super.onStart()
        viewModel.start()
    }

    override fun onStop() {
        viewModel.stop()
        super.onStop()
    }


    override fun onDestroy() {
        viewModel.destroy()
        super.onDestroy()
    }
}