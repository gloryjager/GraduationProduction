package com.production.graduation

import android.app.Application
import android.content.Context
import android.util.Log
import net.kentaku.app.di.ApplicationComponent
import net.kentaku.app.di.ApplicationModule
import net.kentaku.app.di.DaggerApplicationComponent

/**
 * Created by student on 2018/01/29.
 */
class App : Application() {

    lateinit var applicationComponent: ApplicationComponent

    private var defaultUEH: Thread.UncaughtExceptionHandler? = null
    // handler listener
    private val _unCaughtExceptionHandler = Thread.UncaughtExceptionHandler { thread, ex ->
        defaultUEH!!.uncaughtException(thread, ex)
    }


    init {
        defaultUEH = Thread.getDefaultUncaughtExceptionHandler()

        // setup handler for uncaught exception
        Thread.setDefaultUncaughtExceptionHandler(_unCaughtExceptionHandler)
    }


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
//        MultiDex.install(this)
    }

//    private val callback = object : ActivityLifecycleCallbacks {
//        override fun onActivityPaused(p0: Activity?) {
//        }
//
//        override fun onActivityResumed(p0: Activity?) {
//            Fox.trackSession()
//        }
//
//        override fun onActivityStarted(p0: Activity?) {
//        }
//
//        override fun onActivityDestroyed(p0: Activity?) {
//        }
//
//        override fun onActivitySaveInstanceState(p0: Activity?, p1: Bundle?) {
//        }
//
//        override fun onActivityStopped(p0: Activity?) {
//        }
//
//        override fun onActivityCreated(p0: Activity?, p1: Bundle?) {
//        }
//    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build();
    }

}