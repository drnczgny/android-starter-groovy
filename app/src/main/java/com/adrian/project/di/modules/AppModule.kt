package com.adrian.project.di.modules

import com.adrian.project.app.TheApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(theApp: TheApp) = theApp

}
