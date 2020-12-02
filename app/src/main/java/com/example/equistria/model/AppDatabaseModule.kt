package com.example.equistria.model

import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val AppDatabaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "equistria_db"
        ).build()
    }
}