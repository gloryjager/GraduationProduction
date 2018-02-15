package com.production.graduation.home.di

import dagger.Module
import dagger.Provides
import net.kentaku.core.di.FragmentScope


/**
 * Created by student on 2018/02/15.
 */
@Module
class HomeModule(){
    @FragmentScope
    @Provides
    fun providesHomeText() : String{
        return "home222222"
    } 
}