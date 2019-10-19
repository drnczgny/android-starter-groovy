package com.adrian.project.di.modules

import com.adrian.project.MainFragment
import com.adrian.project.di.scope.PerFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    internal abstract fun bindMainFragment(): MainFragment

}
