package com.production.graduation.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import com.production.graduation.R
import com.production.graduation.home.HomeFragment
import net.kentaku.core.di.ActivityScope
import javax.inject.Inject

/**
 * Created by student on 2018/02/01.
 */
@ActivityScope
class Navigator @Inject constructor(
        private val activity: FragmentActivity
        ){

    private val fragmentManager: FragmentManager by lazy {
        activity.supportFragmentManager
    }

    private fun switchFragment(fragment: Fragment, addToBackstack: Boolean = true) {
        fragmentManager
                .beginTransaction()
                .apply {
                    replace(R.id.container, fragment.apply {
                    })
                    if (addToBackstack) addToBackStack(null)
                }
                .commit()
    }

    fun showHomeScreen() {
        switchFragment(HomeFragment.newInstance(), false)

        // shared preferenceの掃除
//        allStores.map {
//            it.clear()
//        }
    }


}
