/*
 * Copyright (C) Daito Trust Construction Co., Ltd. All Rights Reserved.
 */

package net.kentaku.app.di

import android.content.Context
import android.content.SharedPreferences
import android.content.res.AssetManager
import com.production.graduation.App
import dagger.Module
import dagger.Provides
import net.kentaku.core.di.ApplicationScope

/**
 * Created by tsuyosh on 17/11/06.
 */
@Module
class ApplicationModule(private val application: App) {
    @ApplicationScope
    @Provides
    fun providesContext(): Context = application.applicationContext

    @ApplicationScope
    @Provides
    fun providesAssetManager(): AssetManager {
        return application.assets
    }

    @ApplicationScope
    @Provides
    fun providesSharedPreferences(): SharedPreferences {
        return application.getSharedPreferences("preferences", Context.MODE_PRIVATE)
    }
}