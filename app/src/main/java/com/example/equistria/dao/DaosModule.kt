package com.example.equistria.dao

import com.example.equistria.model.AppDatabase
import org.koin.dsl.module

val DaosModule = module {
    single { get(AppDatabase::class.java).chevalDao() }
}