package com.production.graduation.home.di

import com.production.graduation.home.HomeFragment
import dagger.Subcomponent
import net.kentaku.core.di.FragmentScope

/**
 * Created by student on 2018/02/01.
 */
@FragmentScope
@Subcomponent(modules = arrayOf(HomeModule::class))
interface HomeComponent {
    fun inject(fragment: HomeFragment)
}
