package com.adrian.project.di

import com.adrian.project.app.TheApp
import com.adrian.project.di.modules.ActivityBuilderModule
import com.adrian.project.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: TheApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(theApp: TheApp): Builder

        fun build(): ApplicationComponent
    }
}
