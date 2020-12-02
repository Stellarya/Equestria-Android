package com.example.equistria.viewmodel

import org.koin.dsl.module

val ViewModelModule = module {
    single { ChevalListViewModel(get()) }
    /*single { AutreViewModel(get(), get()) }*/
}