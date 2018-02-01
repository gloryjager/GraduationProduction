package com.production.graduation.main.di

import com.production.graduation.home.di.HomeComponent
import com.production.graduation.main.MainActivity
import dagger.Subcomponent
import net.kentaku.core.di.ActivityScope

/**
 * Created by student on 2018/02/01.
 */
@ActivityScope
@Subcomponent(
        modules = arrayOf(MainActivityModule::class)
)
interface MainActivityComponent {
    fun inject(activity: MainActivity)

    fun newHomeComponent(): HomeComponent
}