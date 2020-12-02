package com.example.equistria.repository

import org.koin.dsl.module

val RepositoryModule = module {
    single { ChevalRepository(get()) }
    /*single { AutreRepository(get(), get()) }*/
}