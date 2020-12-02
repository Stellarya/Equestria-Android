package com.example.equistria.vue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.equistria.R
import com.example.equistria.viewmodel.ChevalListViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

// TODO : navigation component fragment
class ListeChevauxActivity : AppCompatActivity() {

    private val chevalListViewModel: ChevalListViewModel by viewModel()

    /*private val autreViewModel: AutreViewModel by viewModel()*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liste_chevaux)

        // TODO : afficher un loader dans la layout
        chevalListViewModel.getAll().observe(this, { lstChevaux ->
            // TODO : remplir le layout avec les chevaux
            // TODO : masquer le loader
        })
    }
}