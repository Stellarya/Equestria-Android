package com.example.equistria.viewmodel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel { ChevalListViewModel(get()) }
    /*viewModel { AutreViewModel(get(), get()) }*/
}