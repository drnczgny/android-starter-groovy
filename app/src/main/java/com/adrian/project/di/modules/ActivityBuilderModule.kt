package com.adrian.project.di.modules

import com.adrian.project.MainActivity
import com.adrian.project.di.scope.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @PerActivity
    @ContributesAndroidInjector(
        modules = [
            FragmentBuilderModule::class
//            MainModule::class,
//            DashboardFragmentBuilderModule::class
//            Feature2FragmentBuilderModule::class
        ]
    )

    abstract fun bindMainActivity(): MainActivity
}
