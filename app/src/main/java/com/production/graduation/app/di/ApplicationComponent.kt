/*
 * Copyright (C) Daito Trust Construction Co., Ltd. All Rights Reserved.
 */

package net.kentaku.app.di

import com.production.graduation.App
import com.production.graduation.main.di.MainActivityComponent
import com.production.graduation.main.di.MainActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import net.kentaku.core.di.ApplicationScope


/**
 * Created by tsuyosh on 17/11/06.
 */
@ApplicationScope
@Component(modules = arrayOf(
        ApplicationModule::class
))
interface ApplicationComponent {
    fun inject(application: App)
    fun newMainActivityComponent(mainActivityModule: MainActivityModule): MainActivityComponent

//    ,
//    ActivityResultStoreModule::class


//    AndroidInjectionModule::class,

//    AndroidInjectionModule::class,
//    ApplicationModule::class,
//    ApiModule::class,
//    PrefectureRepositoryModule::class,
//    PropertyRepositoryModule::class,
//    TextBuilderModule::class,
//    TraderRepositoryModule::class,
//    ActivityResultStoreModule::class,
//    TrainRepositoryModule::class,
//    InquiryRepositoryModule::class,
//    DatabaseModule::class,
//    BannerRepositoryModule::class


//    fun newModalActivityComponent(
//            modalActivityModule: ModalActivityModule
//    ): ModalActivityComponent
//
//    fun inject(service: AppFirebaseInstanceIdService)
//    fun inject(service: AppFirebaseMessagingService)
}