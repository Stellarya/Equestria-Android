package com.example.equistria

import android.app.Application
import com.example.equistria.dao.DaosModule
import com.example.equistria.model.AppDatabaseModule
import com.example.equistria.repository.RepositoryModule
import com.example.equistria.viewmodel.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()

            androidContext(this@MainApplication)

            androidFileProperties()

            modules(
                AppDatabaseModule,
                DaosModule,
                RepositoryModule,
                ViewModelModule
            )
        }
    }
}