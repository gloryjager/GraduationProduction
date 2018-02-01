/*
 * Copyright (C) Daito Trust Construction Co., Ltd. All Rights Reserved.
 */

package net.kentaku.app.di

import com.production.graduation.App
import dagger.Component
import dagger.android.AndroidInjectionModule
import net.kentaku.core.di.ApplicationScope


/**
 * Created by tsuyosh on 17/11/06.
 */
@ApplicationScope
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        ApplicationModule::class
))
interface ApplicationComponent {
    fun inject(application: App)

//    ,
//    ActivityResultStoreModule::class


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

//    fun newMainActivityComponent(
//            mainActivityModule: MainActivityModule,
//            googleApiClientModule: GoogleApiClientModule
//    ): MainActivityComponent

//    fun newModalActivityComponent(
//            modalActivityModule: ModalActivityModule
//    ): ModalActivityComponent
//
//    fun inject(service: AppFirebaseInstanceIdService)
//    fun inject(service: AppFirebaseMessagingService)
}