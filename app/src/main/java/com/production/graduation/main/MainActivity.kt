package com.production.graduation.main;

import android.app.ActivityManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.production.graduation.App
import com.production.graduation.R
import com.production.graduation.main.di.MainActivityComponent
import com.production.graduation.main.di.MainActivityModule
import javax.inject.Inject
import android.R.attr.fragment
import com.production.graduation.home.HomeFragment


class MainActivity : AppCompatActivity() {

    lateinit var component: MainActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {

        component = (application as App).applicationComponent
                .newMainActivityComponent(mainActivityModule = MainActivityModule(
                        activity = this
                ))
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val transaction = supportFragmentManager.beginTransaction()
        // 1つだけなので、念のためreplaceを使用します
        transaction.replace(R.id.container, HomeFragment.newInstance())
        // 最後にcommitします
        transaction.commit()
    }

    @Inject
    lateinit var navigator: Navigator

    override fun onResume() {
        super.onResume()
        navigator.showHomeScreen()

    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
}
