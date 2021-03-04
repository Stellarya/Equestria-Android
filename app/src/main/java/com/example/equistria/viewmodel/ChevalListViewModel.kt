package com.example.equistria.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.equistria.model.Cheval
import com.example.equistria.repository.ChevalRepository
import java.time.LocalDate

class ChevalListViewModel(
    private val chevalRepository: ChevalRepository
) : ViewModel() {

    /*fun getAll() = liveData {
        val lstCheval = chevalRepository.getAll()
        emit(lstCheval)
    }*/

    fun getAll(): LiveData<List<Cheval>> {
        val lstCheval = MutableLiveData<List<Cheval>>()
        lstCheval.postValue(listOf(
            Cheval(nom = "Petit nuage d'été"),
            Cheval(nom = "Spirit", poids = 500, reproducteur = true, sterile = false, robe = "isabelle", race = "mustang", taille = 150, sexe = "mâle", dateNaissance = LocalDate.of(2001,"may",23))
        ))
        return lstCheval
    }
}