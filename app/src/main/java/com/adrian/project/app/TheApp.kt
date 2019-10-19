package com.adrian.project.app

import com.adrian.project.di.DaggerApplicationComponent
import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class TheApp : DaggerApplication() {

//    @Inject
//    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
//
//    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndroidInjector

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }

    override fun onCreate() {
        super.onCreate()

        Stetho.initializeWithDefaults(this)

        Timber.plant(Timber.DebugTree())

//        DaggerApplicationComponent
//            .builder()
//            .application(this)
//            .build()
//            .inject(this)
    }
}
