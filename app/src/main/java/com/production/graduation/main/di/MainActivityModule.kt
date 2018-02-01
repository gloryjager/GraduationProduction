package com.production.graduation.main.di

import android.support.v4.app.FragmentActivity
import dagger.Module
import dagger.Provides
import net.kentaku.core.di.ActivityScope

/**
 * Created by student on 2018/02/01.
 */
@Module()
class MainActivityModule( private var activity: FragmentActivity) {
    @Provides
    @ActivityScope
    fun providesActivity(): FragmentActivity {
        return activity
    }
}