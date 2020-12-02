package com.example.equistria.viewmodel

import androidx.lifecycle.liveData
import com.example.equistria.repository.ChevalRepository

class ChevalListViewModel(
    private val chevalRepository: ChevalRepository
) {

    fun getAll() = liveData {
        val lstCheval = chevalRepository.getAll()
        emit(lstCheval)
    }
}